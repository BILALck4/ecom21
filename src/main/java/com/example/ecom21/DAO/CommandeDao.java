package com.example.ecom21.DAO;

import com.example.ecom21.entities.Commande;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;



public interface CommandeDao {
    Commande findById(Long id);

    List<Commande> findAll();

    void save(Commande commande);

    void update(Commande commande);

    void delete(Long id);
}

