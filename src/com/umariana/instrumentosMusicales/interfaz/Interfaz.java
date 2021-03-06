/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umariana.instrumentosMusicales.interfaz;

import com.umariana.instrumentosMusicales.mundo.Cliente;
import com.umariana.instrumentosMusicales.mundo.Instrumento;
import com.umariana.instrumentosMusicales.mundo.Tienda;
import com.umariana.instrumentosMusicales.mundo.Venta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Interfaz extends javax.swing.JFrame {

    private DialogoAgregarInstrumento dialogoAgregarInstrumentos;
    private DialogoAgregarCliente dialogoAgregarCliente;
    private Tienda tienda;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        dialogoAgregarInstrumentos = new DialogoAgregarInstrumento(this);
        dialogoAgregarCliente = new DialogoAgregarCliente(this);
        tienda = new Tienda();
        setLocationRelativeTo(null);
        actualizarListaClientes();
        actualizarListaInstrumentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        btn_agregarIns = new javax.swing.JButton();
        btn_consultarIns = new javax.swing.JButton();
        btn_eliminarIns = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminarCli = new javax.swing.JButton();
        btn_agregarCli = new javax.swing.JButton();
        btn_consultarCli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCatalogo = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnAgrCantidad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INSTRUMENTOS MUSICALES");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("okkoplp");
        jPanel1.setName(""); // NOI18N

        btn_agregarIns.setText("Agregar");
        btn_agregarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarInsActionPerformed(evt);
            }
        });

        btn_consultarIns.setText("Consultar");
        btn_consultarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarInsActionPerformed(evt);
            }
        });

        btn_eliminarIns.setText("Eliminar");
        btn_eliminarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregarIns)
                .addGap(24, 24, 24)
                .addComponent(btn_consultarIns)
                .addGap(24, 24, 24)
                .addComponent(btn_eliminarIns)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarIns)
                    .addComponent(btn_consultarIns)
                    .addComponent(btn_eliminarIns))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_eliminarCli.setText("Eliminar");
        btn_eliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCliActionPerformed(evt);
            }
        });

        btn_agregarCli.setText("Agregar");
        btn_agregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCliActionPerformed(evt);
            }
        });

        btn_consultarCli.setText("Consultar");
        btn_consultarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregarCli)
                .addGap(22, 22, 22)
                .addComponent(btn_consultarCli)
                .addGap(22, 22, 22)
                .addComponent(btn_eliminarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarCli)
                    .addComponent(btn_consultarCli)
                    .addComponent(btn_eliminarCli))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setText("Instrumento Mas Vendido");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Instrumento Menos Venido");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaCatalogo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCatalogoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaCatalogo);

        jLabel4.setText("CATALOGO DE INSTRUMENTOS");

        jScrollPane2.setViewportView(listaClientes);

        jLabel5.setText("CLIENTES REGISTRADOS");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnAgrCantidad.setText("Agregar Cantidad");
        btnAgrCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrCantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Instrumentos");

        jLabel2.setText("Cliente");

        jLabel3.setText("Reporte Ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(121, 121, 121)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnAgrCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVender)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVender)
                            .addComponent(btnAgrCantidad)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarInsActionPerformed
        dialogoAgregarInstrumentos.setVisible(true);

    }//GEN-LAST:event_btn_agregarInsActionPerformed

    private void btn_agregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCliActionPerformed
        dialogoAgregarCliente.setVisible(true);
    }//GEN-LAST:event_btn_agregarCliActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            int cantidadV = 0;
            Instrumento ins = tienda.darMasVendido();
            if (ins != null) {
                for (int j = 0; j < tienda.getClientes().size(); j++) {
                    Cliente c = (Cliente) tienda.getClientes().get(j);
                    for (int k = 0; k < c.getCompras().size(); k++) {
                        Venta v = (Venta) c.getCompras().get(k);
                        if (ins.getReferencia().equals(v.getReferenciaInstrumentoVenta())) {
                            cantidadV += v.getCantidadVendida();
                        }
                    }

                }
            }
            JOptionPane.showMessageDialog(this, "El Instrumento mas vendido es: " + ins.getNomInstrumento() + "\n"
                    + "Referencia: " + ins.getReferencia() + "\n" + "Marca: " + ins.getMarcaInstrumento() + "\n"
                    + "Costo: " + ins.getCostoInstrumento() + "\n" + "Disponibles: " + ins.getCantidad()+"\n"+"\n"
                    +"Vendid@s: "+cantidadV, "Instrumento Mas Vendido", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Informacion Mas Vendido", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_eliminarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarInsActionPerformed
        eliminarInstrumento();
    }//GEN-LAST:event_btn_eliminarInsActionPerformed

    private void listaCatalogoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCatalogoValueChanged
        darSeleccionado();

    }//GEN-LAST:event_listaCatalogoValueChanged

    private void btn_consultarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarInsActionPerformed

        String ref = JOptionPane.showInputDialog(null, "Referencia");
        while (ref != null) {
            if (JOptionPane.OK_OPTION != -1) {
                if (!ref.equals("")) {
                    if (tienda.buscarInstrumento(ref) == null) {
                        JOptionPane.showMessageDialog(this, "Instrumento no encontrado", "Fail", JOptionPane.INFORMATION_MESSAGE);
                        ref = null;
                    } else {
                        ArrayList lista = tienda.darListaInstrumentos();
                        for (int i = 0; i < lista.size(); i++) {
                            Object o = (Object) lista.get(i);
                            String r = o.toString().replace(":", "");

                            String[] separador = r.split(" ");
                            if (separador[1].toString().equals(ref)) {
                                listaCatalogo.setSelectedIndex(i);
                                ref = null;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor digite la referencia a buscar", "Fail", JOptionPane.ERROR_MESSAGE);
                    ref = JOptionPane.showInputDialog(null, "Referencia");
                }

            }
        }


    }//GEN-LAST:event_btn_consultarInsActionPerformed

    private void btn_consultarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarCliActionPerformed
        String identificacion = JOptionPane.showInputDialog(null, "Identificacion");
        while (identificacion != null) {
            if (JOptionPane.OK_OPTION != -1) {
                if (!identificacion.equals("")) {
                    if (tienda.buscarCliente(identificacion) == null) {
                        JOptionPane.showMessageDialog(this, "Cliente no encontrado", "Fail", JOptionPane.INFORMATION_MESSAGE);
                        identificacion = null;
                    } else {
                        ArrayList lista = tienda.darListaClientes();
                        for (int i = 0; i < lista.size(); i++) {
                            Object o = (Object) lista.get(i);
                            String r = o.toString().replace(":", "");

                            String[] separador = r.split(" ");
                            if (separador[0].toString().equals(identificacion)) {
                                listaClientes.setSelectedIndex(i);
                                identificacion = null;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor digite la identificacion a buscar", "Fail", JOptionPane.ERROR_MESSAGE);
                    identificacion = JOptionPane.showInputDialog(null, "Identificacion");
                }

            }
        }
    }//GEN-LAST:event_btn_consultarCliActionPerformed

    private void btn_eliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCliActionPerformed
        eliminarCliente();
    }//GEN-LAST:event_btn_eliminarCliActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        try {
            if (!darSeleccionado().equals("")) {
                if (!darClienteSeleccionado().equals("")) {
                    String cantidad = JOptionPane.showInputDialog(null, "Cantidad");
                    while (cantidad != null) {
                        if (JOptionPane.OK_OPTION != -1) {
                            if (!cantidad.equals("")) {
                                String inst = darSeleccionado();
                                String cliente = darClienteSeleccionado();
                                tienda.agregarVenta(inst, cliente, Integer.parseInt(cantidad));
                                actualizarListaInstrumentos();
                                JOptionPane.showMessageDialog(this, cantidad + " instrumento(s) vendido(s)", "Error de seleccion", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = null;
                            } else {
                                JOptionPane.showMessageDialog(this, "Por favor digite la cantidad avender", "Fail venta", JOptionPane.ERROR_MESSAGE);
                                cantidad = JOptionPane.showInputDialog(null, "Cantidad");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione un cliente", "Error de seleccion", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un instrumento", "Error de seleccion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Fail venta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnAgrCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrCantidadActionPerformed
        try {
            if (!darSeleccionado().equals("")) {
                String cantidad = JOptionPane.showInputDialog(null, "Cantidad");
                while (cantidad != null) {
                    if (JOptionPane.OK_OPTION != -1) {
                        if (!cantidad.equals("")) {
                            String inst = darSeleccionado();
                            tienda.agregarCantidad(Integer.parseInt(cantidad), inst);
                            actualizarListaInstrumentos();
                            cantidad = null;
                        } else {
                            JOptionPane.showMessageDialog(this, "Por favor digite una cantidad", "Fail agregar", JOptionPane.ERROR_MESSAGE);
                            cantidad = JOptionPane.showInputDialog(null, "Cantidad");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un instrumento", "Error de seleccion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cantidad no validad (no permitido valores alfanumericos solo númericos)", "Fail cantidad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgrCantidadActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          try{
             Instrumento ins = tienda.darMenosVendido();
             int cantidadV = 0;
              if (ins != null) {
                  for (int j = 0; j < tienda.getClientes().size(); j++) {
                      Cliente c = (Cliente) tienda.getClientes().get(j);
                      for (int k = 0; k < c.getCompras().size(); k++) {
                          Venta v = (Venta) c.getCompras().get(k);
                          if (ins.getReferencia().equals(v.getReferenciaInstrumentoVenta())) {
                              cantidadV += v.getCantidadVendida();
                          }
                      }

                  }
              }
            JOptionPane.showMessageDialog(this, "El Instrumento menos vendido es: " + ins.getNomInstrumento() + "\n"
                    + "Referencia: " + ins.getReferencia() + "\n" + "Marca: " + ins.getMarcaInstrumento() + "\n"
                    + "Costo: " + ins.getCostoInstrumento() + "\n" + "Disponibles: " + ins.getCantidad()+"\n"+"\n"
                    +"Vendid@s: "+cantidadV, "Instrumento Menos Vendido", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Informacion Menos Vendido", JOptionPane.INFORMATION_MESSAGE);
        }
              
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    public void eliminarInstrumento() {
        if (listaCatalogo.getSelectedIndex() >= 0) {
            String referencia = darSeleccionado();
            if (!referencia.equals("")) {
                tienda.eliminarInstrumento(tienda.buscarInstrumento(referencia).getReferencia());
                actualizarListaInstrumentos();
                JOptionPane.showMessageDialog(this, "Instrumento eliminado correctamente", "Eliminar Instrumento", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void eliminarCliente() {
        if (listaClientes.getSelectedIndex() >= 0) {
            String ident = darClienteSeleccionado();
            if (!ident.equals("")) {
                tienda.eliminarCliente(tienda.buscarCliente(ident).getIdentificacion());
                actualizarListaClientes();
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente", "Eliminar Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public String darClienteSeleccionado() {
        String referencia = "";
        if (!listaClientes.isSelectionEmpty()) {
            String seleccionado = listaClientes.getSelectedValue().toString();
            String[] separador = seleccionado.split(":");
            String[] separador2 = separador[0].split(" ");
            referencia = separador2[0];

        }
        return referencia;
    }

    public String darSeleccionado() {
        String referencia = "";
        if (!listaCatalogo.isSelectionEmpty()) {
            String seleccionado = listaCatalogo.getSelectedValue().toString();
            String[] separador = seleccionado.split(":");
            String[] separador2 = separador[0].split(" ");
            referencia = separador2[1];

        }
        return referencia;
    }

    public void agregarInstrumento(String referencia, String nomInstrumento, String marcaInstrumento, int costoInstrumento, int cantidad) {
        try {
            tienda.agregarInstrumento(referencia, nomInstrumento, marcaInstrumento, costoInstrumento, cantidad);
            actualizarListaInstrumentos();
            dialogoAgregarInstrumentos.limpiarCampos();
            dialogoAgregarInstrumentos.setVisible(false);

            JOptionPane.showMessageDialog(this, "Instrumento Agregado Satisfactoriamente", "Agregado Exitoso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al agregar el instrumento", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizarListaInstrumentos() {
        listaCatalogo.setListData(tienda.darListaInstrumentos().toArray());
    }

    public void agregarCliente(String identificacion, String nombre, String apellido, int edad) {
        try {
            tienda.agregarCliente(identificacion, nombre, apellido, edad);
            actualizarListaClientes();
            dialogoAgregarCliente.limpiarCampos();
            dialogoAgregarCliente.setVisible(false);
            JOptionPane.showMessageDialog(this, "Cliente agregado Satisfactoriamente", "Agregado Exitoso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al agregar cliente", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizarListaClientes() {
        listaClientes.setListData(tienda.darListaClientes().toArray());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrCantidad;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btn_agregarCli;
    private javax.swing.JButton btn_agregarIns;
    private javax.swing.JButton btn_consultarCli;
    private javax.swing.JButton btn_consultarIns;
    private javax.swing.JButton btn_eliminarCli;
    private javax.swing.JButton btn_eliminarIns;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JList listaCatalogo;
    private javax.swing.JList listaClientes;
    // End of variables declaration//GEN-END:variables
}
