package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.AVL;
import com.mycompany.sistema_asignacion.Backen.Graphviz.ParametrosGraphviz;
import com.mycompany.sistema_asignacion.Backen.Objetos.Catedratico;

public class GraficarCatedraticos {

    private AVL<Catedratico> catedraticos;

    public GraficarCatedraticos(AVL<Catedratico> catedraticos) {
        this.catedraticos = catedraticos;
    }

    public String generarDotCode() {
        if (catedraticos != null) {
            if (!catedraticos.isEmpty()) {
                ParametrosGraphviz parametrosGraphviz = this.catedraticos.obtenerGrafico();

                return "digraph CATEDRATICOS {\n" + parametrosGraphviz.getModeloNodo() + parametrosGraphviz.getDeclaraciones() + parametrosGraphviz.getRelaciones() + "\n}";
            }
        }
        return null;
    }
}
