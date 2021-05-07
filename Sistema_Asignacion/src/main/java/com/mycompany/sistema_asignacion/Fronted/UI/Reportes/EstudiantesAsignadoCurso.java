/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Reportes;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble.NodoLCD;
import com.mycompany.sistema_asignacion.Backen.EDD.PilaTag;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NullTagException;
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
 * @author Benjamin
 */
public class EstudiantesAsignadoCurso extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;

    /**
     * Creates new form EstudiantesAsignadoCurso
     */
    public EstudiantesAsignadoCurso(DatosSistema datosSistema) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        FieldCodeCurso = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Estudiantes Asignados a Curso");
        setToolTipText("");

        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Carnet", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(TablaEstudiantes);

        jLabel1.setText("Codigo de Curso:");

        FieldCodeCurso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FieldCodeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldCodeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codeCurso = FieldCodeCurso.getText();
        Curso tmpCurso = datosSistema.getCursos().buscar(codeCurso);
        if (tmpCurso != null) {
            limpiarTabla();
            this.actulizarDatosTabla(tmpCurso);
        } else {
            limpiarTabla();
            JOptionPane.showMessageDialog(this, "No existe un curso con codigo \"" + codeCurso + "\" en el sistema", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        this.TablaEstudiantes.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FieldCodeCurso;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void actulizarDatosTabla(Curso tmpCurso) {
        DefaultTableModel model = new DefaultTableModel();
        this.TablaEstudiantes.setModel(model);
        PilaTag<Estudiante> pilaTag = new PilaTag<>();
        Horario[] horarios = datosSistema.getHorarios().AVLtoArrayInOrden(Horario[].class);

        for (Horario horario : horarios) {
            if (horario.getCodigoCurso() == tmpCurso.getCodigo()) {
                this.guardarEstudiantes(horario, pilaTag);
            }
        }

        String header[] = {"No.", "Nombre", "Carnet"};
        for (String string : header) {
            model.addColumn(string);
        }

        Estudiante tmpEstudiante;
        int cont = 1;
        while (!pilaTag.isEmpty()) {
            tmpEstudiante = pilaTag.pop();
            if (tmpEstudiante != null) {
                Object[] rowtab = {cont, tmpEstudiante.getNombre(), tmpEstudiante.getCarnet()};
                model.addRow(rowtab);
                cont++;
            }
        }

    }

    private void guardarEstudiantes(Horario horario, PilaTag<Estudiante> pilaTag) {
        Asignacion[] listToArray = horario.getAsignaciones().listToArray(Asignacion[].class);
        Estudiante tmpEstudiante;
        for (Asignacion asignacion : listToArray) {
            tmpEstudiante = datosSistema.getEstudiantes().buscar(new Estudiante(asignacion.getCarnet(), "", ""), asignacion.getCarnet());
            if (tmpEstudiante != null) {
                if (!pilaTag.buscar(String.valueOf(tmpEstudiante.getCarnet()))) {
                    pilaTag.push(tmpEstudiante, String.valueOf(tmpEstudiante.getCarnet()));
                }
            }
        }
    }

}
