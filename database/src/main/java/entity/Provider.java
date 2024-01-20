package entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.Set;



@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Provider")
public class Provider {
    @Id
    @GeneratedValue
    @Column(name = "provider_id")
    private UUID identifier;

    @Column(name = "name_company")
    private String name_company;

    @Column(name = "country")
    private String country;

    @ManyToMany(mappedBy = "providers")
    private Set<Product> products = new LinkedHashSet<>();
}
