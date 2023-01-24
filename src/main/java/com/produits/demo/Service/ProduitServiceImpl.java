package com.produits.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produits.demo.Reposoterie.ProduitRepo;
import com.produits.demo.model.Categorie;
import com.produits.demo.model.Produit;


@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitRepo produitRepository;
	
	@Override
	public Produit saveProduit(Produit p) {
			return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
	
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public List<Produit> findbyNomProduits(String nom) {
		List <Produit>  prod = produitRepository.findByNomProduit("PC Dell");
		return prod;
	}

	@Override
	public List<Produit> findByNomProduit(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		// TODO Auto-generated method stub
		return null;
	}

}
