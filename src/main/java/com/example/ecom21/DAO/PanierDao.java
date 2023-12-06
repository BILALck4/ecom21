package com.example.ecom21.DAO;

import com.example.ecom21.entities.Panier;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;



public interface PanierDao {
    Panier findById(Long id);

    List<Panier> findAll();

    void save(Panier panier);

    void update(Panier panier);

    void delete(Long id);
}
