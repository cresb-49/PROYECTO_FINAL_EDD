package com.mycompany.sistema_asignacion.Backen.Objetos;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;

public class Horario {
    private int codigo;
    private String hora;
    private String dia;
    private int codigoCurso;
    private int salon;
    private String edificio;
    private int codeCatedratico;
    private ListaCircularDoble<Asignacion> asignaciones;

    public Horario(int codigo,String hora,String dia,int codigoCurso,int salon,String edificio,int codeCatedratico){
        this.codigo = codigo;
        this.hora = hora;
        this.dia = dia;
        this.codigoCurso = codigoCurso;
        this.salon = salon;
        this.codeCatedratico = codeCatedratico;
        this.edificio = edificio;
        this.asignaciones = new ListaCircularDoble<>();
    }

    /**
     * @return the codeCatedratico
     */
    public int getCodeCatedratico() {
        return codeCatedratico;
    }
    /**
     * @param codeCatedratico the codeCatedratico to set
     */
    public void setCodeCatedratico(int codeCatedratico) {
        this.codeCatedratico = codeCatedratico;
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
     * @return the codigoCurso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }
    /**
     * @param codigoCurso the codigoCurso to set
     */
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }
    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }
    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     * @return the salon
     */
    public int getSalon() {
        return salon;
    }
    /**
     * @param salon the salon to set
     */
    public void setSalon(int salon) {
        this.salon = salon;
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
    /**
     * @return the asignaciones
     */
    public ListaCircularDoble<Asignacion> getAsignaciones() {
        return asignaciones;
    }
    /**
     * @param asignaciones the asignaciones to set
     */
    public void setAsignaciones(ListaCircularDoble<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "-Codigo: "+codigo+"\n-Horario: "+hora+"\n-Dia: "+dia+"\n-Curso: "+codigoCurso+"\n-Salon: "+salon+"\n-Edificio: "+edificio+"\n-Catedratico: "+codeCatedratico;
    }
}
