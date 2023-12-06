package com.example.ecom21.DaoImpl;

import com.example.ecom21.DAO.UtilisateurDao;
import com.example.ecom21.entities.Utilisateur;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
@RequestScoped
@ManagedBean
public class UtilisateurDaoIml implements UtilisateurDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Utilisateur findById(String id) {
        return entityManager.find(Utilisateur.class, id);
    }

    @Override
    public List<Utilisateur> findAll() {
        return entityManager.createQuery("SELECT u FROM Utilisateur u", Utilisateur.class)
                .getResultList();
    }

    @Override
    public void save(Utilisateur utilisateur) {
        entityManager.persist(utilisateur);
    }

    @Override
    public void update(Utilisateur utilisateur) {
        entityManager.merge(utilisateur);
    }

    @Override
    public void delete(String id) {
        Utilisateur utilisateur = findById(id);
        if (utilisateur != null) {
            entityManager.remove(utilisateur);
        }
    }
}

