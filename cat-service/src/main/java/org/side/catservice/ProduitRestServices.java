package org.side.catservice;

import org.side.catservice.dao.ProduitRepository;
import org.side.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//pour creer un web service sans passer par spring data il faut restController
//pour but de creer des méthodes un peu complexe
@RestController
public class ProduitRestServices {
    @Autowired
    private ProduitRepository produitRepository;
    @GetMapping(value = "/listProduits/{id}")
    public Produit listProduits(@PathVariable(name="id") Long id){
       return produitRepository.findById(id).get();
    }
    //pour la mise à jour d'un produit
    @PutMapping(value = "/listProduits/{id}")
    public Produit update(@PathVariable(name="id") Long id, @RequestBody Produit p){
        p.setId(id);
        return produitRepository.save(p);
    }
    //pour enregistrer
    @PostMapping(value = "/listProduits")
    public Produit save(@RequestBody Produit p){
        return produitRepository.save(p);
    }
    //pour supprimer
    @DeleteMapping(value = "/listProduits/{id}")
    public void delete(@PathVariable(name="id") Long id){

      produitRepository.deleteById(id);
    }
}
