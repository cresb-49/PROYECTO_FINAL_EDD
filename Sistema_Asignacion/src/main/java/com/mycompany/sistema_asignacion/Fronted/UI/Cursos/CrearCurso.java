/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Cursos;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Curso;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin
 */
public class CrearCurso extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;

    /**
     * Creates new form CrearCurso
     */
    public CrearCurso(DatosSistema datosSistema) {
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
        FieldCodigoCurso = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldNombreCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SelectSemestre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        SelectCreditos = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Crear Curso");

        jLabel1.setText("Codigo de Curso");

        FieldCodigoCurso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setText("Nombre del Curso");

        jLabel3.setText("Semestre");

        SelectSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel4.setText("Creditos");

        jButton1.setText("Crear Curso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldCodigoCurso)
                    .addComponent(FieldNombreCurso)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 90, Short.MAX_VALUE))
                            .addComponent(SelectSemestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectCreditos))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SelectSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SelectCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (comprobarNumero(this.FieldCodigoCurso.getText())) {
            if (comprobarAlfanumerico(this.FieldNombreCurso.getText())) {
                if (comprobarNumero(String.valueOf(this.SelectCreditos.getValue()))) {
                    int codigo = Integer.valueOf(this.FieldCodigoCurso.getText());
                    String nombre = this.FieldNombreCurso.getText();
                    int semestre = this.SelectSemestre.getSelectedIndex() + 1;
                    int creditos = (Integer) this.SelectCreditos.getValue();

                    Curso newCurso = new Curso(codigo, nombre, semestre, creditos);

                    try {
                        this.datosSistema.getCursos().addOrden(newCurso, String.valueOf(newCurso.getCodigo()));
                        JOptionPane.showMessageDialog(this, "Se creo con exito el curso:\n" + newCurso.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
                        
                        this.FieldCodigoCurso.setText(null);
                        this.FieldNombreCurso.setText(null);
                        this.SelectSemestre.setSelectedIndex(0);
                        this.SelectCreditos.setValue(0);
                        
                    } catch (CloneNodeException ex) {
                        JOptionPane.showMessageDialog(this, "Ya existe un curso con codigo \""+codigo+"\" en el sistema", "Error", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "\"" + this.SelectCreditos.getValue() + "\" no es una cantidad valida para creditos", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre del curso debe de tener caracteres alfanumericos", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El codigo del curso no es valido debe tener contener caracteres numericos", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean comprobarAlfanumerico(String cadena) {
        return Pattern.matches("^[0-9a-zA-ZÀ-ÿ\u00f1\u00d1]+[ 0-9a-zA-ZÀ-ÿ\u00f1\u00d1]*$", cadena);
    }

    private boolean comprobarNumero(String cadena) {
        return Pattern.matches("^[0-9]+$", cadena);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FieldCodigoCurso;
    private javax.swing.JTextField FieldNombreCurso;
    private javax.swing.JSpinner SelectCreditos;
    private javax.swing.JComboBox<String> SelectSemestre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
