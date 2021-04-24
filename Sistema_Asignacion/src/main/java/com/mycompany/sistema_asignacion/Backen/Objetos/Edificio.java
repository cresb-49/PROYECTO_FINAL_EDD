package com.mycompany.sistema_asignacion.Backen.Objetos;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaSimple;


/**
 * Edificio
 */
public class Edificio {
    private String nombre;
    private ListaSimple<Salon> salones;
    /**
     * Constructor iniciando 
     * @param nombre
     */
    public Edificio(String nombre){
        this.nombre = nombre;
        this.salones = new ListaSimple();
    }

    /**
     * Constructor vacio de la clase Edificio
     */
    public Edificio(){
        
    }

    /**
     * Retorna el nombre del Edificio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del Edificio
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaSimple<Salon> getSalones() {
        return salones;
    }

    public void setSalones(ListaSimple<Salon> salones) {
        this.salones = salones;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre;
    }
    
}