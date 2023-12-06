package com.example.ecom21.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.ecom21.entities.Commande;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Utilisateur")
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "utilisateur_id")
    private long utilisateur_id;

    private String nom;

    private String prenom;

    public Date dateNaissance;
    private String email;
    private String password;

    @OneToMany
    @JoinColumn(name = "utilisateur_id")
    List<Commande> commandes;

}
