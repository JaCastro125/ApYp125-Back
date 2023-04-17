package com.Portfolio.JCastro.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String logoE;
    @NotBlank
    private String estadoE;
    @NotBlank
    private String periodoE;
    
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String tituloE, String logoE, String estadoE, String periodoE) {
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
