package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.HashTable;
import com.mycompany.sistema_asignacion.Backen.Objetos.Estudiante;

public class GraficarEstudiantes {

    private HashTable<Estudiante> estudiantes;

    public GraficarEstudiantes(HashTable<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public String generarDotCode() {
        if (estudiantes != null) {
            return "digraph ESTUDIANTES {\n" + estudiantes.generarDotCode() + "\n}";
        }
        return null;
    }
}
