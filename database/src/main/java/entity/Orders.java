package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private UUID id;

    @Column(name = "order_status")
    private String order_status;
    @ManyToOne
    @Column(name = "product_id")
    private Product product;

    @Column(name = "order_date")
    private Date order_date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
