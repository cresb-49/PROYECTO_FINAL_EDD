/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Fronted.UI;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Graficadores.Graficadores;
import com.mycompany.sistema_asignacion.Fronted.UI.Catedraticos.NuevoCatedratico;
import com.mycompany.sistema_asignacion.Fronted.UI.Estudiantes.ModificarEstudiante;
import com.mycompany.sistema_asignacion.Fronted.UI.Estudiantes.NuevoEstudiante;
import com.mycompany.sistema_asignacion.Fronted.UI.Usuarios.FrameCrearUsuario;
import com.mycompany.sistema_asignacion.Fronted.UI.Usuarios.FrameEliminarUsuario;
import com.mycompany.sistema_asignacion.Fronted.UI.Usuarios.FrameModificarUsuario;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Usuario;
import com.mycompany.sistema_asignacion.Fronted.UI.Cursos.CrearCurso;
import com.mycompany.sistema_asignacion.Fronted.UI.Cursos.ModificarCurso;
import com.mycompany.sistema_asignacion.Fronted.UI.Salones.CrearSalon;
import com.mycompany.sistema_asignacion.Fronted.UI.Salones.ModificarSalon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin
 */
public class FramePrincipal extends javax.swing.JFrame {

    private Graficadores graficadores;
    private DatosSistema dataSistema;
    private Usuario currentUser;

    public FramePrincipal(DatosSistema datos) {
        initComponents();
        this.dataSistema = datos;
        this.graficadores = new Graficadores(datos);
        this.currentUser = null;
        this.setLocationRelativeTo(null);
        this.inicioDelUsuario();
    }

    private void inicioDelUsuario() {
        InicioSesion login = new InicioSesion(this, true, this.dataSistema);
        login.setVisible(true);
        if (login.isLog() == false) {
            this.dispose();
        } else {
            this.currentUser = login.getCurrentUser();
            this.mostrarDatos();
        }
    }

    private void mostrarDatos() {
        if(currentUser==null){
            this.dispose();
        }else{
            this.ViewUser.setText(this.currentUser.getNombre());
            this.ViewId.setText(String.valueOf(this.currentUser.getId()));
            this.ViewType.setText(this.currentUser.getTipo());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        ViewUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ViewId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ViewType = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jLabel1.setText("Usuario");

        ViewUser.setEditable(false);

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        ViewId.setEditable(false);
        ViewId.setActionCommand("<Not Set>");

        jLabel3.setText("Tipo");

        ViewType.setEditable(false);
        ViewType.setActionCommand("<Not Set>");

        jMenu1.setText("Cargar Informacion");

        jMenuItem1.setText("Cargar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar Informacion");

        jMenu5.setText("Usuarios");

        jMenuItem3.setText("Crear Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Eliminar Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Modificar Usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu2.add(jMenu5);

        jMenu6.setText("Estudiantes");

        jMenuItem6.setText("Nuevo Estudiante");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Eliminar Estudiante");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Modificar Estudiante");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenu2.add(jMenu6);

        jMenu7.setText("Catedraticos");

        jMenuItem14.setText("Nuevo Catedratico");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Modificar Catedratico");
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Eliminar Catedratico");
        jMenu7.add(jMenuItem16);

        jMenu2.add(jMenu7);

        jMenu8.setText("Salones");

        jMenuItem17.setText("Crear Salon");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Modificar Salon");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenuItem19.setText("Eliminar Salon");
        jMenu8.add(jMenuItem19);

        jMenu2.add(jMenu8);

        jMenu9.setText("Cursos");

        jMenuItem20.setText("Crear Curso");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem20);

        jMenuItem21.setText("Modificar Curso");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem21);

        jMenuItem22.setText("Eliminar Curso");
        jMenu9.add(jMenuItem22);

        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Graficos");

        jMenuItem9.setText("Usuarios");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Edificios / Salon");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Estudiantes");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Horarios");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Asignacion");
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cerrar Sesion");

        jMenuItem2.setText("Cerrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Escritorio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ViewId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ViewType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(ViewId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ViewType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super")) {
            CargaInfo cargarInfo = new CargaInfo(this, true, this.dataSistema);
            cargarInfo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para cargar informacion", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.cerrarSession();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.cerrarSession();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            FrameCrearUsuario crearUsuario = new FrameCrearUsuario(this.dataSistema);
            this.Escritorio.add(crearUsuario);
            crearUsuario.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar usuarios", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            FrameEliminarUsuario eliminarUsuario = new FrameEliminarUsuario(dataSistema,this);
            this.Escritorio.add(eliminarUsuario);
            eliminarUsuario.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar usuarios", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            FrameModificarUsuario frameModificarUsuario = new FrameModificarUsuario(dataSistema,this.currentUser,this);
            this.Escritorio.add(frameModificarUsuario);
            frameModificarUsuario.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar usuarios", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            NuevoEstudiante nuevoEstudiante = new NuevoEstudiante(dataSistema);
            this.Escritorio.add(nuevoEstudiante);
            nuevoEstudiante.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar Estudiantes", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            ModificarEstudiante modificarEstudiante = new ModificarEstudiante(dataSistema);
            this.Escritorio.add(modificarEstudiante);
            modificarEstudiante.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar Estudiantes", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            NuevoCatedratico nuevoCatedratico = new NuevoCatedratico(dataSistema);
            this.Escritorio.add(nuevoCatedratico);
            nuevoCatedratico.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para crear Catedraticos", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            CrearSalon crearSalon = new CrearSalon(dataSistema);
            this.Escritorio.add(crearSalon);
            crearSalon.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para crear Salones", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            ModificarSalon modificarSalon = new ModificarSalon(dataSistema);
            this.Escritorio.add(modificarSalon);
            modificarSalon.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar Salones", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            CrearCurso crearCurso = new CrearCurso(dataSistema);
            this.Escritorio.add(crearCurso);
            crearCurso.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para crear un curso", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        if (this.currentUser.getTipo().equals("super") || this.currentUser.getTipo().equals("colaborador")) {
            ModificarCurso modificarCurso = new ModificarCurso(dataSistema);
            this.Escritorio.add(modificarCurso);
            modificarCurso.show();
        } else {
            JOptionPane.showMessageDialog(this, "No tiene los permisos para modificar un curso", "Tipo de usuario no valido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        
        String generarDotCode = this.graficadores.getGraficarUsuarios().generarDotCode();
        try {
            this.graficadores.getGenerarDotFile().generarArchivo(generarDotCode, "Usuarios");
            String pathImagen = this.graficadores.getEjecutarGraphviz().ejecutar("Usuarios.dot", "Usuarios.png");
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la escritura del archivo base .dot:\n"+ex.getMessage(),"Generacion de DOT file", JOptionPane.WARNING_MESSAGE);
        } catch (NoDataException ex) {
            JOptionPane.showMessageDialog(this, "No hay informacion de Usuarios en el sistema","Grafica de Informacion", JOptionPane.WARNING_MESSAGE);
        }
        
        
        System.out.println(generarDotCode);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public void actualizarInfo(){
        this.mostrarDatos();
    }
                
    public void cerrarSession() {
        this.ViewId.setText(null);
        this.ViewType.setText(null);
        this.ViewUser.setText(null);

        this.inicioDelUsuario();
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTextField ViewId;
    private javax.swing.JTextField ViewType;
    private javax.swing.JTextField ViewUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
