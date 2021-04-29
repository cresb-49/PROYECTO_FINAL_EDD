/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI;

import com.mycompany.sistema_asignacion.Backen.Analizadores.Lexer.Lexer;
import com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.parser;
import com.mycompany.sistema_asignacion.Backen.EDD.Cola;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author benjamin
 */
public class CargaInfo extends javax.swing.JDialog {

    private DatosSistema data;
    /**
     * Creates new form CargaInfo
     */
    public CargaInfo(java.awt.Frame parent, boolean modal,DatosSistema data) {
        super(parent, modal);
        this.data = data;
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
        buscarArchivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaErrores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga de Datos");

        jLabel1.setText("SELECCIONA EL ARCHIVO PARA LA CARGA DE DATOS");

        jLabel2.setText("Buscar Archivo");

        buscarArchivo.setText("Buscar");
        buscarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarArchivoActionPerformed(evt);
            }
        });

        jLabel3.setText("Ubicacion");

        jTextField1.setEditable(false);

        jTextAreaErrores.setEditable(false);
        jTextAreaErrores.setColumns(20);
        jTextAreaErrores.setRows(5);
        jTextAreaErrores.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores del Archivo"));
        jScrollPane1.setViewportView(jTextAreaErrores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarArchivo)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser selector = new JFileChooser(".");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo .data", "data");
        selector.setFileFilter(filtro);
        int retorno = selector.showOpenDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            this.jTextField1.setText(selector.getSelectedFile().getAbsolutePath());
            this.leerArchivo(selector.getSelectedFile());
        }
        
    }//GEN-LAST:event_buscarArchivoActionPerformed
    
    private void leerArchivo(File file){
        try {
            Cola<String> errores = new Cola<>();
            Lexer lexer = new Lexer(new FileReader(file));
            lexer.setErrores(errores);
            parser parse = new parser(lexer, this.data, errores);
            parse.parse();
            
            this.visualizarErrores(errores);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se puede leer el archivo: \n"+ex.getMessage(), "Error de lectura", JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al parsear el archivo: \n"+ex.getMessage(), "Error de lectura", JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private void visualizarErrores(Cola<String> errors){
        StringBuilder err = new StringBuilder();
        
        while (!errors.isEmpty()) {
            err.append(errors.tomar()+"\n");
        }
        this.jTextAreaErrores.setText(err.toString());
        this.jTextAreaErrores.setEditable(false);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaErrores;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
