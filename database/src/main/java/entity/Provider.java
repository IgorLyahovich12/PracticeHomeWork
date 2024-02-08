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
@Table(name = "Provider")
public final class Provider {
    @Id
    @GeneratedValue
    @Column(name = "provider_id")
    private UUID identifier;

    @Column(name = "name_company")
    private String name_company;

    @Column(name = "country")
    private String country;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "providers")
    private Set<Product> products ;
}
