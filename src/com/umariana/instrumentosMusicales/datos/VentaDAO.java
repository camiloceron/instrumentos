/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.datos;

import com.umariana.instrumentosMusicales.mundo.Cliente;
import com.umariana.instrumentosMusicales.mundo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class VentaDAO {

    /**
     * atributo fachada para establecer la conexion a la BD
     */
    private FachadaDB fachada;
    private Statement stm;

    /**
     * Constructor de la clase
     */
    public VentaDAO() {
        fachada = new FachadaDB();
    }

    /**
     * metodo que permite agregar una venta
     */
    public int crearVenta(Venta v, String identi) {
        int agregado = -1;
        try {

            String fecha = String.valueOf(v.getFechaVenta().getYear()) + "-" + String.valueOf(v.getFechaVenta().getMonth() + "-" + String.valueOf(v.getFechaVenta().getDay()));
            Connection conxion = fachada.GetConnection();
            String miSql = "INSERT INTO venta ( fecha, nombre, cantidad, referencia, identificacion) VALUES ('" + fecha + "', '" + v.getNombreInstrumetoVendido() + "'," + v.getCantidadVendida() + ",'"
                    + v.getReferenciaInstrumentoVenta() + "','" + identi + "')";
            if (conxion != null) {

                Statement instruccion = (Statement) conxion.createStatement();
                agregado = ((java.sql.Statement) instruccion).executeUpdate(miSql);
                conxion.close();

            }
            fachada.desconectar(conxion);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return agregado;
    }

    /**
     * metodo que permite buscar una venta
     */
    public boolean buscarVenta(String ref) {
        boolean b = false;
        Connection miConexion = fachada.GetConnection();
        String sql = "select referencia from venta where referencia='" + ref + "'";
        if (miConexion != null) {
            try {
                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sql);
                while (tabla.next() && !b) {
                    b = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }

    /**
     * metodo que permite eliminar una venta
     */
    public void eliminarVenta(String id) {
        try {
            Connection miConexion = fachada.GetConnection();
            Statement s = (Statement) miConexion.createStatement();
            s.execute("DELETE FROM venta WHERE identificacion ='" + id + "'");
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList consultar() {

        ArrayList compras = new ArrayList();
        try {
            String sqlConsultar = "SELECT fecha, nombre, cantidad, referencia, identificacion FROM venta";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {

                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sqlConsultar);
                while (tabla.next()) {
                    Venta miC = new Venta(tabla.getDate("fecha"), tabla.getString("nombre"), tabla.getInt("cantidad"), tabla.getString("referencia"));
                    compras.add(miC);
                }
            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compras;
    }
}
