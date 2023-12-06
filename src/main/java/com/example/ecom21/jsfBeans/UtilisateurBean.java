package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.UtilisateurDao;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Date;
import java.util.List;


@Named
@RequestScoped
public class UtilisateurBean {
    @Inject
    UtilisateurDao utilisateurDao;
    private long utilisateurId;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String password;
    private List<Long> commandeIds; // Assuming a list of associated command IDs

    // Default constructor
    public UtilisateurBean() {
    }

    // Getter and Setter methods

    public long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Long> getCommandeIds() {
        return commandeIds;
    }

    public void setCommandeIds(List<Long> commandeIds) {
        this.commandeIds = commandeIds;
    }

    // You can add more methods or custom logic as needed
}
