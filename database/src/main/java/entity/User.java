package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AppUser")
public final class User  {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "registration_date")
    private LocalDate Date;

    @Column(name = "total_purchase_amount")
    private double total_amount_buy;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Favorites> favorites ;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "bonus_id", referencedColumnName = "bonus_id")
    private  BonusPoints bonusPoints;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Reviews> reviews ;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Orders> orders ;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "user")
    private Set<ShoppingCart> shoppingCarts;

}
