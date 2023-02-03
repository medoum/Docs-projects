package com.example.demo2.dao;

import com.example.demo2.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, String> {
    
}
