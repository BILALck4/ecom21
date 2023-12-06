package com.example.ecom21.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Vitrine")
@Table(name = "vitrine")
public class Vitrine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "vitrine_id")
    private Long vitrine_id;

    private String nom;

    boolean estActive;


    @ManyToMany(mappedBy = "vitrines")
    public Set<Produit> produits;

}
