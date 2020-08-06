package com.openfuture.stacy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openfuture.stacy.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
