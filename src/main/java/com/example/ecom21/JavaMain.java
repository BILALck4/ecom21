package com.example.ecom21;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import com.example.ecom21.entities.*;

public class JavaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        // Create EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Perform database operations using the EntityManager
        // Close EntityManager
        entityManager.close();

        // Close EntityManagerFactory when your application shuts down
        entityManagerFactory.close();
    }

}
