/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.mundo;

import com.umariana.instrumentosMusicales.datos.ClienteDAO;
import com.umariana.instrumentosMusicales.datos.InstrumentoDAO;
import com.umariana.instrumentosMusicales.datos.VentaDAO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Tienda {

    private ArrayList instrumentos;
    private ArrayList clientes;
    private ClienteDAO clienteDao;
    private InstrumentoDAO instrumentoDao;
    private VentaDAO ventaDao;

    public Tienda() {
        instrumentos = new ArrayList();
        clientes = new ArrayList();
        clienteDao = new ClienteDAO();
        instrumentoDao = new InstrumentoDAO();
        ventaDao = new VentaDAO();
        setClientes(clienteDao.consultar());
        setInstrumentos(instrumentoDao.consultar());
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = (Cliente)clientes.get(i);
            c.setCompras(ventaDao.consultar());
        }
    }

    public ArrayList getInstrumentos() {
        return instrumentos;
    }

    public ArrayList getClientes() {
        return clientes;
    }

    public void setInstrumentos(ArrayList instrumentos) {
        this.instrumentos = instrumentos;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(String identificacion, String nombre, String apellido, int edad) throws Exception {
        Cliente cliente = buscarCliente(identificacion);
        if (cliente != null) {
            throw new Exception("El cliente ya existe");
        }
        Cliente nuevo = new Cliente(identificacion, nombre, apellido, edad);
        clientes.add(nuevo);
        clienteDao.crearCliente(nuevo);
    }

    public void agregarInstrumento(String referencia, String nomInstrumento, String marcaInstrumento, int costoInstrumento, int cantidad) throws Exception {
        Instrumento instrumento = buscarInstrumento(referencia);
        if (instrumento != null) {
            throw new Exception("El instrumento: " + referencia + "\n ya existe");
        }
        Instrumento nuevo = new Instrumento(referencia, nomInstrumento, marcaInstrumento, costoInstrumento, cantidad);
        instrumentos.add(nuevo);
        instrumentoDao.crearInstrumento(nuevo);
    }

    public Instrumento buscarInstrumento(String referencia) {
        Instrumento miInstrumento = null;
        for (int i = 0; i < instrumentos.size(); i++) {
            Instrumento ins = (Instrumento) instrumentos.get(i);
            if (ins.getReferencia().equals(referencia)) {
                miInstrumento = ins;
            }
        }
        return miInstrumento;
    }

    public void eliminarCliente(String identificacion) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = (Cliente) clientes.get(i);
            if (cli.getIdentificacion().equals(identificacion)) {
                clientes.remove(i);
                ventaDao.eliminarVenta(identificacion);
                clienteDao.eliminarCliente(identificacion);
            }
        }
    }

    public void eliminarInstrumento(String referencia) {
        for (int i = 0; i < instrumentos.size(); i++) {
            Instrumento ins = (Instrumento) instrumentos.get(i);
            if (ins.getReferencia().equals(referencia)) {
                instrumentos.remove(i);
                instrumentoDao.eliminarInstrumento(referencia);
            }
        }
    }

    public Cliente buscarCliente(String identificacion) {
        Cliente miCliente = null;
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = (Cliente) clientes.get(i);
            if (cli.getIdentificacion().equals(identificacion)) {
                miCliente = cli;
            }
        }
        return miCliente;
    }

    public ArrayList darListaClientes() {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = (Cliente) clientes.get(i);
            lista.add(cli.getIdentificacion() + ": " + cli.getNombre() + " " + cli.getApellido() + " -> " + cli.getEdad());
        }
        return lista;
    }

    public ArrayList darListaInstrumentos() {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < instrumentos.size(); i++) {
            Instrumento ins = (Instrumento) instrumentos.get(i);
            lista.add(ins.getMarcaInstrumento() + " " + ins.getReferencia() + ": " + ins.getNomInstrumento() + " -> " + ins.getCostoInstrumento() + " Disponibles: " + ins.getCantidad());
        }
        return lista;
    }

    public void agregarVenta(String referenciaIns, String identi, int cantidad) throws Exception {
        Instrumento ins = buscarInstrumento(referenciaIns);
        Cliente cli = buscarCliente(identi);
        int c = ins.getCantidad() - cantidad;
        if (c >= 0) {
            Venta nu = new Venta(new Date(), ins.getNomInstrumento(), cantidad, referenciaIns);
        cli.agregarCompra(nu);
            ins.setCantidad(c);
            ventaDao.crearVenta(nu, identi);
            instrumentoDao.agregarCantidad(referenciaIns, c);
        } else {
            throw new Exception("No hay suficientes disponibles solo: " + ins.getCantidad());
        }
    }

    public void agregarCantidad(int cantidad, String referencia) {
        Instrumento ins = buscarInstrumento(referencia);
        int c = ins.getCantidad() + cantidad;
        ins.setCantidad(c);
        instrumentoDao.agregarCantidad(referencia, c);
    }

    public Instrumento darMasVendido() throws Exception {
        Instrumento ins = null;
        int ins1 = 0;
        int mayor = 0;
        for (int i = 0; i < instrumentos.size(); i++) {
            Instrumento instrumento = (Instrumento) instrumentos.get(i);
            for (int j = 0; j < clientes.size(); j++) {
                Cliente c = (Cliente) clientes.get(j);
                for (int k = 0; k < c.getCompras().size(); k++) {
                    Venta v = (Venta) c.getCompras().get(k);
                    if (instrumento.getReferencia().equals(v.getReferenciaInstrumentoVenta())) {
                        ins1 += v.getCantidadVendida();
                    }
                }

            }
            if (ins1 > mayor) {
                mayor = ins1;
                ins = instrumento;
            }
            ins1 = 0;
        }
        if (mayor == 0) {
            throw new Exception("No se ha realizado ninguna venta hasta el momento");
        }
        return ins;
    }

    public Instrumento darMenosVendido() throws Exception {
        Instrumento ins = null;
        int ins1 = 0;
        int menor = 0;
        boolean ven = false;
        for (int i = 0; i < instrumentos.size(); i++) {
            Instrumento instrumento = (Instrumento) instrumentos.get(i);
            for (int j = 0; j < clientes.size(); j++) {
                Cliente c = (Cliente) clientes.get(j);
                for (int k = 0; k < c.getCompras().size(); k++) {
                    Venta v = (Venta) c.getCompras().get(k);
                    if (instrumento.getReferencia().equals(v.getReferenciaInstrumentoVenta())) {
                        ins1 += v.getCantidadVendida();
                        ven = true;
                    }
                }
            }
            if(i==0)
            {
                menor = ins1;
            }
            if (ins1 <= menor) {
                menor = ins1;
                ins = instrumento;
            }
            ins1 = 0;
        }

        if (!ven) {
            throw new Exception("No se ha realizado ninguna venta hasta el momento");
        }
        return ins;
    }

}
