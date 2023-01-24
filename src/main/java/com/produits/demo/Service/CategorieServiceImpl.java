package com.produits.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produits.demo.Reposoterie.CategorieRepo;
import com.produits.demo.model.Categorie;


@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired(required=true)
     private CategorieRepo  categorieRepo ;

	@Override
	public Categorie saveCategorie(Categorie p) {
		
		return categorieRepo.save(p);
	}

	@Override
	public Categorie updateCategorie(Categorie p) {
		// TODO Auto-generated method stub
		return categorieRepo.save(p);
	}


	@Override
	public void deleteCategorie(Categorie p) {
		categorieRepo.delete(p);
		
	}

	@Override
	public void delateCategoriebyid(Long id) {
		categorieRepo.deleteById(id);
	}



	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return categorieRepo.findAll();
	}

	@Override
	public Categorie findById(Long id) {
		// TODO Auto-generated method stub
		return categorieRepo.findById(id).get();
	}

}
