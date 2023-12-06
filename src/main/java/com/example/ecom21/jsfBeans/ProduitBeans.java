package com.example.ecom21.jsfBeans;

import com.example.ecom21.DAO.ProduitDao;
import com.example.ecom21.entities.Produit;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped

public class ProduitBeans {



        // JPA Code injection

        @Inject
        ProduitDao produitDao ;

        private Long id;

    private String Nom_produit;

    private String prixU;

    int quantiteEnStock;

    private String description;

        public void setId(Long id) {
            this.id = id;
        }

        public String getNom_produit() {
            return Nom_produit;
        }

        public void setNom_produit(String nom) {
            this.Nom_produit = nom;
        }



        // actions

        public void save(){

            produitDao.save(new Produit( this.Nom_produit , this.prixU, this.quantiteEnStock, this.description));
        }

        public List<Produit> Produits(){

            return produitDao.getAll();
        }


        public void delete(Long id ){
            produitDao.delete( produitDao.getOne(id) );
        }
        


}
