package com.api.rest.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ofertas implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String categoria;
    private String titulo;
    private String descricao_oferta;
    private String anunciante;
    private double valor;
    private boolean destaque;

    public Ofertas(Long id, String categoria, String titulo, String descricao_oferta, String anunciante, double valor, boolean destaque) {
        this.id = id;
        this.categoria = categoria;
        this.titulo = titulo;
        this.descricao_oferta = descricao_oferta;
        this.anunciante = anunciante;
        this.valor = valor;
        this.destaque = destaque;
    }

    public Ofertas() {
        this.id = null;
        this.categoria = "";
        this.titulo = "";
        this.descricao_oferta = "";
        this.anunciante = "";
        this.valor = 0;
        this.destaque = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao_oferta() {
        return descricao_oferta;
    }

    public void setDescricao_oferta(String descricao_oferta) {
        this.descricao_oferta = descricao_oferta;
    }

    public String getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(String anunciante) {
        this.anunciante = anunciante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }
    
    
}
