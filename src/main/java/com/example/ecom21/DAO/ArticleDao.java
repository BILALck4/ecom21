package com.example.ecom21.DAO;

import com.example.ecom21.entities.Article;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;


public interface ArticleDao {
    Article findById(Long id);
    List<Article> findAll();
    void save(Article article);
    void update(Article article);
    void delete(Long id);
}