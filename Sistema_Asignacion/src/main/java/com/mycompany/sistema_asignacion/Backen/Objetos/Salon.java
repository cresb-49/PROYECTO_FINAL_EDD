package com.mycompany.sistema_asignacion.Backen.Objetos;
import java.util.Set;

/**
 * Salon
 */
public class Salon {
    private int numeroSalon;
    private int cantidadEstudiantes;
    private String edificio;
    
    /**
     * Contructor con parametos de la clase Salon
     * @param numeroSalon
     * @param cantidadEstudiantes
     */
    public Salon(int numeroSalon,int cantidadEstudiantes,String edificio){
        this.numeroSalon = numeroSalon;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.edificio = edificio;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public int getNumeroSalon() {
        return numeroSalon;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public void setNumeroSalon(int numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    /**
     * @return the edificio
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "- Salon: "+numeroSalon+"\\n-Estudiantes: "+cantidadEstudiantes;
    }
}