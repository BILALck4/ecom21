package com.example.ecom21.DaoImpl;
import com.example.ecom21.DAO.CommandeDao;
import com.example.ecom21.entities.Commande;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
@RequestScoped
@ManagedBean
public class CommandeDaoIml implements CommandeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Commande findById(Long id) {
        return entityManager.find(Commande.class, id);
    }

    @Override
    public List<Commande> findAll() {
        return entityManager.createQuery("SELECT c FROM Commande c", Commande.class)
                .getResultList();
    }

    @Override
    public void save(Commande commande) {
        entityManager.persist(commande);
    }

    @Override
    public void update(Commande commande) {
        entityManager.merge(commande);
    }

    @Override
    public void delete(Long id) {
        Commande commande = findById(id);
        if (commande != null) {
            entityManager.remove(commande);
        }
    }
}
