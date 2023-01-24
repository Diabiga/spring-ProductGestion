package com.produits.demo.Reposoterie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.produits.demo.model.Produit;


@RepositoryRestResource(path = "rest")

public interface ProduitRepo extends JpaRepository<Produit, Long> {

	
	List<Produit> findByNomProduit(String nom);

	List<Produit> findByNomProduitContains(String nom);
	
	@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);
	
	List<Produit>findByOrderByNomProduitDesc();
	List<Produit>findByOrderByNomProduitAsc();

	
}
