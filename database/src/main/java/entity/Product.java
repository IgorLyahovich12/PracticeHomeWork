package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public final class Product  {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private UUID identifier;

    @Column(name = "name_product")
    private String name_product;

    @Column(name = "description",length = 10000)
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "stock_quality")
    private int stock_quality;

    @ManyToMany
    @JoinTable(
            name = "Product_Provider",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "provider_id")
    )
    private Set<Provider> providers ;

    @ManyToMany
    @JoinTable(
            name = "Product_Categories",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id")
    )
    private Set<Categories> categories ;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, mappedBy = "product")
    private Set<Reviews> reviews ;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, mappedBy = "product")
    private Set<Favorites> favorites ;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "product")
    private Set<ShoppingCart> shoppingCarts;
}

