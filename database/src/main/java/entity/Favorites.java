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
@Table(name = "Favorites")
public class Favorites {
    @Id
    @GeneratedValue
    @Column(name = "favorite_id")
    private UUID identifier;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}