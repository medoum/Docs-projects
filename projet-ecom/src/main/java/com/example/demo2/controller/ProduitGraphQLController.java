package com.example.demo2.controller;

import com.example.demo2.dao.ProduitRepository;
import com.example.demo2.model.Produit;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProduitGraphQLController {
    private ProduitRepository produitRepository;

    public ProduitGraphQLController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    @QueryMapping
    public List<Produit> produitList(){
        return produitRepository.findAll();
    }
    @QueryMapping
    public Produit produitById(@Argument String id){
        return produitRepository.findById(id).orElseThrow(
                () -> new RuntimeException(String.format("Produit %s not found", id))
        );
    }
}
