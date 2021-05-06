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
        ListArbolB<String> lista = new ListArbolB<>();
        SplitInfoArbolB<String> splitInfoArbolB = new SplitInfoArbolB<>();
        try {
            /*
            arbol.agregar("4", "4");
            arbol.agregar("1", "1");
            arbol.agregar("5", "5");
            arbol.agregar("2", "2");
            arbol.agregar("6", "6");
            arbol.agregar("6", "6");
            */

            lista.agregar("4", "4");
            lista.agregar("1", "1");
            lista.agregar("5", "5");
            lista.agregar("2", "2");
            lista.agregar("6", "6");
            
            lista.imprimirLista();

            NodoArbolB<String> dividirLista = splitInfoArbolB.dividirLista(lista);

            dividirLista.getMenor().imprimirNodos();
            System.out.println("Nodo: "+dividirLista.getTag());
            dividirLista.getMayor().imprimirNodos();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
