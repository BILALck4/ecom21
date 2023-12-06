package com.example.ecom21.DaoImpl;

import com.example.ecom21.DAO.ProduitDao;
import com.example.ecom21.entities.Produit;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

    @RequestScoped
    @ManagedBean// Add this annotation to mark it as a repository
    public class ProduitDaoIml implements ProduitDao {  // Renamed to use "Impl" at the end

    @PersistenceContext
    private EntityManager entityManager;

    public Produit findById(Long id) {
        return entityManager.find(Produit.class, id);
    }

    public List<Produit> findAll() {
        return entityManager.createQuery("SELECT p FROM Produit p", Produit.class)
                .getResultList();
    }

    public void save(Produit produit) {
        entityManager.persist(produit);
    }

    public void update(Produit produit) {
        entityManager.merge(produit);
    }

    public void delete(Long id) {
        Produit produit = findById(id);
        if (produit != null) {
            entityManager.remove(produit);
        }
    }

        @Override
        public List<Produit> getAll() {
            return null;
        }

        @Override
        public Long getOne(Long id) {
            return null;
        }
    }
