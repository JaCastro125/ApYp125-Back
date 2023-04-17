package com.Portfolio.JCastro.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;
    @NotBlank
    private String periodoE;
    @NotBlank
    private String puestoE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String imgE, String periodoE, String puestoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.periodoE = periodoE;
        this.puestoE = puestoE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
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

    public void setPuesto(String puestoE) {
        this.puestoE = puestoE;
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
