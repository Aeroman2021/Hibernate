package com.project.model;


import com.project.model.entity.CategoryIsMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private CategoryIsMain is_main;
    private int hasChild;
    private int childCount;

    @OneToMany(mappedBy = "parentCat",fetch = FetchType.LAZY)
    private Set<Category> childCat;

    @ManyToOne
    @JoinColumn(name="parent_id",nullable = false)
    private Category parentCat;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<Product> products;


}
