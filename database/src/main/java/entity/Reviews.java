package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Reviews")  // Corrected spelling here
public class Reviews {
    @Id
    @GeneratedValue
    @Column(name = "review_id")  // Corrected spelling here
    private UUID identifier;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}