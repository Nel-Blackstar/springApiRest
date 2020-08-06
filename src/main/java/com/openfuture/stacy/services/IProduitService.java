package com.openfuture.stacy.services;

import java.util.List;


import com.openfuture.stacy.entities.Produit;


public interface IProduitService {
	
	List<Produit> getProduits();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(Long id);

}
