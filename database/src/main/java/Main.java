import entity.*;
import data.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = null;

        try(StandardServiceRegistry standardServiceRegistry =
                    new StandardServiceRegistryBuilder()
                            .configure()
                            .build();

            SessionFactory sessionFactory = new MetadataSources(standardServiceRegistry)
                    .buildMetadata()
                    .buildSessionFactory();
            Session session = sessionFactory.openSession()
        ){
            transaction = session.getTransaction();
            transaction.begin();

            Data.categoriesData().forEach(session::persist);
            Data.providerData().forEach(session::persist);

            List<Categories> categories = session.createQuery("from Categories", Categories.class).list();
            List<Provider> providers = session.createQuery("from Provider ", Provider.class).list();
            Data.productsData(categories,providers).forEach(session::persist);
            Data.BonusPointsData().forEach(session::persist);
            Data.usersData(Data.BonusPointsData()).forEach(session::persist);
            List<Product> products = session.createQuery("from Product ", Product.class).list();
            List<User> users = session.createQuery("from User ", User.class).list();
            Data.rewiewsData(users,products).forEach(session::persist);
            Data.favoritesData(users,products).forEach(session::persist);
            Data.ordersData(users,products).forEach(session::persist);
            Data.shoppingCartsData().forEach(session::persist);

            transaction.commit();

            transaction.begin();
            session.createQuery("from User", User.class)
                    .list().forEach(System.out::println);

            session.createQuery("from Orders", Orders.class)
                    .list().forEach(System.out::println);

            transaction.commit();

        } catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }

            System.err.println(e.getMessage());
        }
    }
}