/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Estudiantes;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Backen.Objetos.Horario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin
 */
public class EliminarEstudiante extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;
    private Estudiante estudianteEliminar;

    /**
     * Creates new form EliminarEstudiante
     */
    public EliminarEstudiante(DatosSistema datosSistema) {
        this.datosSistema = datosSistema;
        initComponents();
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
        FieldCarnet = new javax.swing.JFormattedTextField();
        ButtonBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldNumeroCarnet = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        ButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar Estudiante");

        jLabel1.setText("Carnet de Estudiante:");

        FieldCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nombre");

        jLabel3.setText("Carnet");

        FieldNumeroCarnet.setEditable(false);
        FieldNumeroCarnet.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FieldNombre.setEditable(false);
        FieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Direccion");

        FieldDireccion.setEditable(false);
        FieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.setEnabled(false);
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldNombre)
                            .addComponent(FieldDireccion)
                            .addComponent(FieldNumeroCarnet))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldNumeroCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        // TODO add your handling code here:
        String carnetEstudiante = FieldCarnet.getText();
        if (!carnetEstudiante.isEmpty()) {
            this.cargarEstudiante(carnetEstudiante);
        }

    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (estudianteEliminar != null) {
            try {
                this.eliminarAsiganciones(estudianteEliminar);
                this.eliminarUsuario(estudianteEliminar);
                this.datosSistema.getEstudiantes().eliminar(estudianteEliminar, estudianteEliminar.hashCode());
                JOptionPane.showMessageDialog(this, "Estudiante eliminado con exito", "Completado", JOptionPane.INFORMATION_MESSAGE);
                this.llenarCampos(null);
            } catch (NotFoundNodeException ex) {
                JOptionPane.showMessageDialog(this, "No existen datos del estudiante ingresado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JFormattedTextField FieldCarnet;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldNumeroCarnet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void cargarEstudiante(String carnetEstudiante) {
        int carnet = Integer.valueOf(carnetEstudiante);
        Estudiante estudiante = this.datosSistema.getEstudiantes().buscar(new Estudiante(carnet, "", ""), carnet);
        if (estudiante != null) {
            this.llenarCampos(estudiante);
        } else {
            JOptionPane.showMessageDialog(this, "No hay registro del estudiante que esta buscando", "Error de Busqueda", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void llenarCampos(Estudiante estudiante) {
        if (estudiante != null) {
            FieldNumeroCarnet.setText(String.valueOf(estudiante.getCarnet()));
            FieldNombre.setText(estudiante.getNombre());
            FieldDireccion.setText(estudiante.getDireccion());
            this.estudianteEliminar = estudiante;
            ButtonEliminar.setEnabled(true);
        } else {
            FieldNumeroCarnet.setText(null);
            FieldNombre.setText(null);
            FieldDireccion.setText(null);
            ButtonEliminar.setEnabled(false);
        }
    }

    private void eliminarAsiganciones(Estudiante estudianteEliminar) {
        Horario[] AVLtoArrayInOrden = estudianteEliminar.getHorarios().AVLtoArrayInOrden(Horario[].class);
        Horario buscar;
        for (Horario horario : AVLtoArrayInOrden) {
            buscar = this.datosSistema.getHorarios().buscar(String.valueOf(horario.getCodigo()));
            if (buscar != null) {
                try {
                    buscar.getAsignaciones().eliminar(String.valueOf(estudianteEliminar.getCarnet()));
                } catch (NotFoundNodeException ex) {
                    /**
                     * error permitido
                     */
                }
            }
        }
    }

    private void eliminarUsuario(Estudiante estudianteEliminar) {
        if(estudianteEliminar!=null){
            try {
                this.datosSistema.getUsuarios().eliminar(String.valueOf(estudianteEliminar.getCarnet()));
            } catch (NotFoundNodeException ex) {
                /*Error permitido*/
            }
        }
    }
}
