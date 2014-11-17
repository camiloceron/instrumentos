/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.datos;

import com.umariana.instrumentosMusicales.mundo.Cliente;
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
public class ClienteDAO {
    
    /**
     * atributo fachada para establecer la conexion a la BD
     */
    private FachadaDB fachada;
    private Statement stm;

    /**
     * Constructor de la clase
     */
    public ClienteDAO() {
        fachada = new FachadaDB();
    }
    /**
     * metodo que permite agregar un cliente
     */
    public int crearCliente(Cliente c) {
        int agregado = -1;
        try {
            Connection conxion = fachada.GetConnection();
            String miSql = "INSERT INTO cliente ( identificacion, nombres, apellidos, edad) VALUES ('" + c.getIdentificacion() + "', '" + c.getNombre() + "', '" + c.getApellido() + "',"
                    + c.getEdad() + ")";
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
     * metodo que permite buscar un cliente
     */
    public boolean buscarCliente(String xId) {
        boolean b = false;
        Connection miConexion = fachada.GetConnection();
        String sql = "select identificacion from cliente where identificacion='" + xId + "'";
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
     * metodo que permite eliminar un cliente
     */
    public void eliminarCliente(String id) {
        try {
            Connection miConexion = fachada.GetConnection();
            Statement s = (Statement) miConexion.createStatement();
            s.execute("DELETE FROM cliente WHERE identificacion ='" + id + "'");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * metodo que permite modificar un cliente
     */
    public void modificarCliente(String identi, Cliente c) {

        try {
            String sql = "UPDATE cliente SET nombre ='" + c.getNombre() + "'" + ", apellido ='" + c.getApellido() + "'" + ", identificacion = '" + c.getIdentificacion() + "'" + ", edad = '" + c.getEdad() + "'" + "WHERE identificacion='" + identi + "'";
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

        ArrayList clientes = new ArrayList();
        try {
            String sqlConsultar = "SELECT identificacion, nombres, apellidos, edad FROM cliente";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {

                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sqlConsultar);
                while (tabla.next()) {

                  

                    Cliente miC = new Cliente(tabla.getString("identificacion"), tabla.getString("nombres"), tabla.getString("apellidos"), tabla.getInt("edad"));
                    clientes.add(miC);
                }

            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
}
