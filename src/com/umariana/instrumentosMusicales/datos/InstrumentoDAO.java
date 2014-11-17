/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.datos;

import com.umariana.instrumentosMusicales.mundo.Instrumento;
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
public class InstrumentoDAO {
 
      /**
     * atributo fachada para establecer la conexion a la BD
     */
    private FachadaDB fachada;
    private Statement stm;

    /**
     * Constructor de la clase
     */
    public InstrumentoDAO() {
        fachada = new FachadaDB();
    }
    /**
     * metodo que permite agregar un instrumento
     */
    public int crearInstrumento(Instrumento ins) {
        int agregado = -1;
        try {
            Connection conxion = fachada.GetConnection();
            String miSql = "INSERT INTO instrumento ( referencia, nombre, marca, costo, cantidad) VALUES ('" + ins.getReferencia() + "', '" + ins.getNomInstrumento()+ "', '" + ins.getMarcaInstrumento() + "',"
                    + ins.getCostoInstrumento() + "," + ins.getCantidad()+ ")";
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
     * metodo que permite buscar un instrumento
     */
    public boolean buscarInstrumento(String xRef) {
        boolean b = false;
        Connection miConexion = fachada.GetConnection();
        String sql = "select referencia from instrumento where referencia='" + xRef + "'";
        if (miConexion != null) {
            try {
                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sql);
                while (tabla.next() && !b) {
                    b = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }
    /**
     * metodo que permite eliminar un instrumento
     */
    public void eliminarInstrumento(String ref) {
        try {
            Connection miConexion = fachada.GetConnection();
            Statement s = (Statement) miConexion.createStatement();
            s.execute("DELETE FROM instrumento WHERE referencia ='" + ref + "'");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * metodo que permite modificar un instrumento
     */
    public void modificarInstrumento(String ref, Instrumento ins) {

        try {
            String sql = "UPDATE instrumento SET nombre ='" + ins.getNomInstrumento() + "'" + ", marca ='" + ins.getMarcaInstrumento() + "'" + ", costo = " + ins.getCostoInstrumento()  + ", referencia = '" + ins.getReferencia() + "'" + ", cantidad = "+ ins.getCantidad()+ "WHERE referencia='" + ref + "'";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {
                Statement instruccion = (Statement) miConexion.createStatement();
                instruccion.executeUpdate(sql);
                miConexion.close();
                instruccion.close();
            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * metodo que permite modificar la cantidada de un instrumento
     */
     public void agregarCantidad(String ref, int cantidad) {

        try {
            String sql = "UPDATE instrumento SET cantidad =" + cantidad + " WHERE referencia='" + ref + "'";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {
                Statement instruccion = (Statement) miConexion.createStatement();
                instruccion.executeUpdate(sql);
                miConexion.close();
                instruccion.close();
            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       
        

public ArrayList consultar() {

        ArrayList istrumentos = new ArrayList();
        try {
            String sqlConsultar = "SELECT referencia, nombre, marca, costo, cantidad FROM instrumento";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {

                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sqlConsultar);
                while (tabla.next()) {

                  

                    Instrumento miIns = new Instrumento(tabla.getString("referencia"), tabla.getString("nombre"), tabla.getString("marca"), tabla.getInt("costo"), tabla.getInt("cantidad"));
                    istrumentos.add(miIns);
                }

            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return istrumentos;
    }
    
}
