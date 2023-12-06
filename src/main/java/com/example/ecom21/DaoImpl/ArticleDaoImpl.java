package com.example.ecom21.DaoImpl;

import com.example.ecom21.DAO.ArticleDao;
import com.example.ecom21.entities.Article;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
@RequestScoped
@ManagedBean
public class ArticleDaoImpl implements ArticleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Article findById(Long id) {
        return entityManager.find(Article.class, id);
    }

    @Override
    public List<Article> findAll() {
        return entityManager.createQuery("SELECT a FROM Article a", Article.class)
                .getResultList();
    }

    @Override
    public void save(Article article) {
        entityManager.persist(article);
    }

    @Override
    public void update(Article article) {
        entityManager.merge(article);
    }

    @Override
    public void delete(Long id) {
        Article article = findById(id);
        if (article != null) {
            entityManager.remove(article);
        }
    }
}
