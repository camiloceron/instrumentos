/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.umariana.instrumentosMusicales.mundo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Cliente 
{
    private String identificacion;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList compras;

    public Cliente(String identificacion, String nombre, String apellido, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        compras = new ArrayList( );
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void agregarCompra(Venta nueva)
    {
        compras.add(new Venta(nueva.getFechaVenta(), nueva.getNombreInstrumetoVendido(), nueva.getCantidadVendida(), nueva.getReferenciaInstrumentoVenta()));
    }

    public ArrayList getCompras() {
        return compras;
    }

    public void setCompras(ArrayList compras) {
        this.compras = compras;
    }
     
     
    
}
