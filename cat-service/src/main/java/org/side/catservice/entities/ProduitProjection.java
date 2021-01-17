package org.side.catservice.entities;

import org.springframework.data.rest.core.config.Projection;

//on a crée cette interface pour la projection s'applique à des classes
@Projection(name = "P1",types = Produit.class)
public interface ProduitProjection {
    public double getPrice();
    public String getDesignation();

}
