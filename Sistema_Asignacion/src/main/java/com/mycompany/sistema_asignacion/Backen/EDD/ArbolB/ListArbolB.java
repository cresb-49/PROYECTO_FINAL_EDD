package com.mycompany.sistema_asignacion.Backen.EDD.ArbolB;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;

public class ListArbolB<T> {
    private NodoArbolB<T> padre;
    private NodoArbolB<T> raiz;
    private int size = 0;

    public ListArbolB(){
        this.raiz = null;
        this.padre = null;
    }

    public void agregar(T data,String tag) throws CloneNodeException{
        NodoArbolB<T> nuevo = new NodoArbolB<T>(data, tag);
        if(this.raiz == null){
            this.raiz = nuevo;
            System.out.println("Elemento agregado " + tag);
            this.size++;
        }else{
            NodoArbolB<T> tmp = this.raiz;
            while (tmp!=null) {
                int val = nuevo.getTag().compareTo(tmp.getTag());
                if(val == 0){
                    throw new CloneNodeException("Ya existe un elemento "+tag);
                }else if(val < 0){
                    this.insertarAtras(tmp,nuevo);
                    this.size++;
                    System.out.println("Elemento agregado " + tag);
                    break;
                }else if(val > 0){
                    if(tmp.getSiguiente() == null){
                        insertarAdelante(tmp, nuevo);
                        this.size++;
                        System.out.println("Elemento agregado " + tag);
                        break;
                    }else{
                        tmp = tmp.getSiguiente();
                    }
                }
            }
        }
    }

    public void agregarNodo(NodoArbolB<T> nuevo) throws CloneNodeException{
        if(this.raiz == null){
            this.raiz = nuevo;
            this.size++;
        }else{
            NodoArbolB<T> tmp = this.raiz;
            while (tmp!=null) {
                int val = nuevo.getTag().compareTo(tmp.getTag());
                if(val == 0){
                    throw new CloneNodeException("Ya existe un elemento "+nuevo.getTag());
                }else if(val < 0){
                    this.insertarAtras(tmp,nuevo);
                    this.size++;
                    break;
                }else if(val > 0){
                    if(tmp.getSiguiente() == null){
                        insertarAdelante(tmp, nuevo);
                        this.size++;
                        break;
                    }else{
                        tmp = tmp.getSiguiente();
                    }
                }
            }
        }
    }

    private void insertarAdelante(NodoArbolB<T> tmp, NodoArbolB<T> nuevo) {
        NodoArbolB<T> siguienteTmp = tmp.getSiguiente();
        tmp.setSiguiente(nuevo);
        nuevo.setAnterior(tmp);
        nuevo.setSiguiente(siguienteTmp);
        if(siguienteTmp!=null){
            siguienteTmp.setAnterior(nuevo);
        }
    }

    private void insertarAtras(NodoArbolB<T> tmp, NodoArbolB<T> nuevo) {
        if(tmp==this.raiz){
            this.raiz = nuevo;
            nuevo.setAnterior(null);
            nuevo.setSiguiente(tmp);
            tmp.setAnterior(nuevo);
        }else{
            NodoArbolB<T> anteriorTmp = tmp.getAnterior();
            nuevo.setAnterior(anteriorTmp);
            if(anteriorTmp!=null){
                anteriorTmp.setSiguiente(nuevo);
            }
            nuevo.setSiguiente(tmp);
            tmp.setAnterior(nuevo);
        }
    }

    /**
     * @return the raiz
     */
    public NodoArbolB<T> getRaiz() {
        return raiz;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return this.raiz.toString();
    }

    public void imprimirLista(){
        System.out.println("--------------------");
        NodoArbolB<T> tmp = this.raiz;
        while (tmp!=null) {
            System.out.println(tmp.getData().toString());
            tmp = tmp.getSiguiente();
        }
        System.out.println("--------------------");
    }
    public void imprimirNodos(){
        System.out.println("--------------------");
        NodoArbolB<T> tmp = this.raiz;
        while (tmp!=null) {
            System.out.println(tmp.toString());
            tmp = tmp.getSiguiente();
        }
        System.out.println("--------------------");
    }
    /**
     * @return the padre
     */
    public NodoArbolB<T> getPadre() {
        return padre;
    }
    /**
     * @param padre the padre to set
     */
    public void setPadre(NodoArbolB<T> padre) {
        this.padre = padre;
    }
}
