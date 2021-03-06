/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Horarios;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Asignacion;
import com.mycompany.sistema_asignacion.Backen.Objetos.Catedratico;
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
public class EliminarHorario extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;

    /**
     * Creates new form EliminarHorario
     */
    public EliminarHorario(DatosSistema datosSistema) {
        this.datosSistema = datosSistema;
        initComponents();
        this.llenarTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHorarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FieldCodigo = new javax.swing.JTextField();
        ButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Horario");

        TablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Hora", "Dia", "Curso", "Edificio", "Salon", "Catedratico", "Asignados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaHorarios.getTableHeader().setReorderingAllowed(false);
        TablaHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHorariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHorarios);
        if (TablaHorarios.getColumnModel().getColumnCount() > 0) {
            TablaHorarios.getColumnModel().getColumn(0).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(1).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(2).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(3).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(4).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(5).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(6).setResizable(false);
            TablaHorarios.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Codigo Horario");

        FieldCodigo.setEditable(false);
        FieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCodigoActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("Eliminar");
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
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(FieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHorariosMouseClicked
        // TODO add your handling code here:

        int row = this.TablaHorarios.rowAtPoint(evt.getPoint());
        String idHorario = String.valueOf(this.TablaHorarios.getValueAt(row, 0));
        FieldCodigo.setText(idHorario);


    }//GEN-LAST:event_TablaHorariosMouseClicked

    private void FieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCodigoActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        // TODO add your handling code here:
        Horario horario = this.datosSistema.getHorarios().buscar(FieldCodigo.getText());

        if (horario != null) {
            try {
                this.eliminarAsigancionesHorario(horario);
                this.datosSistema.getHorarios().eliminar(String.valueOf(horario.getCodigo()));
                JOptionPane.showMessageDialog(this, "Se elimino con exito el Horario seleccionado", "Completado", JOptionPane.INFORMATION_MESSAGE);
                FieldCodigo.setText(null);
                this.llenarTabla();
            } catch (NotFoundNodeException ex) {
                JOptionPane.showMessageDialog(this, "No existe el horario que desea eliminar", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }

    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JTextField FieldCodigo;
    private javax.swing.JTable TablaHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        this.limpiarTabla();
        if (!this.datosSistema.getHorarios().isEmpty()) {
            this.ButtonEliminar.setEnabled(true);
            DefaultTableModel model = (DefaultTableModel) this.TablaHorarios.getModel();
            Horario[] AVLtoArrayInOrden = this.datosSistema.getHorarios().AVLtoArrayInOrden(Horario[].class);
            for (Horario horario : AVLtoArrayInOrden) {
                Catedratico catedratico = this.datosSistema.getCatedraticos().buscar(String.valueOf(horario.getCodeCatedratico()));
                Curso curso = this.datosSistema.getCursos().buscar(String.valueOf(horario.getCodigoCurso()));
                model.addRow(new Object[]{horario.getCodigo(), horario.getHora(), horario.getDia(), ((curso == null) ? "null" : curso.getNombre()), horario.getSalon(), horario.getEdificio(), ((catedratico == null) ? "null" : catedratico.getNombre()),horario.getAsignaciones().getLegth()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay horarios en el sistema", "Error", JOptionPane.WARNING_MESSAGE);
            this.ButtonEliminar.setEnabled(false);
        }
    }

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) this.TablaHorarios.getModel();
        if (model.getRowCount() > 0) {
            do {
                model.removeRow(0);
            } while (model.getRowCount() != 0);
        }
    }

    private void eliminarAsigancionesHorario(Horario horario) {
        if (horario.getAsignaciones().getLegth() > 0) {
            Asignacion[] listToArray = horario.getAsignaciones().listToArray(Asignacion[].class);

            for (Asignacion asignacion : listToArray) {
                Estudiante estudiante = this.datosSistema.getEstudiantes().buscar(new Estudiante(asignacion.getCarnet(), "", ""), asignacion.getCarnet());
                if (estudiante != null) {
                    try {
                        estudiante.getHorarios().eliminar(String.valueOf(horario.getCodigo()));
                    } catch (NotFoundNodeException ex) {
                        /*Error aceptable*/
                    }
                }

            }

        }
    }
}
