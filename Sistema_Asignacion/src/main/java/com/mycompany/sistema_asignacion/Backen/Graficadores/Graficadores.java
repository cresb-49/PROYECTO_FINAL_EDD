package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.Graphviz.EjecutarGraphviz;
import com.mycompany.sistema_asignacion.Backen.Graphviz.GenerarDotFile;
import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;

public class Graficadores {
    private DatosSistema datosSistema;
    
    private EjecutarGraphviz ejecutarGraphviz;
    private GenerarDotFile generarDotFile;


    private GraficarUsuarios graficarUsuarios;
    private GraficarCatedraticos graficarCatedraticos;

    public Graficadores(DatosSistema datosSistema){
        this.datosSistema = datosSistema;
        this.ejecutarGraphviz = new EjecutarGraphviz();
        this.generarDotFile = new GenerarDotFile();
        
        this.graficarUsuarios = new GraficarUsuarios(this.datosSistema.getUsuarios());
        this.graficarCatedraticos = new GraficarCatedraticos(this.datosSistema.getCatedraticos());
    }

    /**
     * @return the graficarUsuarios
     */
    public GraficarUsuarios getGraficarUsuarios() {
        return graficarUsuarios;
    }
    /**
     * @return the ejecutarGraphviz
     */
    public EjecutarGraphviz getEjecutarGraphviz() {
        return ejecutarGraphviz;
    }
    /**
     * @return the generarDotFile
     */
    public GenerarDotFile getGenerarDotFile() {
        return generarDotFile;
    }
    /**
     * @return the graficarCatedraticos
     */
    public GraficarCatedraticos getGraficarCatedraticos() {
        return graficarCatedraticos;
    }
}
