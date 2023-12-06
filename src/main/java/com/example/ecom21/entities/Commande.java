package com.example.ecom21.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Commande")
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "commande_id")
    private Long commande_id;

    private String nom;

    private String prix_total;

    @OneToOne
    @JoinColumn(name = "commande_id")
    public Panier panier;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    public Utilisateur utilisateur;


}
