package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.AVL;
import com.mycompany.sistema_asignacion.Backen.Graphviz.ParametrosGraphviz;
import com.mycompany.sistema_asignacion.Backen.Objetos.Horario;

public class GraficadorHorario {
    private AVL<Horario> horarios;
    public GraficadorHorario(AVL<Horario> horarios){
        this.horarios = horarios;
    }
    public String generarDotCode() {
        if (horarios != null) {
            if (!horarios.isEmpty()) {
                ParametrosGraphviz parametrosGraphviz = this.horarios.obtenerGrafico();

                return "digraph HORARIOS {\n" + parametrosGraphviz.getModeloNodo() + parametrosGraphviz.getDeclaraciones() + parametrosGraphviz.getRelaciones() + "\n}";
            }
        }
        return null;
    }
}
