package com.mycompany.sistema_asignacion.Backen.Objetos;
/**
 * Curso
 */
public class Curso {
    private int codigo;
    private String nombre;
    private int semestre;
    private int creditos;

    public Curso(int codigo,String nombre,int semestre,int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }
    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
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
    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return "-Codigo: "+codigo+"\n-Nombre: "+nombre+"\n-Semestre: "+semestre+"\n-Creditos: "+creditos;
    }
}