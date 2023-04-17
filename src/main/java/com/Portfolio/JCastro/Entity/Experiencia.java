package com.Portfolio.JCastro.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String imgE;
    private String periodoE;
    private String puestoE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String imgE, String periodoE, String puestoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.periodoE = periodoE;
        this.puestoE = puestoE;
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

    public String getImgE() {
        return imgE;
    }

    public void setImge(String imgE) {
        this.imgE = imgE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
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
