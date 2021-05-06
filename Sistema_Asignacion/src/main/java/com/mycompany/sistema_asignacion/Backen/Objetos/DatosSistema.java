package com.mycompany.sistema_asignacion.Backen.Objetos;

import com.mycompany.sistema_asignacion.Backen.EDD.*;
import com.mycompany.sistema_asignacion.Backen.EDD.ArbolB.ArbolB;

public class DatosSistema {
    private ListaCircularDoble<Usuario> usuarios;
    private ListaCircularDoble<Edificio> edificios;
    private ListaCircularDoble<Curso> cursos;
    private AVL<Catedratico> catedraticos;
    private HashTable<Estudiante> estudiantes;
    private AVL<Horario> horarios;

    public DatosSistema() {
        this.usuarios = new ListaCircularDoble<>();
        this.edificios = new ListaCircularDoble<>();
        this.cursos = new ListaCircularDoble<>();
        this.catedraticos = new AVL<>();
        this.estudiantes = new HashTable<>();
        this.horarios = new AVL<>();
    }

    /**
     * @return the usuarios
     */
    public ListaCircularDoble<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ListaCircularDoble<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the edificios
     */
    public ListaCircularDoble<Edificio> getEdificios() {
        return edificios;
    }

    /**
     * @param edificios the edificios to set
     */
    public void setEdificios(ListaCircularDoble<Edificio> edificios) {
        this.edificios = edificios;
    }
    /**
     * @return the cursos
     */
    public ListaCircularDoble<Curso> getCursos() {
        return cursos;
    }
    /**
     * @param cursos the cursos to set
     */
    public void setCursos(ListaCircularDoble<Curso> cursos) {
        this.cursos = cursos;
    }
    /**
     * @return the catedraticos
     */
    public AVL<Catedratico> getCatedraticos() {
        return catedraticos;
    }
    /**
     * @param catedraticos the catedraticos to set
     */
    public void setCatedraticos(AVL<Catedratico> catedraticos) {
        this.catedraticos = catedraticos;
    }
    /**
     * @return the estudiantes
     */
    public HashTable<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    /**
     * @param estudiantes the estudiantes to set
     */
    public void setEstudiantes(HashTable<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    /**
     * @return the horarios
     */
    public AVL<Horario> getHorarios() {
        return horarios;
    }
    /**
     * @param horarios the horarios to set
     */
    public void setHorarios(AVL<Horario> horarios) {
        this.horarios = horarios;
    }
}
