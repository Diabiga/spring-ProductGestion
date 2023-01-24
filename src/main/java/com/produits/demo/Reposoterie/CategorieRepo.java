package com.produits.demo.Reposoterie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.produits.demo.model.Categorie;



public interface CategorieRepo extends JpaRepository<Categorie, Long> {

}
