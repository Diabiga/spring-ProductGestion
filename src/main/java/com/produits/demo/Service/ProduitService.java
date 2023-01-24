package com.produits.demo.Service;

import java.util.List;

import com.produits.demo.model.Categorie;
import com.produits.demo.model.Produit;

public interface ProduitService {
	
	public Produit saveProduit(Produit p);
	
	public Produit updateProduit(Produit p);
	
	public void deleteProduit(Produit p);
	
	public 	void deleteProduitById(Long id);
	
	public Produit getProduit(Long id);
	
	public List<Produit> getAllProduits();
	
	public List<Produit>findbyNomProduits(String nom);
	
	public List<Produit> findByNomProduit(String nom);
	public List<Produit> findByNomProduitContains(String nom);
	public List<Produit> findByNomPrix (String nom, Double prix);
	public 	List<Produit> findByCategorie (Categorie categorie);
	public 	List<Produit> findByCategorieIdCat(Long id);
	public List<Produit> findByOrderByNomProduitAsc();
	public List<Produit> trierProduitsNomsPrix();



}
