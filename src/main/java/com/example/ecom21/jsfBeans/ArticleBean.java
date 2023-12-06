package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.ArticleDao;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Date;

@Named
@RequestScoped
public class ArticleBean {

    @Inject
    ArticleDao articleDao;
    private Long articleId;
    private String nom;
    private Date dateCreation;
    private Date dateExpiration;
    private Long panierId;
    private Long produitId;

    // Default constructor
    public ArticleBean() {
    }

    // Getter and Setter methods

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Long getPanierId() {
        return panierId;
    }

    public void setPanierId(Long panierId) {
        this.panierId = panierId;
    }

    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    // You can add more methods or custom logic as needed
}
