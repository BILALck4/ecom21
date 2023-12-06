package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.VitrineDao;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Set;

@Named
@RequestScoped
public class VitrineBean {

    @Inject
    VitrineDao vitrineDao;
    private Long vitrineId;
    private String nom;
    private boolean estActive;
    private Set<Long> produitIds; // Assuming a set of associated product IDs

    // Default constructor
    public VitrineBean() {
    }

    // Getter and Setter methods

    public Long getVitrineId() {
        return vitrineId;
    }

    public void setVitrineId(Long vitrineId) {
        this.vitrineId = vitrineId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstActive() {
        return estActive;
    }

    public void setEstActive(boolean estActive) {
        this.estActive = estActive;
    }

    public Set<Long> getProduitIds() {
        return produitIds;
    }

    public void setProduitIds(Set<Long> produitIds) {
        this.produitIds = produitIds;
    }

    // You can add more methods or custom logic as needed
}
