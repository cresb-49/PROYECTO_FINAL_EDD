package com.mycompany.sistema_asignacion;

import com.mycompany.sistema_asignacion.Backen.EDD.HashTable;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaDobleEnlazada;
import com.mycompany.sistema_asignacion.Backen.EDD.ArbolB.ArbolB;
import com.mycompany.sistema_asignacion.Backen.EDD.ArbolB.ListArbolB;
import com.mycompany.sistema_asignacion.Backen.EDD.ArbolB.NodoArbolB;
import com.mycompany.sistema_asignacion.Backen.EDD.ArbolB.SplitInfoArbolB;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Backen.Objetos.Usuario;
import com.mycompany.sistema_asignacion.Fronted.UI.FramePrincipal;

public class main {

    private static NodoArbolB<String> dividirLista;

    public static void main(String[] args){
        /*
        DatosSistema datos = new DatosSistema(); 
        try {
            datos.getUsuarios().add(new Usuario(0, "AdminSistema","12345","super"), "AdminSistema");
        } catch (CloneNodeException e) {
            e.printStackTrace();
        }
        FramePrincipal frame = new FramePrincipal(datos); frame.setVisible(true);
        */
        prueba();
    }

    private static void prueba(){
        ArbolB<String> arbol = new ArbolB<>(5);
        try {
            
            arbol.agregar("4", "4");
            arbol.agregar("1", "1");
            arbol.agregar("5", "5");
            arbol.agregar("2", "2");
            arbol.agregar("6", "6");
            arbol.agregar("7", "7");
            arbol.agregar("8", "8");
            arbol.agregar("9", "9");
            arbol.agregar("10", "10");
            arbol.agregar("11", "11");
            arbol.agregar("12", "12");
            arbol.agregar("13", "13");
            arbol.agregar("14", "14");
            arbol.agregar("15", "15");
            arbol.agregar("16", "16");
            arbol.agregar("17", "17");
            
            System.out.println("Busqueda: "+arbol.buscar("10"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
