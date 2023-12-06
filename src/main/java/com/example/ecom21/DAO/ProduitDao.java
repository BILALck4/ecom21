package com.example.ecom21.DAO;

import com.example.ecom21.entities.Produit;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;

import java.util.List;


public interface ProduitDao {
    Produit findById(Long id);

    List<Produit> findAll();

    void save(Produit produit);

    void update(Produit produit);

    void delete(Long id);

    List<Produit> getAll();

    Long getOne(Long id);
}

