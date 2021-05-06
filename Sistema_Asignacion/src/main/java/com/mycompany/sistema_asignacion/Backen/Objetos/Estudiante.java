package com.mycompany.sistema_asignacion.Backen.Objetos;

import com.mycompany.sistema_asignacion.Backen.EDD.AVL;

/**
 * Estudiante
 */
public class Estudiante {
    private int carnet;
    private String nombre;
    private String direccion;
    private AVL<Horario> horarios;
    
    public Estudiante(int carnet,String nombre,String direccion){
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarios = new AVL<>();
    }

    /**
     * @return the carnet
     */
    public int getCarnet() {
        return carnet;
    }
    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return carnet;
    }

    @Override
    public boolean equals(Object obj) {
        Estudiante estudiante = (Estudiante)obj;
        //System.out.println("Coparar carnet: "+this.carnet+" , "+estudiante.getCarnet());
        if(this.carnet == estudiante.getCarnet()){
            return true;
        }else{
            return false;
        }
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
    @Override
    public String toString() {
        return "-Carnet: "+carnet+"\\n-Nombre: "+nombre+"\\n-Direccion: "+direccion;
    }
}
