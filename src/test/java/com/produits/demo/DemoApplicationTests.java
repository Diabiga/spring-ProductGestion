package com.produits.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.produits.demo.Reposoterie.CategorieRepo;
import com.produits.demo.Reposoterie.ProduitRepo;
import com.produits.demo.model.Categorie;
import com.produits.demo.model.Produit;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProduitRepo produitRepository;
	
	@Autowired
	private CategorieRepo soro;
	
	@Test
	public void testCreateProduit() {
	Categorie prod = new Categorie("smart phone","haut game");
	soro.save(prod);
	}
	
	/*
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("ASUS",3000.500,new Date());
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Produit p = produitRepository.findById(1L).get(); 
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepository.save(p);
	}

	
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(2L);;
	}
	
	@Test
	public void selectAll()
	{
	List<Produit> prod=produitRepository.findAll();	
	for(Produit p: prod) {
		System.out.println(p);
	}
	}
	
	@Test
	public void findbyNamedesc() {
		
		List <Produit> prod = produitRepository.findByOrderByNomProduitDesc();
		for( Produit p:prod) {
			System.out.println(p);
		}
	}
	
	@Test
	public void findbyNameAsc() {
		
		List <Produit> prod = produitRepository.findByOrderByNomProduitAsc();
		for( Produit p:prod) {
			System.out.println(p);
		}
	}
	*/
	

}
