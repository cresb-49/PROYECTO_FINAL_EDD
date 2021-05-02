package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.EDD.Pila;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble.NodoLCD;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Usuario;

public class GraficarUsuarios {

    private ListaCircularDoble<Usuario> usuarios;

    public GraficarUsuarios(ListaCircularDoble<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String generarDotCode() {

        String modeloNodo = "node[shape = box,height=.1];\n";
        String confRank = "{ rank = same;\n"; // end ;}
        String code = "digraph USUARIOS {\n";

        Pila<String> declaraciones = new Pila<>();
        Pila<String> relaciones = new Pila<>();
        Pila<String> rank = new Pila<>();
        NodoLCD tmp = this.usuarios.getRaiz();

        if (tmp != null) {
            do {

                declaraciones.push("nodeLC_USER" + tmp.getTag() + "[label = \"" + tmp.getData().toString() + "\",group=1];");
                relaciones.push("nodeLC_USER" + tmp.getTag() + " -> " + "nodeLC_USER" + tmp.getSiguiente().getTag()+";");
                relaciones.push("nodeLC_USER" + tmp.getTag() + " -> " + "nodeLC_USER" + tmp.getAnterior().getTag()+";");
                rank.push("nodeLC_USER" + tmp.getTag() + ";");
                tmp = tmp.getSiguiente();

            } while (tmp != this.usuarios.getRaiz());

            code = code + modeloNodo + "\n";

            while (!declaraciones.isEmpty()) {
                try {
                    code = code + declaraciones.pop() + "\n";
                } catch (NoDataException e) {
                    System.out.println(e.getMessage());
                }
            }

            code = code + confRank;
            while (!rank.isEmpty()) {
                try {
                    code = code + rank.pop() + "\n";
                } catch (NoDataException e) {
                    System.out.println(e.getMessage());
                }
            }
            code = code + "}\n";


            while (!relaciones.isEmpty()) {
                try {
                    code = code + relaciones.pop() + "\n";
                } catch (NoDataException e) {
                    System.out.println(e.getMessage());
                }
            }

            code = code + "}";
        } else {
            code = null;
        }

        return code;
    }
}
