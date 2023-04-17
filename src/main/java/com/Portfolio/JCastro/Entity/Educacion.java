package com.Portfolio.JCastro.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String nombreE;
    private String descripcionE;
    private String tituloE;
    private String logoE;
    private String estadoE;
    private String periodoE;
    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String tituloE, String logoE, String estadoE, String periodoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE = tituloE;
        this.logoE = logoE;
        this.estadoE = estadoE;
        this.periodoE = periodoE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getLogoE() {
        return logoE;
    }

    public void setLogoE(String logoE) {
        this.logoE = logoE;
    }

    public String getEstadoE() {
        return estadoE;
    }

    public void setEstadoE(String estadoE) {
        this.estadoE = estadoE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }   
}
