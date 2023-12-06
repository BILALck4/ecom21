package com.example.ecom21.DAO;

import com.example.ecom21.entities.Vitrine;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;


public interface VitrineDao {

    void ajouterVitrine(Vitrine vitrine);
    void mettreAJourVitrine(Vitrine vitrine);
    void supprimerVitrine(Long vitrineId);
    Vitrine obtenirVitrineParId(Long vitrineId);
    List<Vitrine> obtenirToutesLesVitrines();
}
