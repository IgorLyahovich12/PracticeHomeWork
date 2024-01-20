package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Categories")
public class Categories {
    @Id
    @GeneratedValue
    @Column(name = "categories_id")
    private UUID identifier;

    @Column(name = "name_categories")
    private String name_categories;

    @Column(name = "description",length = 10000)
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new LinkedHashSet<>();

}
