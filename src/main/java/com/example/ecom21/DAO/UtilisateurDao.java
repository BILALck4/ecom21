package com.example.ecom21.DAO;

import com.example.ecom21.entities.Utilisateur;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;


public interface UtilisateurDao {
    Utilisateur findById(String id);

    List<Utilisateur> findAll();

    void save(Utilisateur utilisateur);

    void update(Utilisateur utilisateur);

    void delete(String id);
}

