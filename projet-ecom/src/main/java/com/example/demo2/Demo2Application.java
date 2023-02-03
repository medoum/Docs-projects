package com.example.demo2;

import com.example.demo2.dao.CategoryRepository;
import com.example.demo2.dao.ProduitRepository;
import com.example.demo2.model.Category;
import com.example.demo2.model.Produit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository, ProduitRepository produitRepository){
        return args -> {
            Random random = new Random();
            List.of("computer", "Printer", "Smatphone").forEach(cat ->{
                Category category=Category.builder().nom(cat).build();
                categoryRepository.save(category);
            });
            categoryRepository.findAll().forEach(category -> {
                for (int i = 0; i < 10; i++) {
                    Produit produit = Produit.builder()
                            .id(UUID.randomUUID().toString())
                            .nom("Computer"+i)
                            .prix(100+Math.random()*5000)
                            .quantite(random.nextInt(100))
                            .category(category)
                            .build();

                    produitRepository.save(produit);
                }
            });
        };
    }

}
