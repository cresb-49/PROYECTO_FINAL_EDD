package com.mycompany.sistema_asignacion;

import com.mycompany.sistema_asignacion.Backen.EDD.HashTable;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Backen.Objetos.Usuario;
import com.mycompany.sistema_asignacion.Fronted.UI.FramePrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.TabableView;

public class main {
    public static void main(String[] args){/*
        DatosSistema datos = new DatosSistema(); 
        
        try {
            datos.getUsuarios().add(new Usuario(0, "AdminSistema","12345","super"), "AdminSistema");
        } catch (CloneNodeException e) {
            e.printStackTrace();
        }
        FramePrincipal frame = new FramePrincipal(datos); frame.setVisible(true);
        */
        prubas();
    }
    
    private static void prubas(){
        
        HashTable<Estudiante> tabla = new HashTable<>();
        
        try {
            tabla.add(new Estudiante(682129680, "", ""), 682129680);
            tabla.add(new Estudiante(485667018, "", ""), 485667018);
            tabla.add(new Estudiante(510648777, "", ""), 510648777);
            tabla.add(new Estudiante(134403629, "", ""), 134403629);
            tabla.add(new Estudiante(576587791, "", ""), 576587791);
            tabla.add(new Estudiante(514029522, "", ""), 514029522);
            tabla.add(new Estudiante(971596049, "", ""), 971596049);
            tabla.add(new Estudiante(652719362, "", ""), 652719362);
            tabla.add(new Estudiante(292756392, "", ""), 292756392);
            tabla.add(new Estudiante(591120081, "", ""), 591120081);
            tabla.add(new Estudiante(487587175, "", ""), 487587175);
            tabla.add(new Estudiante(643606791, "", ""), 643606791);
            tabla.add(new Estudiante(148897761, "", ""), 148897761);
            tabla.add(new Estudiante(286419336, "", ""), 286419336);
            tabla.add(new Estudiante(749974348, "", ""), 749974348);
            tabla.add(new Estudiante(513077560, "", ""), 513077560);
            tabla.add(new Estudiante(340663950, "", ""), 340663950);
            tabla.add(new Estudiante(509208002, "", ""), 509208002);
            tabla.add(new Estudiante(850916192, "", ""), 850916192);
            tabla.add(new Estudiante(347699075, "", ""), 347699075);
            tabla.add(new Estudiante(380898177, "", ""), 380898177);
            tabla.add(new Estudiante(149034226, "", ""), 149034226);
            tabla.add(new Estudiante(803294069, "", ""), 803294069);
            tabla.add(new Estudiante(188570239, "", ""), 188570239);
            tabla.add(new Estudiante(225882611, "", ""), 225882611);
            tabla.add(new Estudiante(564758863, "", ""), 564758863);
            tabla.add(new Estudiante(771328212, "", ""), 771328212);
            tabla.add(new Estudiante(283234134, "", ""), 283234134);
            tabla.add(new Estudiante(375150001, "", ""), 375150001);
            tabla.add(new Estudiante(168031093, "", ""), 168031093);
            tabla.add(new Estudiante(301, "", ""), 301);
            tabla.add(new Estudiante(302, "", ""), 302);
            tabla.add(new Estudiante(303, "", ""), 303);
            tabla.imprimirHash();
        } catch (CloneNodeException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
