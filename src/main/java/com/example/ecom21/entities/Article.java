package com.example.ecom21.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "Article")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "article_id")
    private Long article_id;

    private String nom;

    Date dateCreation;
    Date dateExpiration;
    @ManyToOne
    @JoinColumn(name = "panier_id")

    Panier panier;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    Produit produit;

}
