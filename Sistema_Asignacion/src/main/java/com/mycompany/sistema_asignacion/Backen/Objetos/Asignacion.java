package com.mycompany.sistema_asignacion.Backen.Objetos;


/**
 * Asignacion
 */
public class Asignacion {
    private int carnet;
    private int horario;
    private int zona;
    private int final_;

    public Asignacion(int carnet, int horario,int zona,int final_){
        this.carnet=carnet;
        this.horario= horario;
        this.zona = zona;
        this.final_ = final_;
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
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }
    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }
    /**
     * @return the final_
     */
    public int getFinal_() {
        return final_;
    }
    /**
     * @param final_ the final_ to set
     */
    public void setFinal_(int final_) {
        this.final_ = final_;
    }
    /**
     * @return the zona
     */
    public int getZona() {
        return zona;
    }
    /**
     * @param zona the zona to set
     */
    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "-Estudiante: "+carnet+"\n-horario: "+horario+"\n-Zona: "+zona+"\n-Final: "+final_;
    }
}