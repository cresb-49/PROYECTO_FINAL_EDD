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
    private GraficarEstudiantes graficarEstudiantes;
    private GraficarEdificiosSalones graficarEdificiosSalones;
    private GraficadorHorario graficadorHorario;
    

    public Graficadores(DatosSistema datosSistema){
        this.datosSistema = datosSistema;
        this.ejecutarGraphviz = new EjecutarGraphviz();
        this.generarDotFile = new GenerarDotFile();
        
        this.graficarUsuarios = new GraficarUsuarios(this.datosSistema.getUsuarios());
        this.graficarCatedraticos = new GraficarCatedraticos(this.datosSistema.getCatedraticos());
        this.graficarEstudiantes = new GraficarEstudiantes(this.datosSistema.getEstudiantes());
        this.graficarEdificiosSalones = new GraficarEdificiosSalones(this.datosSistema.getEdificios());
        this.graficadorHorario = new GraficadorHorario(this.datosSistema.getHorarios());
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
    /**
     * 
     * @return the graficarEstudiantes
     */
    public GraficarEstudiantes getGraficarEstudiantes() {
        return graficarEstudiantes;
    }
    /**
     * 
     * @return the graficarEdificiosSalones
     */
    public GraficarEdificiosSalones getGraficarEdificiosSalones() {
        return graficarEdificiosSalones;
    }
    /**
     * 
     * @return 
     */
    public GraficadorHorario getGraficadorHorario() {
        return graficadorHorario;
    }
}
