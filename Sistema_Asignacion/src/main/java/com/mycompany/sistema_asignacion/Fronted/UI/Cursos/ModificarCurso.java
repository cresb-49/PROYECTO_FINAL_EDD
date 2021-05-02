/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Cursos;

import com.mycompany.sistema_asignacion.Backen.Objetos.Curso;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin
 */
public class ModificarCurso extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;
    private Curso modCurso;

    /**
     * Creates new form ModificarCurso
     */
    public ModificarCurso(DatosSistema datosSistema) {
        this.datosSistema = datosSistema;
        this.modCurso = null;
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
        FieldBuscarCodigo = new javax.swing.JFormattedTextField();
        ButtonBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FieldCodigoCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldNombreCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SelectSemestre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SelectCreditos = new javax.swing.JSpinner();
        ButtonModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar Curso");

        jLabel1.setText("Codigo de Curso");

        FieldBuscarCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        FieldBuscarCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ButtonBuscar.setText("Buscar Curso");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Codigo Curso");

        FieldCodigoCurso.setEditable(false);

        jLabel3.setText("Nombre del Curso");

        FieldNombreCurso.setEditable(false);

        jLabel4.setText("Semestre");

        SelectSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        SelectSemestre.setEnabled(false);

        jLabel5.setText("Creditos");

        SelectCreditos.setEnabled(false);

        ButtonModificar.setText("Modificar Curso");
        ButtonModificar.setEnabled(false);
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(FieldCodigoCurso))
                    .addComponent(FieldNombreCurso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectSemestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectCreditos))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(ButtonModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SelectSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SelectCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonModificar)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FieldBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        // TODO add your handling code here:
        String codigo = this.FieldBuscarCodigo.getText();

        Curso buscar = this.datosSistema.getCursos().buscar(codigo);

        if (buscar != null) {
            modCurso = buscar;
            this.FieldCodigoCurso.setText(String.valueOf(buscar.getCodigo()));
            this.FieldNombreCurso.setText(String.valueOf(buscar.getNombre()));
            this.SelectSemestre.setSelectedIndex(buscar.getSemestre() - 1);
            this.SelectCreditos.setValue(buscar.getCreditos());

            this.FieldNombreCurso.setEditable(true);
            this.SelectSemestre.setEnabled(true);
            this.SelectCreditos.setEnabled(true);
            this.ButtonModificar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existe un curso con codigo \"" + codigo + "\" en el sistema", "Error de Busqueda", JOptionPane.WARNING_MESSAGE);
            this.FieldCodigoCurso.setText(null);
            this.FieldNombreCurso.setText(null);
            this.SelectSemestre.setSelectedIndex(0);
            this.SelectCreditos.setValue(0);

            this.FieldNombreCurso.setEditable(false);
            this.SelectSemestre.setEnabled(false);
            this.SelectCreditos.setEnabled(false);
            this.ButtonModificar.setEnabled(false);
        }


    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed
        // TODO add your handling code here:
        if (comprobarAlfanumerico(this.FieldNombreCurso.getText())) {
            if (comprobarNumero(String.valueOf(this.SelectCreditos.getValue()))) {
                
                String nombre = this.FieldNombreCurso.getText();
                int semestre = this.SelectSemestre.getSelectedIndex() + 1;
                int creditos = (Integer) this.SelectCreditos.getValue();
                
                modCurso.setNombre(nombre);
                modCurso.setSemestre(semestre);
                modCurso.setCreditos(creditos);
                
                JOptionPane.showMessageDialog(this, "Se modifco con exito el curso:\n"+modCurso.toString(), "Modificacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "\"" + this.SelectCreditos.getValue() + "\" no es una cantidad valida para creditos", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del curso debe de tener caracteres alfanumericos", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonModificarActionPerformed

    private boolean comprobarAlfanumerico(String cadena) {
        return Pattern.matches("^[0-9a-zA-ZÀ-ÿ\u00f1\u00d1]+[ 0-9a-zA-ZÀ-ÿ\u00f1\u00d1]*$", cadena);
    }

    private boolean comprobarNumero(String cadena) {
        return Pattern.matches("^[0-9]+$", cadena);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JFormattedTextField FieldBuscarCodigo;
    private javax.swing.JTextField FieldCodigoCurso;
    private javax.swing.JTextField FieldNombreCurso;
    private javax.swing.JSpinner SelectCreditos;
    private javax.swing.JComboBox<String> SelectSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
