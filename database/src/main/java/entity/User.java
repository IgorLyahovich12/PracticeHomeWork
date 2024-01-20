package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User  {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "registration_date")
    private Date Date;

    @Column(name = "total_purchase_amount")
    private double total_amount_buy;

    @Column(name = "bonus_card")
    private int bonus_card;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Favorites> favorites = new LinkedHashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bonus_id", referencedColumnName = "bonus_id")
    private BonusPoints bonusPoints;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Reviews> reviews = new LinkedHashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Orders> orders = new LinkedHashSet<>();

}
