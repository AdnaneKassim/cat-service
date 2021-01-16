package org.side.catservice.dao;

import org.side.catservice.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

//jpa repository interface basé sur spring data
//pour creer web service on deux methodes soit personalisé en utilisant web controller soit methode de spring data base
@RepositoryRestResource //springdata
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // on va ajouter une methode pour la recherche
    @RestResource(path = "/byDesignation")
    public List<Produit> findByDesignationContains(String des);

}
