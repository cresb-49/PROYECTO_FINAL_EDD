package com.mycompany.sistema_asignacion.Backen.EDD.ArbolB;

public class NodoArbolB<T> {

    private T data;
    private String tag;
    private NodoArbolB<T> anterior;
    private NodoArbolB<T> siguiente;
    private ListArbolB<T> menor;
    private ListArbolB<T> mayor;

    public NodoArbolB(T data,String tag){
        this.data = data;
        this.tag = tag;
    }

    public NodoArbolB(T data,String tag,NodoArbolB<T> anterior,NodoArbolB<T> siguiente){
        this.data = data;
        this.tag = tag;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    /**
     * @return the data
     */
    public T getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
    /**
     * @return the mayor
     */
    public ListArbolB<T> getMayor() {
        return mayor;
    }
    /**
     * @param mayor the mayor to set
     */
    public void setMayor(ListArbolB<T> mayor) {
        this.mayor = mayor;
    }
    /**
     * @return the menor
     */
    public ListArbolB<T> getMenor() {
        return menor;
    }
    /**
     * @param menor the menor to set
     */
    public void setMenor(ListArbolB<T> menor) {
        this.menor = menor;
    }
    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }
    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the anterior
     */
    public NodoArbolB<T> getAnterior() {
        return anterior;
    }
    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoArbolB<T> anterior) {
        this.anterior = anterior;
    }
    /**
     * @return the siguiente
     */
    public NodoArbolB<T> getSiguiente() {
        return siguiente;
    }
    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoArbolB<T> siguiente) {
        this.siguiente = siguiente;
    }

    public boolean equals(NodoArbolB<T> obj) {
        return obj.getTag().equals(this.tag);
    }
    @Override
    public String toString() {
        return "\n-Anterior:"+((this.anterior==null)?"null":this.anterior.getTag())+"\n-Contenido: "+this.data.toString()+"\n-Siguiente: "+((this.siguiente==null)?"null":this.siguiente.getTag());
    }
}
