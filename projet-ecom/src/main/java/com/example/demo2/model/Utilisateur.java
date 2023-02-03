//package com.example.demo2.model;
//
//import jakarta.persistence.*;
//
//// Entités d'un utilisateur normal
//@Entity
//@Table(name = "utilisateurs")
//public class Utilisateur {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @Column(nullable = false)
//    private String email;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Embedded
//    private Adresse adresseLivraison;
//
//    @Embedded
//    private Adresse adresseFacturation;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Adresse getAdresseLivraison() {
//        return adresseLivraison;
//    }
//
//    public void setAdresseLivraison(Adresse adresseLivraison) {
//        this.adresseLivraison = adresseLivraison;
//    }
//
//    public Adresse getAdresseFacturation() {
//        return adresseFacturation;
//    }
//
//    public void setAdresseFacturation(Adresse adresseFacturation) {
//        this.adresseFacturation = adresseFacturation;
//    }
//
//}