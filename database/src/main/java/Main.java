import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.Date;
import java.util.Set;
import entity.Reviews;
public class Main {
    public static void main(String[] args) {
        try (StandardServiceRegistry standardServiceRegistry =
                     new StandardServiceRegistryBuilder().configure().build();

             SessionFactory sessionFactory = new MetadataSources(standardServiceRegistry)
                     .buildMetadata()
                     .buildSessionFactory();
             Session session = sessionFactory.openSession()
        ){
            Transaction transaction = session.getTransaction();
            transaction.begin();

            // Creating Providers
            Provider provider1 = Provider.builder().name_company("SuperComputer").country("Ukraine").build();
            Provider provider2 = Provider.builder().name_company("Tehnical").country("France").build();
            Provider provider3 = Provider.builder().name_company("ElectronTech").country("USA").build();
            Provider provider4 = Provider.builder().name_company("TechMaster").country("Germany").build();
            session.persist(provider3);
            session.persist(provider4);
            session.persist(provider1);
            session.persist(provider2);

            // Creating Categories
            Categories category1 = Categories.builder().name_categories("Computer").description( "The \"Computer\" category " +
                    "covers a wide range of goods and services " + "related to computer equipment " +
                    "and information technologies. This category includes goods and services that " +
                    "include a variety of computer systems, peripherals, software, " +
                    "and maintenance and support services.").build();


            Categories category2 = Categories.builder().name_categories("Appliances").description("\n" +
                    "Категорія \"Побутова Техніка\" (Appliances) включає в себе широкий асортимент побутових приладів та технічних " +
                    "рішень, спрямованих на полегшення рутинних щоденних завдань та підвищення комфорту в домашньому середовищі. " +
                    "У цій категорії представлені високоякісні електронні пристрої та технологічні вироби, спроектовані для вдосконалення" +
                    " різних аспектів домашнього господарювання.").build();
            Categories category3 = Categories.builder().name_categories("Products for gamers").description("These are the latest " +
                    "and most effective products to satisfy the needs of serious gamers").build();
            Categories category4 = Categories.builder().name_categories("Home Appliances").description("Home appliances for modern living").build();
            session.persist(category3);
            session.persist(category4);
            session.persist(category1);
            session.persist(category2);

            // Creating Products
            Product product1 = Product.builder()
                    .name_product("Computer ARTLINE Gaming X47")
                    .description("The ARTLINE Gaming X47v45 gaming PC is built on the ASRock A320M-DVS motherboard platform with AM4 socket and " +
                            "support for AMD processors of all generations of Ryzen. Features ASRock Full Spike Protection technology, which " +
                            "covers a range of engineering solutions to protect against electrical overload, corrosion and other problems. " +
                            "As well as a set of all modern interfaces and ports (USB 3.1 Gen1, Gigabit Ethernet) and much more.")
                    .price(27999.99)
                    .stock_quality(10)
                    .providers(Set.of(provider1, provider2))
                    .categories(Set.of(category1))
                    .build();

            Product product2 = Product.builder()
                    .name_product("PC Tower")
                    .description("New Tower gaming PC based on a 6-core AMD Ryzen 5 3600 processor and nVidia GeForce RTX 4060 Ti 8 GB discrete" +
                            " graphics card for gaming and multimedia work")
                    .price(36787.99)
                    .stock_quality(5)
                    .providers(Set.of(provider2))
                    .categories(Set.of(category1))
                    .build();
            Product product3 = Product.builder()
                    .name_product("Smartphone X Pro")
                    .description("High-performance smartphone with advanced features and top-notch camera capabilities.")
                    .price(1299.99)
                    .stock_quality(20)
                    .providers(Set.of(provider1))
                    .categories(Set.of(category1))
                    .build();

            Product product4 = Product.builder()
                    .name_product("Smart Home Hub")
                    .description("Central hub for managing smart home devices, providing seamless integration and automation.")
                    .price(499.99)
                    .stock_quality(15)
                    .providers(Set.of(provider1))
                    .categories(Set.of(category1))
                    .build();
            session.persist(product1);
            session.persist(product2);
            session.persist(product3);
            session.persist(product4);
            // Creating Users
            User user1 = User.builder()
                    .name("ChipiChipi")
                    .password("pass1234f")
                    .Date(new Date())
                    .total_amount_buy(10000.0)
                    .bonus_card(1000)
                    .build();

            User user2 = User.builder()
                    .name("ChapaChapa")
                    .password("pass234535")
                    .Date(new Date())
                    .total_amount_buy(1500.0)
                    .bonus_card(150)
                    .build();
            User user3 = User.builder()
                    .name("GamerMaster")
                    .password("gamer123")
                    .Date(new Date())
                    .total_amount_buy(5000.0)
                    .bonus_card(500)
                    .build();

            User user4 = User.builder()
                    .name("TechGeek")
                    .password("tech567")
                    .Date(new Date())
                    .total_amount_buy(7500.0)
                    .bonus_card(800)
                    .build();

            User user5 = User.builder()
                    .name("Speedster")
                    .password("speed999")
                    .Date(new Date())
                    .total_amount_buy(3000.0)
                    .bonus_card(300)
                    .build();

            User user6 = User.builder()
                    .name("ProPlayer")
                    .password("pro456")
                    .Date(new Date())
                    .total_amount_buy(12000.0)
                    .bonus_card(1200)
                    .build();

            session.persist(user1);
            session.persist(user2);
            session.persist(user3);
            session.persist(user4);
            session.persist(user5);
            session.persist(user6);
            // Creating BonusPoints
            BonusPoints bonusPoints1 = BonusPoints.builder().points(10).build();
            BonusPoints bonusPoints2 = BonusPoints.builder().points(15).build();

            user1.setBonusPoints(bonusPoints1);
            user2.setBonusPoints(bonusPoints2);

            session.persist(bonusPoints1);
            session.persist(bonusPoints2);

            // Creating Reviews
            Reviews review1 = Reviews.builder().rating(4).comment("Good product").user(user1).build();
            Reviews review2 = Reviews.builder().rating(5).comment("Excellent service").user(user2).build();
            Reviews review3 = Reviews.builder().rating(3).comment("Solid performance, but some room for improvement").user(user3).build();
            Reviews review4 = Reviews.builder().rating(4).comment("Fast delivery and great customer support").user(user4).build();

            session.persist(review1);
            session.persist(review2);
            session.persist(review3);
            session.persist(review4);
            // Creating Orders
            Orders order1 = Orders.builder().order_status("Shipped").product(product1).order_date(new Date()).user(user1).build();
            Orders order2 = Orders.builder().order_status("Processing").product(product2).order_date(new Date()).user(user2).build();

            session.persist(order1);
            session.persist(order2);

            // Creating Favorites
            Favorites favorites1 = Favorites.builder().user(user1).build();
            Favorites favorites2 = Favorites.builder().user(user2).build();

            session.persist(favorites1);
            session.persist(favorites2);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}