package org.side.catservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
//pour qu'il soit entité jpa on a besoin de @entity
@Entity
//avec data on a pas besoin de getters +constructeur avec parametre+
//d'autre sans paramétre
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit implements Serializable {
//entité Id pour l'identifiant + leurs géneration auto-increment
   @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String designation;
private double price;
private int quantite;

}
