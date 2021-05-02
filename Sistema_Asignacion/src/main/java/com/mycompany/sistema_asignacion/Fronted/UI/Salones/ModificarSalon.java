/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI.Salones;

import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Edificio;
import com.mycompany.sistema_asignacion.Backen.Objetos.Salon;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin
 */
public class ModificarSalon extends javax.swing.JInternalFrame {

    private DatosSistema datosSistema;
    private Salon modSalon;

    /**
     * Creates new form ModificarSalon
     */
    public ModificarSalon(DatosSistema datosSistema) {
        this.datosSistema = datosSistema;
        this.modSalon = null;
        this.modSalon = null;
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
        jLabel2 = new javax.swing.JLabel();
        FieldBuscarEdificio = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FieldNumeroSalon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldCapacidad = new javax.swing.JFormattedTextField();
        ButtonModificar = new javax.swing.JButton();
        FieldBuscarSalon = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar Salon");

        jLabel1.setText("Edificio:");

        jLabel2.setText("Numero de Salon:");

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Numero de Salon");

        FieldNumeroSalon.setEditable(false);

        jLabel4.setText("Capacidad");

        FieldCapacidad.setEditable(false);
        FieldCapacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ButtonModificar.setText("Modificar");
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
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonModificar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FieldNumeroSalon)
                        .addComponent(FieldCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldNumeroSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonModificar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        FieldBuscarSalon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonBuscar)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FieldBuscarSalon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldBuscarEdificio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldBuscarEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldBuscarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        // TODO add your handling code here:
        String edificio = this.FieldBuscarEdificio.getText();
        int numeroSalon = Integer.valueOf(this.FieldBuscarSalon.getText());

        Edificio edificio1 = this.datosSistema.getEdificios().buscar(edificio);

        if (edificio1 != null) {
            Salon salon = edificio1.getSalones().buscar(String.valueOf(numeroSalon));
            if (salon != null) {
                modSalon = salon;
                this.FieldNumeroSalon.setText(String.valueOf(salon.getNumeroSalon()));
                this.FieldCapacidad.setText(String.valueOf(salon.getCantidadEstudiantes()));

                this.FieldCapacidad.setEditable(true);
                this.ButtonModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "No existe un salon \"" + numeroSalon + "\" en el edificio \"" + edificio + "\"", "Error de Busqueda", JOptionPane.WARNING_MESSAGE);
                this.FieldNumeroSalon.setText(null);
                this.FieldCapacidad.setText(null);
                this.FieldCapacidad.setEditable(false);
                this.ButtonModificar.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe un edificio \"" + edificio + "\" en el sistema", "Error de Busqueda", JOptionPane.WARNING_MESSAGE);
            this.FieldNumeroSalon.setText(null);
            this.FieldCapacidad.setText(null);
            this.FieldCapacidad.setEditable(false);
            this.ButtonModificar.setEnabled(true);
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed
        // TODO add your handling code here:
        if(comprobarNumero(this.FieldCapacidad.getText())){
            int capacidad = Integer.valueOf(this.FieldCapacidad.getText());
            modSalon.setCantidadEstudiantes(capacidad);
            JOptionPane.showMessageDialog(this, "Se modifico con exito la informacion del salon", "Modificacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "\""+this.FieldCapacidad.getText()+"\" no es una cantidad valida de estudiantes", "Error en Modificacion", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JTextField FieldBuscarEdificio;
    private javax.swing.JFormattedTextField FieldBuscarSalon;
    private javax.swing.JFormattedTextField FieldCapacidad;
    private javax.swing.JTextField FieldNumeroSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
