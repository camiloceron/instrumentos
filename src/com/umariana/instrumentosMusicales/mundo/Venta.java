/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.mundo;

import java.util.Date;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Venta {
    
    private Date fechaVenta;
    private String nombreInstrumetoVendido;
    private int cantidadVendida;
    private String referenciaInstrumentoVenta;

    public Venta(Date fechaVenta, String nombreInstrumetoVendido, int cantidadVendida, String referenciaInstrumentoVenta ) {
        this.fechaVenta = fechaVenta;
        this.nombreInstrumetoVendido = nombreInstrumetoVendido;
        this.cantidadVendida = cantidadVendida;
        this.referenciaInstrumentoVenta = referenciaInstrumentoVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombreInstrumetoVendido() {
        return nombreInstrumetoVendido;
    }

    public void setNombreInstrumetoVendido(String nombreInstrumetoVendido) {
        this.nombreInstrumetoVendido = nombreInstrumetoVendido;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getReferenciaInstrumentoVenta() {
        return referenciaInstrumentoVenta;
    }

    public void setReferenciaInstrumentoVenta(String referenciaInstrumentoVenta) {
        this.referenciaInstrumentoVenta = referenciaInstrumentoVenta;
    }
    
    
    
}
