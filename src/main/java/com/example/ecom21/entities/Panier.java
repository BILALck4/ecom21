package com.example.ecom21.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Panier")
@Table(name = "Panier")
public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "panier_id")
    private Long panier_id;

    private String nom;

    private String prix_total;

    private String description;

    @OneToOne
    @JoinColumn(name = "commande_id")
    public Commande commande;

    @OneToMany
    @JoinColumn(name = "panier_id")
    public List<Article> articles;

}
