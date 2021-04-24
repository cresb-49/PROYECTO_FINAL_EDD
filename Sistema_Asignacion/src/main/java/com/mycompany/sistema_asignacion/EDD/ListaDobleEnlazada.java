/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.EDD;

import com.mycompany.sistema_asignacion.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Exceptions.NotFoundNodeException;
import com.mycompany.sistema_asignacion.Exceptions.NullTagException;

public class ListaDobleEnlazada<T> {

    private NodoListaDoble<T> raiz;

    public ListaDobleEnlazada() {
        this.raiz = null;
    }

    /**
     * Agrega un elemento a la lista doble enlazada
     *
     * @param data
     * @param tag
     * @throws CloneNodeException
     * @throws NullTagException
     */
    public void agregar(T data, String tag) throws CloneNodeException, NullTagException {
        if (tag == null) {
            throw new NullTagException("Se debe de agregar un tag de identificacion");
        } else {
            //NodoListaDoble<T> nuevo = new NodoListaDoble(raiz, tag);
            NodoListaDoble<T> nuevo = new NodoListaDoble(this.raiz,tag);
            if (this.raiz == null) {
                this.raiz = nuevo;
            } else {
                if (this.buscar(nuevo.getTag()) == null) {
                    NodoListaDoble<T> tmp = this.raiz;

                    while (tmp != null) {
                        if (tmp.getSiguiente() == null) {
                            tmp.setSiguiente(nuevo);
                            nuevo.setAnterior(tmp);
                            break;
                        }
                        tmp = tmp.getSiguiente();
                    }
                } else {
                    throw new CloneNodeException("Ya existe un elemento con tag: " + nuevo.getTag());
                }
            }
        }
    }

    /**
     * Busca un elemento en la lista si no existe retorna null
     *
     * @param tag
     * @return
     */
    public T buscar(String tag) {
        if (this.raiz != null) {
            NodoListaDoble<T> tmp = this.raiz;
            if (tmp != null) {
                while (tmp != null) {
                    if (tmp.getTag().equals(tag)) {
                        return tmp.getData();
                    }
                    tmp = tmp.getSiguiente();
                }
            }
        }
        return null;
    }

    /**
     * Elimina un elemeto de la lista segun el tag de identificacion
     *
     * @param tag
     * @throws NotFoundNodeException
     */
    public void eliminar(String tag) throws NotFoundNodeException {

        if (this.buscar(tag) != null) {
            NodoListaDoble<T> tmp = this.raiz;
            boolean eliminado = false;
            while (!eliminado) {
                if (tmp.getTag().equals(tag)) {
                    if (tmp == this.raiz) {
                        NodoListaDoble<T> ant = this.raiz.getAnterior();
                        NodoListaDoble<T> sig = this.raiz.getSiguiente();
                        if (sig != null) {
                            sig.setAnterior(ant);
                        }
                        this.raiz = sig;
                        eliminado = true;
                        break;
                    } else {
                        NodoListaDoble<T> ant = tmp.getAnterior();
                        NodoListaDoble<T> sig = tmp.getSiguiente();
                        ant.setSiguiente(sig);
                        if (sig != null) {
                            sig.setAnterior(ant);
                        }
                        eliminado = true;
                        break;
                    }
                }

                tmp = tmp.getSiguiente();
            }
        } else {
            throw new NotFoundNodeException("No existe un elemento con tag: " + tag);
        }
    }

    /**
     * Imprime la lista doble enlazada
     */
    public void imprimirLista() {
        NodoListaDoble<T> tmp = raiz;

        if (this.raiz == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("--------------------------");
            while (tmp != null) {
                System.out.println(tmp.toString());
                tmp = tmp.getSiguiente();
            }
            System.out.println("--------------------------");
        }
    }

    /**
     * Retorna un valor logico true si la lista esta vacia, de lo contrario
     * retornara false
     *
     * @return
     */
    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public class NodoListaDoble<T> {

        private NodoListaDoble<T> siguiente;
        private NodoListaDoble<T> anterior;
        private T data;
        private String tag;

        public NodoListaDoble(T data, String tag) {
            this.data = data;
            this.tag = tag;
        }

        public NodoListaDoble<T> getSiguiente() {
            return siguiente;
        }

        public NodoListaDoble<T> getAnterior() {
            return anterior;
        }

        public void setSiguiente(NodoListaDoble<T> siguiente) {
            this.siguiente = siguiente;
        }

        public void setAnterior(NodoListaDoble<T> anterior) {
            this.anterior = anterior;
        }

        public T getData() {
            return data;
        }

        public String getTag() {
            return tag;
        }

        @Override
        public String toString() {
            return "Data: " + data + ", Tag: " + tag;
        }

    }
}
