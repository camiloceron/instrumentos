/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.umariana.instrumentosMusicales.mundo;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Instrumento {
    
    private String referencia;
    private String nomInstrumento;
    private String marcaInstrumento;
    private int costoInstrumento;
    private int cantidad;

    public Instrumento(String referencia, String nomInstrumento, String marcaInstrumento, int costoInstrumento, int cantidad) {
        this.referencia = referencia;
        this.nomInstrumento = nomInstrumento;
        this.marcaInstrumento = marcaInstrumento;
        this.costoInstrumento = costoInstrumento;
        this.cantidad = cantidad;
    }   

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public String getNomInstrumento() {
        return nomInstrumento;
    }

    public void setNomInstrumento(String nomInstrumento) {
        this.nomInstrumento = nomInstrumento;
    }

    public String getMarcaInstrumento() {
        return marcaInstrumento;
    }

    public void setMarcaInstrumento(String marcaInstrumento) {
        this.marcaInstrumento = marcaInstrumento;
    }

    public int getCostoInstrumento() {
        return costoInstrumento;
    }

    public void setCostoInstrumento(int costoInstrumento) {
        this.costoInstrumento = costoInstrumento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}
