/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Asignaciones;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Asignacion;
import com.mycompany.sistema_asignacion.Backen.Objetos.Curso;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Backen.Objetos.Horario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author benjamin
 */
public class EliminarAsignacion extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;

    /**
     * Creates new form EliminarAsignacion
     */
    public EliminarAsignacion(DatosSistema datosSistema) {
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

        FieldCarnet = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsignaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        FieldId = new javax.swing.JTextField();
        ButtonEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FieldEstudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Eliminar Asignacion");

        FieldCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaAsignaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Curso", "Horario", "Dia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAsignaciones.setEnabled(false);
        TablaAsignaciones.getTableHeader().setReorderingAllowed(false);
        TablaAsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAsignacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAsignaciones);

        jLabel2.setText("ID");

        FieldId.setEditable(false);

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.setEnabled(false);
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jLabel5.setText("Estudiante");

        FieldEstudiante.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(FieldEstudiante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonEliminar)
                            .addComponent(FieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonEliminar)
                .addGap(149, 149, 149))
        );

        jLabel1.setText("Carnet Estudiante");

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
                        .addComponent(FieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!FieldCarnet.getText().isEmpty()) {
            int carnet = Integer.valueOf(FieldCarnet.getText());

            Estudiante estudiante = this.datosSistema.getEstudiantes().buscar(new Estudiante(carnet, "", ""), carnet);

            if (estudiante != null) {
                this.FieldEstudiante.setText(String.valueOf(carnet));
                this.ButtonEliminar.setEnabled(false);;
                this.cargarAsignaciones(estudiante);

            } else {
                JOptionPane.showMessageDialog(this, "No se ecnontro el estudiante", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
                this.FieldEstudiante.setText(null);
                this.ButtonEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaAsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAsignacionesMouseClicked
        // TODO add your handling code here:
        int row = this.TablaAsignaciones.rowAtPoint(evt.getPoint());
        String idHorario = String.valueOf(this.TablaAsignaciones.getValueAt(row, 0));
        String carnet = FieldEstudiante.getText();
        FieldId.setText(idHorario);
        Horario horario = this.datosSistema.getHorarios().buscar(idHorario);
        if (horario != null) {
            Asignacion asignacion = horario.getAsignaciones().buscar(carnet);
            if (asignacion != null) {
                this.ButtonEliminar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "La asignacion no esta disponible", "Error", JOptionPane.WARNING_MESSAGE);
                this.ButtonEliminar.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No esta disponible el horario seleccionado", "Error", JOptionPane.WARNING_MESSAGE);
            this.ButtonEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TablaAsignacionesMouseClicked

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        // TODO add your handling code here:
        Horario horario = this.datosSistema.getHorarios().buscar(FieldId.getText());
        if (horario != null) {
            try {
                horario.getAsignaciones().eliminar(FieldEstudiante.getText());
                try {
                    Estudiante estudiante = this.datosSistema.getEstudiantes().buscar(new Estudiante(Integer.valueOf(FieldEstudiante.getText()), "", ""), Integer.valueOf(FieldEstudiante.getText()));
                    estudiante.getHorarios().eliminar(FieldId.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "No es posible eliminar la realacion de asignacion estudiante\nla extraccion del estudiante del curso fue exitosa", "Error Irreparable",JOptionPane.WARNING_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "Se elimino con exito la asignacion del estudiante", "Completado", JOptionPane.INFORMATION_MESSAGE);
                this.recargarAsignaciones();
            } catch (NotFoundNodeException ex) {
                JOptionPane.showMessageDialog(this, "No existe una asignacion del estuadinte seleccionado", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No esta disponible el horario seleccionado", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JFormattedTextField FieldCarnet;
    private javax.swing.JTextField FieldEstudiante;
    private javax.swing.JTextField FieldId;
    private javax.swing.JTable TablaAsignaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarAsignaciones(Estudiante estudiante) {
        Horario[] horarios = estudiante.getHorarios().AVLtoArrayInOrden(Horario[].class);

        if (horarios.length > 0) {

            this.limpiarTabla();

            DefaultTableModel model = (DefaultTableModel) this.TablaAsignaciones.getModel();

            Curso curso;
            for (Horario horario : horarios) {
                curso = this.datosSistema.getCursos().buscar(String.valueOf(horario.getCodigoCurso()));
                Object row[] = {horario.getCodigo(), horario.getHora(), ((curso == null) ? "null" : curso.getNombre()), horario.getDia()};
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El estudiante no tiene asignaciones", "Error", JOptionPane.WARNING_MESSAGE);
            this.limpiarTabla();
        }
    }

    private void recargarAsignaciones() {
        if (!FieldEstudiante.getText().isEmpty()) {
            int carnet = Integer.valueOf(FieldEstudiante.getText());
            Estudiante estudiante = this.datosSistema.getEstudiantes().buscar(new Estudiante(carnet, "", ""), carnet);
            if (estudiante != null) {
                this.FieldEstudiante.setText(String.valueOf(carnet));
                this.ButtonEliminar.setEnabled(false);;
                this.cargarAsignaciones(estudiante);

            } else {
                JOptionPane.showMessageDialog(this, "No se ecnontro el estudiante", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
                this.FieldEstudiante.setText(null);
                this.ButtonEliminar.setEnabled(false);
            }
        }
    }

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) this.TablaAsignaciones.getModel();
        if (model.getRowCount() > 0) {
            do {
                model.removeRow(0);
            } while (model.getRowCount() != 0);
        }
    }
}
