package com.produits.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.produits.demo.Service.CategorieService;
import com.produits.demo.Service.ProduitService;
import com.produits.demo.model.Categorie;
import com.produits.demo.model.Produit;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ProduitRESTController {
	
	

	
	
	
	
	
	@Autowired
	ProduitService  produitService ;
	
	
	
	@RequestMapping(value="/listall",method=RequestMethod.GET)
	List<Produit> GetallProduit(){
		return produitService.getAllProduits();
	
	}
	
	@RequestMapping(value="/listsid/{id}",method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {
		
	try {
	return produitService.getProduit(id);}
	catch (Exception e) {
	return null;
	 }
	}
	
	@RequestMapping(value="/enregistrer",method = RequestMethod.POST)
	
	public Produit createProduit(@RequestBody Produit produit) {
	return produitService.saveProduit(produit);
	}
	
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
	return produitService.updateProduit(produit);
	}

	@RequestMapping(value="/supprimer/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		try {
			
			produitService.deleteProduitById(id);
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	

}
