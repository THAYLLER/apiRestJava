
package com.api.rest.services;

import java.util.List;

import com.api.rest.models.Ofertas;
        
public interface OfertasService {
    
    // escopo de todos os métodos criados no pack services
    Ofertas findStatus(final Boolean r);
    List<Ofertas> findAll();
}
