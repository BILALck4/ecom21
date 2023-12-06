package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.CommandeDao;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class CommandeBean {

    @Inject
    CommandeDao commandeDao;
    private Long commandeId;
    private String nom;
    private String prixTotal;
    private Long panierId; // Assuming a single associated panier ID
    private Long utilisateurId; // Assuming a single associated utilisateur ID

    // Default constructor
    public CommandeBean() {
    }

    // Getter and Setter methods

    public Long getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(Long commandeId) {
        this.commandeId = commandeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(String prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Long getPanierId() {
        return panierId;
    }

    public void setPanierId(Long panierId) {
        this.panierId = panierId;
    }

    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    // You can add more methods or custom logic as needed
}
