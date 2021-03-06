/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.web.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.models.Ofertas;
import com.api.rest.services.OfertasService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
//Mapeia as requisições de localhost:8080/nfe/
@RequestMapping("/ofertas/")
public class OfertasController {
    //Por padrão todas as requisições respondem com o status code 200 success
    
    @Autowired
    private OfertasService ofertaService;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/all",
        //Mapeia as requisições GET para localhost:8080/ofertas/findAll
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<Ofertas> findAll(){
        return ofertaService.findAll();
    }
    
   /*  @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/destaque/{r}",
        //Mapeia as requisições GET para localhost:8080/destaque/
        //recebendo periodo  como @PathVariable e o tipo como RequestParam
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    /*public List<Ofertas> getFilterStatus(@PathVariable(value = "r") Boolean r){
        return ofertaService.findStatus(r);
    }*/
}
