package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.PanierDao;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class PanierBean {

    @Inject
    PanierDao panierDao;

    private Long panierId;
    private String nom;
    private String prixTotal;
    private String description;
    private Long commandeId; // Assuming a single associated command ID
    private List<Long> articleIds; // Assuming a list of associated article IDs

    // Default constructor
    public PanierBean() {
    }

    // Getter and Setter methods

    public Long getPanierId() {
        return panierId;
    }

    public void setPanierId(Long panierId) {
        this.panierId = panierId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(Long commandeId) {
        this.commandeId = commandeId;
    }

    public List<Long> getArticleIds() {
        return articleIds;
    }

    public void setArticleIds(List<Long> articleIds) {
        this.articleIds = articleIds;
    }

    // You can add more methods or custom logic as needed
}

