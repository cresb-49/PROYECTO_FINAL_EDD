package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.EDD.Pila;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Asignacion;


public class GraficarAsignacion {
    private ListaCircularDoble<Asignacion> asignaciones;
    
    public  GraficarAsignacion(ListaCircularDoble<Asignacion> asignaciones){
        this.asignaciones = asignaciones;
    }
    
    public String generarDotCode() {

        String modeloNodo = "node[shape = box,height=.1];\n";
        String confRank = "{ rank = same;\n"; // end ;}
        String code = "digraph ASIGNACION {\n";

        Pila<String> declaraciones = new Pila<>();
        Pila<String> relaciones = new Pila<>();
        Pila<String> rank = new Pila<>();
        ListaCircularDoble.NodoLCD tmp = this.asignaciones.getRaiz();

        if (tmp != null) {
            do {

                declaraciones.push("nodeLC_ASIGN" + tmp.getTag() + "[label = \"" + tmp.getData().toString() + "\",group=1];");
                relaciones.push("nodeLC_ASIGN" + tmp.getTag() + " -> " + "nodeLC_ASIGN" + tmp.getSiguiente().getTag()+";");
                relaciones.push("nodeLC_ASIGN" + tmp.getTag() + " -> " + "nodeLC_ASIGN" + tmp.getAnterior().getTag()+";");
                rank.push("nodeLC_ASIGN" + tmp.getTag() + ";");
                tmp = tmp.getSiguiente();

            } while (tmp != this.asignaciones.getRaiz());

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
