package com.mycompany.sistema_asignacion.EDD;

import com.mycompany.sistema_asignacion.Exceptions.CloneNodeException;

public class ListaSimple<T> {

    private NodoListaSimple<T> raiz;
    private int size;

    /**
     * Contructor de la lista
     */
    public ListaSimple() {
        this.raiz = null;
        this.size = 0;
    }

    public void agregar(T dato, String tag) throws CloneNodeException {
        if (buscar(tag) != null) {
            if (this.raiz == null) {
                this.raiz = new NodoListaSimple<>(dato, tag, null);
                this.size++;
            } else {
                NodoListaSimple<T> tmp = this.raiz;
                while (tmp.getSiguiente() != null) {
                    tmp = tmp.getSiguiente();
                }
                tmp.setSiguiente(new NodoListaSimple<>(dato, tag, null));
                this.size++;
            }
        } else {
            throw new CloneNodeException("Ya existe un dato " + tag + " en esta lista");
        }
    }

    public T buscar(String tag) {
        NodoListaSimple<T> tmp = this.raiz;
        while (tmp != null) {
            if (tmp.getTag().equals(tag)) {
                return tmp.getDato();
            }
            tmp = tmp.getSiguiente();
        }
        return null;
    }

    public void eliminar(String tag) throws CloneNodeException {
        if (buscar(tag) != null) {
            NodoListaSimple<T> tmp = this.raiz;
            
            while (tmp.getSiguiente()!=null) {                
                if(tmp.getSiguiente().getTag().equals(tag)){
                    NodoListaSimple<T> remplazo = tmp.getSiguiente().getSiguiente();
                    tmp.setSiguiente(remplazo);
                    this.size--;
                }
            }
        } else {
            throw new CloneNodeException("No existe un dato " + tag + " en esta lista");
        }
    }

    public class NodoListaSimple<T> {

        private NodoListaSimple<T> siguiente;
        private T dato;
        private String tag;

        /**
         * Contructor de n
         *
         * @param data
         * @param siguiente
         */
        public NodoListaSimple(T data, String tag, NodoListaSimple<T> siguiente) {
            this.dato = data;
            this.tag = tag;
            this.siguiente = siguiente;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public NodoListaSimple<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoListaSimple<T> siguiente) {
            this.siguiente = siguiente;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @Override
        public String toString() {
            return dato.toString();
        }

    }
}
