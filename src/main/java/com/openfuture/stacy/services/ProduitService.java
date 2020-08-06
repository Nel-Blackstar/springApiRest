package com.openfuture.stacy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.openfuture.stacy.entities.Produit;
import com.openfuture.stacy.repositories.ProduitRepository;

@Service
@Primary
public class ProduitService implements IProduitService{

	@Autowired
	private ProduitRepository produitRepository;
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return this.produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		this.produitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		this.produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		this.produitRepository.delete(this.produitRepository.findById(id).get());
		
	}

}
