package com.example.ecom21.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Produit")
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "produit_id")
    private Long produit_id;

    private String Nom_produit;

    private String prixU;

    int quantiteEnStock;

    private String description;

    public Produit(String nomProduit, String prixU, int quantiteEnStock, String description) {
        this.Nom_produit = nomProduit;
        this.prixU = prixU;
        this.quantiteEnStock = quantiteEnStock;
        this.description = description;
    }

    @OneToMany
    @JoinColumn(name = "produit_id")
    public List<Article> articles;

    @ManyToMany
    @JoinTable(name = "Vit_prod", joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "vitrine_id"))
    public Set<Vitrine> vitrines;


}
