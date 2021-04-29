package com.mycompany.sistema_asignacion;

import com.mycompany.sistema_asignacion.Backen.EDD.HashTable;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;
import com.mycompany.sistema_asignacion.Backen.Objetos.Usuario;
import com.mycompany.sistema_asignacion.Fronted.UI.FramePrincipal;

public class main {

    public static void main(String[] args){
        
        DatosSistema datos = new DatosSistema(); 
        try {
            datos.getUsuarios().add(new Usuario(0, "AdminSistema","12345","super"), "AdminSistema");
        } catch (CloneNodeException e) {
            e.printStackTrace();
        }
        FramePrincipal frame = new FramePrincipal(datos); frame.setVisible(true);
        
        //prueba();
    }

    private static void prueba(){
        ListaCircularDoble<Usuario> usuarios = new ListaCircularDoble<>();
        Usuario user1 = new Usuario(1, "nombre1", "password", "tipo");
        Usuario user2 = new Usuario(2, "nombre2", "password", "tipo");
        Usuario user3 = new Usuario(3, "nombre3", "password", "tipo");
        Usuario user4 = new Usuario(4, "nombre4", "password", "tipo");
        Usuario user5 = new Usuario(5, "nombre5", "password", "tipo");
        try {

            usuarios.add(user1, user1.getNombre());
            usuarios.add(user2, user2.getNombre());
            usuarios.add(user3, user3.getNombre());
            usuarios.add(user4, user4.getNombre());
            usuarios.add(user5, user5.getNombre());

            System.out.println(usuarios.buscar(user2));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
