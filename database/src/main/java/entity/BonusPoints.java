package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BonusPoints")
public final class BonusPoints {
    @Id
    @GeneratedValue
    @Column(name = "bonus_id")
    private UUID identifier;

    @Column(name = "points")
    private int points;

    @OneToOne(mappedBy = "bonusPoints")
    private User user;

}
