package com.openfuture.stacy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.openfuture.stacy.entities.Produit;

@Service
public class ProduitServiceImpl implements IProduitService{
	
	private List<Produit> produits;
	
	

	public ProduitServiceImpl() {
		produits=new ArrayList<>();
		
		produits.add(new Produit("Livre",12,1200));
		produits.add(new Produit("Cahier",23,700));
		produits.add(new Produit("Stylo",12,1500));
	}

	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
	}

}
