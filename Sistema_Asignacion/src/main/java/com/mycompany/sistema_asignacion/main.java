package com.mycompany.sistema_asignacion;

import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Fronted.UI.FramePrincipal;

public class main {

    public static void main(String[] args) {
        DatosSistema datos = new DatosSistema(); FramePrincipal frame = new
        FramePrincipal(datos); frame.setVisible(true);

    }
}
