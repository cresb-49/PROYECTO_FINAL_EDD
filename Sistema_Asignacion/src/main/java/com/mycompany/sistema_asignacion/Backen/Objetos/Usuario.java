package com.mycompany.sistema_asignacion.Backen.Objetos;
/**
 * Usuario
 */
public class Usuario {
    /**Colaborador, Estudiante, Admin*/
    
    private int id;
    private String nombre;
    private String password;
    private String tipo;

    /**
     * Contructor con parametos de usuario
     * @param id
     * @param nombre
     * @param password
     * @param tipo
     */
    public Usuario(int id,String nombre,String password,String tipo){
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    /**
     * Constructor vacio
     */
    public Usuario(){

    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPassword() {
        return password;
    }
    public String getTipo() {
        return tipo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public boolean equals(Usuario usuario) {
        return usuario.getId()==this.id;
    }
    @Override
    public String toString() {
        return "-Id: "+id+"\n-Tipo: "+tipo+"\n-Nombre: "+nombre+"\n-Password: "+password;
    }
}