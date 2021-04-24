package com.mycompany.sistema_asignacion.Backen.Objetos;
import java.util.Set;

/**
 * Salon
 */
public class Salon {
    private int numeroSalon;
    private int cantidadEstudiantes;
    
    /**
     * Contructor con parametos de la clase Salon
     * @param numeroSalon
     * @param cantidadEstudiantes
     */
    public Salon(int numeroSalon,int cantidadEstudiantes){
        this.numeroSalon = numeroSalon;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    /**
     * Contructor vacio de la clase
     */
    public Salon(){

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

    @Override
    public String toString() {
        return "- Salon: "+numeroSalon+"\n-Estudiantes: "+cantidadEstudiantes;
    }
}