package com.mycompany.sistema_asignacion;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
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
    }
}
