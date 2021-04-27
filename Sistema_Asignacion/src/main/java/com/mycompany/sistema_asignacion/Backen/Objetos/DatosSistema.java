package com.mycompany.sistema_asignacion.Backen.Objetos;

import com.mycompany.sistema_asignacion.Backen.EDD.*;

public class DatosSistema {
    private ListaCircularDoble<Usuario> usuarios;
    private ListaCircularDoble<Edificio> edificios;
    private ListaCircularDoble<Curso> cursos;
    private AVL<Catedratico> catedraticos;

    public DatosSistema() {
        this.usuarios = new ListaCircularDoble<>();
        this.edificios = new ListaCircularDoble<>();
        this.cursos = new ListaCircularDoble<>();
        this.catedraticos = new AVL<>();
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
}
