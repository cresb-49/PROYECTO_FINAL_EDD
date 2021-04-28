package com.mycompany.sistema_asignacion;

import java.rmi.server.ObjID;
import java.sql.Array;

import com.mycompany.sistema_asignacion.Backen.EDD.HashTable;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Fronted.UI.FramePrincipal;

public class main {

    public static void main(String[] args){
        /*
        DatosSistema datos = new DatosSistema(); FramePrincipal frame = new
        FramePrincipal(datos); frame.setVisible(true);
        */
        prueba();
    }

    private static void prueba(){
        HashTable<Estudiante> table = new HashTable<>();

        Estudiante estudiante1 = new Estudiante(201931012, "Carlos Pac", "Quetzaltenango");
        Estudiante estudiante2 = new Estudiante(202030488, "Sara Pac", "Quetzaltenango");
        Estudiante estudiante3 = new Estudiante(202054832, "Benjamin Flores", "Quetzaltenango");
        Estudiante estudiante4 = new Estudiante(201834534, "Juan Perez", "Quetzaltenango");
        Estudiante estudiante5 = new Estudiante(201931012, "Carlos Pac", "Quetzaltenango");
        
        try {
            table.add(estudiante1, estudiante1.hashCode());
            table.add(estudiante2, estudiante2.hashCode());
            table.add(estudiante3, estudiante3.hashCode());
            table.add(estudiante4, estudiante4.hashCode());
            table.add(estudiante5, estudiante5.hashCode());
            table.imprimirHash();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
