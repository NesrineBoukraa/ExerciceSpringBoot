package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}