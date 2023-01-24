package com.produits.demo.Service;

import java.util.List;

import com.produits.demo.model.Categorie;


public interface CategorieService {
	
public Categorie saveCategorie(Categorie p);
	
public Categorie updateCategorie(Categorie p);
	
public void deleteCategorie(Categorie p);

public void delateCategoriebyid(Long id);

public List<Categorie> findAll();
public Categorie findById(Long id);


}
