package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.InvalidStructureException;

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
        if (buscar(tag) == null) {
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

    public void agregarOrden(T dato, String tag) throws CloneNodeException, InvalidStructureException {
        if (buscar(tag) == null) {
            if (this.raiz == null) {
                this.raiz = new NodoListaSimple<>(dato, tag, null);
                this.size++;
            } else {
                NodoListaSimple<T> tmp = this.raiz;
                NodoListaSimple<T> nodo = null;
                boolean insertado = false;
                while (tmp.getSiguiente() != null) {
                    nodo = tmp.getSiguiente();
                    if (tag.compareTo(tmp.getTag()) < 0) {
                        insertarAtras(tmp, dato, tag);
                        insertado = true;
                        break;
                    } else if (tag.compareTo(tmp.getTag()) > 0 && tag.compareTo(nodo.getTag()) < 0) {
                        insertarEntre(tmp, nodo, dato, tag);
                        insertado = true;
                        break;
                    } else if (tag.compareTo(tmp.getTag()) > 0 && tag.compareTo(nodo.getTag()) > 0) {
                        tmp = tmp.getSiguiente();
                    }
                }
                if (!insertado) {
                    if (tag.compareTo(tmp.getTag()) < 0) {
                        insertarAtras(tmp, dato, tag);
                    }else{
                        insertarAdelante(tmp, dato, tag);
                    }
                }
                //tmp.setSiguiente(new NodoListaSimple<>(dato, tag, null));
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

            while (tmp.getSiguiente() != null) {
                if (tmp.getSiguiente().getTag().equals(tag)) {
                    NodoListaSimple<T> remplazo = tmp.getSiguiente().getSiguiente();
                    tmp.setSiguiente(remplazo);
                    this.size--;
                }
            }
        } else {
            throw new CloneNodeException("No existe un dato " + tag + " en esta lista");
        }
    }

    private void insertarEntre(NodoListaSimple<T> tmp, NodoListaSimple<T> nodo, T dato, String tag) {
        NodoListaSimple<T> nuevo = new NodoListaSimple<>(dato, tag, nodo);
        tmp.setSiguiente(nuevo);
    }

    private void insertarAtras(NodoListaSimple<T> tmp, T dato, String tag) throws InvalidStructureException {
        if (tmp == this.raiz) {
            NodoListaSimple<T> tmp2 = this.raiz;
            NodoListaSimple<T> nuevo = new NodoListaSimple<>(dato, tag, tmp2);
            this.raiz = nuevo;
        } else {
            throw new InvalidStructureException("Hay un elemento repetido en la lista");
        }
    }

    private void insertarAdelante(NodoListaSimple<T> tmp, T dato, String tag) {
        tmp.setSiguiente(new NodoListaSimple<>(dato,tag,null));
    }
    
    public void imprimirLista(){
        System.out.println("-----------------------------");
        NodoListaSimple<T> tmp = this.raiz;
        if(tmp == null){
            System.out.println("Lista vacia");
        }else{
            while (tmp !=null) {
                System.out.println(tmp.getDato().toString());
                tmp = tmp.getSiguiente();
            }
        }
        System.out.println("-----------------------------");
    }
    
    /**
     * Retorna la raiz de la lista simple
     * @return 
     */
    public NodoListaSimple<T> getRaiz() {
        return raiz;
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
