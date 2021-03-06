/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Asignaciones;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Graficadores.Graficadores;
import com.mycompany.sistema_asignacion.Backen.Graficadores.GraficarAsignacion;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Horario;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class GraficarAsignaciones extends javax.swing.JInternalFrame {

    private String pathImg;
    private DatosSistema datosSistema;
    private GraficarAsignacion graficarAsignacion;
    private Graficadores graficadores;
    private String pathImagen;

    /**
     * Creates new form GraficarAsignaciones
     */
    public GraficarAsignaciones(DatosSistema datosSistema,Graficadores graficadores) {
        this.datosSistema = datosSistema;
        this.graficadores = graficadores;
        initComponents();
        this.seleccionDeOpcion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPath = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Id horario:");

        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(labelImg);

        jLabel2.setText("Ubicacion:");

        jTextFieldPath.setEditable(false);

        btnMostrar.setText("Mostrar");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPath, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(btnMostrar)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(443, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File(this.pathImagen);
            Image icono = ImageIO.read(file);
            labelImg.setIcon(new ImageIcon(icono));
            labelImg.updateUI();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String horario = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        Horario tmpHorario = datosSistema.getHorarios().buscar(horario);
        this.procesarImagen(tmpHorario);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JLabel labelImg;
    // End of variables declaration//GEN-END:variables

    private void seleccionDeOpcion() {
        if(this.datosSistema.getHorarios().isEmpty()){
            this.jButton1.setEnabled(false);
        }else{
            Horario[] horarios = datosSistema.getHorarios().AVLtoArrayInOrden(Horario[].class);
            jComboBox1.removeAllItems();
            for (Horario horario : horarios) {
                jComboBox1.addItem(String.valueOf(horario.getCodigo()));
            }
        }
    }

    private void procesarImagen(Horario tmpHorario) {
        this.graficarAsignacion = new GraficarAsignacion(tmpHorario.getAsignaciones());
        try {
            String codigoDot = this.graficarAsignacion.generarDotCode();
            this.graficadores.getGenerarDotFile().generarArchivo(codigoDot, "Asignaciones");
            this.pathImagen = this.graficadores.getEjecutarGraphviz().ejecutar("Asignaciones.dot", "Asignaciones.png");
            this.btnMostrar.setEnabled(true);
            this.mostrarPath(pathImg);
        } catch (IOException ex) {
            this.btnMostrar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Error en la escritura del archivo base .dot:\n" + ex.getMessage(), "Generacion de DOT file", JOptionPane.WARNING_MESSAGE);
        } catch (NoDataException ex) {
            this.btnMostrar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "No hay informacion de Asignaciones en el horario seleccionado", "Grafica de Informacion", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void mostrarPath(String path){
        this.jTextFieldPath.setText(path);
        JOptionPane.showMessageDialog(this, "Se genero con exito la imagen, puede copiar la ruta\n"
                                      + "o mostrar la imagen en el programa precionando el boton \"Mostrar\"");
    }
}
