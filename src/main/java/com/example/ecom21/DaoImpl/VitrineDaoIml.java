package com.example.ecom21.DaoImpl;

import com.example.ecom21.DAO.VitrineDao;
import com.example.ecom21.entities.Vitrine;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@RequestScoped
@Named
public class VitrineDaoIml implements VitrineDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Vitrine findById(Long id) {
        return entityManager.find(Vitrine.class, id);
    }

    public List<Vitrine> findAll() {
        return entityManager.createQuery("SELECT v FROM Vitrine v", Vitrine.class).getResultList();
    }

    public void save(Vitrine vitrine) {
        entityManager.persist(vitrine);
    }

    public void update(Vitrine vitrine) {
        entityManager.merge(vitrine);
    }

    public void delete(Long id) {
        Vitrine vitrine = findById(id);
        if (vitrine != null) {
            entityManager.remove(vitrine);
        }
    }

    @Override
    public void ajouterVitrine(Vitrine vitrine) {

    }

    @Override
    public void mettreAJourVitrine(Vitrine vitrine) {

    }

    @Override
    public void supprimerVitrine(Long vitrineId) {

    }

    @Override
    public Vitrine obtenirVitrineParId(Long vitrineId) {
        return null;
    }

    @Override
    public List<Vitrine> obtenirToutesLesVitrines() {
        return null;
    }
}
