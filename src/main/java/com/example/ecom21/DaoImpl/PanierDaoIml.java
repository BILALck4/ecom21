package com.example.ecom21.DaoImpl;

import com.example.ecom21.DAO.PanierDao;
import com.example.ecom21.entities.Panier;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
@RequestScoped
@ManagedBean
public class PanierDaoIml implements PanierDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Panier findById(Long id) {
        return entityManager.find(Panier.class, id);
    }

    @Override
    public List<Panier> findAll() {
        return entityManager.createQuery("SELECT p FROM Panier p", Panier.class)
                .getResultList();
    }

    @Override
    public void save(Panier panier) {
        entityManager.persist(panier);
    }

    @Override
    public void update(Panier panier) {
        entityManager.merge(panier);
    }

    @Override
    public void delete(Long id) {
        Panier panier = findById(id);
        if (panier != null) {
            entityManager.remove(panier);
        }
    }
}

