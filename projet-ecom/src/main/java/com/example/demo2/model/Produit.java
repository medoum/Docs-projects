package com.example.demo2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Produit {
    @Id
    private String id;
    private String nom;
    private double prix;
    private int quantite;

    @ManyToOne
    private Category category;

}
