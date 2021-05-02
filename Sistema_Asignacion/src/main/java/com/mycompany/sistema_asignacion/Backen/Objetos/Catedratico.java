package com.mycompany.sistema_asignacion.Backen.Objetos;
/**
 * Catedratico
 */
public class Catedratico {
    private int id;
    private String nombre;
    private String direccion;

    public Catedratico(int id, String nombre,String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
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
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "-Identificador: "+id+"\\n-Nombre: "+nombre+"\\n-Direcccion: "+direccion;
    }   
}