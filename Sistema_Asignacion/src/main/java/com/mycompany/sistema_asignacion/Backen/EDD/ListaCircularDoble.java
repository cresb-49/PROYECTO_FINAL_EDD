package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;

public class ListaCircularDoble<T> {

    private NodoLCD<T> raiz;
    private int legth = 0;

    public ListaCircularDoble() {
        this.raiz = null;
    }

    /**
     * Agrega los objetos en orden en base al index del nodo
     *
     * @param nuevo
     */
    public void addOrden(T dato, String tag) throws CloneNodeException {

        NodoLCD<T> nuevo = new NodoLCD<>(tag, dato);

        if (raiz == null) {
            raiz = nuevo;
            raiz.setSiguiente(raiz);
            raiz.setAnterior(raiz);
            legth++;
        } else {
            T busqueda = this.buscar(nuevo.getTag());
            if (busqueda == null) {
                NodoLCD<T> tmp = raiz;
                boolean insertado = false;
                do {
                    if (nuevo.getTag().compareTo(tmp.getSiguiente().getTag()) < 0) {
                        if (nuevo.getTag().compareTo(tmp.getTag()) > 0) {
                            insertarAdelante(tmp, nuevo);
                            insertado = true;
                            legth++;
                            break;
                        } else if (nuevo.getTag().compareTo(tmp.getTag()) < 0) {
                            insertarPrimero(nuevo);
                            insertado = true;
                            legth++;
                            break;
                        }
                    }
                    tmp = tmp.getSiguiente();
                } while (tmp != this.raiz);

                if (!insertado) {
                    insertarUltimo(nuevo);
                    legth++;
                }
            } else {
                throw new CloneNodeException("Ya existe elemento con la etiqueta: " + nuevo.getTag());
            }

        }
    }

    /**
     * Ingresa el elemneto sis ningun orden en el tag
     *
     * @param dato
     * @param tag
     * @throws CloneNodeException
     */
    public void add(T dato, String tag) throws CloneNodeException {
        NodoLCD<T> nuevo = new NodoLCD<>(tag, dato);
        if (raiz == null) {
            raiz = nuevo;
            raiz.setSiguiente(raiz);
            raiz.setAnterior(raiz);
        } else {
            T busqueda = this.buscar(nuevo.getTag());
            if (busqueda == null) {
                this.insertarUltimo(nuevo);
            } else {
                throw new CloneNodeException("Ya existe elemento con la etiqueta: " + nuevo.getTag());
            }

        }
    }

    public int getLegth() {
        return legth;
    }

    public boolean isEmpty() {
        return (this.raiz == null);
    }

    private void insertarAdelante(NodoLCD<T> base, NodoLCD<T> nuevo) {
        NodoLCD<T> tmp = base.getSiguiente();
        base.setSiguiente(nuevo);
        nuevo.setAnterior(base);
        nuevo.setSiguiente(tmp);
        tmp.setAnterior(nuevo);
    }

    private void insertarPrimero(NodoLCD<T> nuevo) {
        nuevo.setSiguiente(this.raiz);
        nuevo.setAnterior(this.raiz.getAnterior());
        this.raiz.getAnterior().setSiguiente(nuevo);
        this.raiz.setAnterior(nuevo);
        this.raiz = nuevo;
    }

    private void insertarUltimo(NodoLCD<T> nuevo) {
        NodoLCD<T> ant = this.raiz.getAnterior();
        nuevo.setSiguiente(this.raiz);
        nuevo.setAnterior(ant);
        ant.setSiguiente(nuevo);
        this.raiz.setAnterior(nuevo);
    }

    public void imprimir() {
        NodoLCD<T> tmp = this.raiz;
        System.out.println("--------------------------");
        do {
            System.out.println(tmp.toString());
            tmp = tmp.getSiguiente();
        } while (tmp != this.raiz);
        System.out.println("--------------------------");
    }

    public T buscar(String tag) {
        NodoLCD<T> tmp2 = this.raiz;
        if (tmp2 != null) {
            do {
                if (tmp2.getTag().equals(tag)) {
                    return tmp2.getData();
                }
                tmp2 = tmp2.getSiguiente();
            } while (tmp2 != this.raiz);
        }
        return null;
    }

    /**
     * Busqueda por medio de objetos
     *
     * @param modelo
     * @return
     */
    public T buscar(T modelo) {
        NodoLCD<T> tmp2 = this.raiz;
        if (tmp2 != null) {
            do {
                if (tmp2.getData().equals(modelo)) {
                    return tmp2.getData();
                }
                tmp2 = tmp2.getSiguiente();
            } while (tmp2 != this.raiz);
        }
        return null;
    }

    private NodoLCD<T> buscarNodo(String tag) {
        NodoLCD<T> tmp2 = this.raiz;
        if (tmp2 != null) {
            do {
                if (tmp2.getTag().equals(tag)) {
                    return tmp2;
                }
                tmp2 = tmp2.getSiguiente();
            } while (tmp2 != this.raiz);
        }
        return null;
    }

    public void eliminar(String tag) throws NotFoundNodeException {
        if (this.buscar(tag) != null) {
            boolean eliminado = false;
            NodoLCD<T> tmp = this.raiz;
            do {
                if (tmp.getTag().equals(tag)) {
                    if (tmp == this.raiz) {
                        NodoLCD<T> ant = this.raiz.getAnterior();
                        NodoLCD<T> sig = this.raiz.getSiguiente();
                        if (this.raiz == this.raiz.getSiguiente() && this.raiz == this.raiz.getAnterior()) {
                            this.raiz = null;
                            eliminado = true;
                            legth--;
                        } else {
                            ant.setSiguiente(sig);
                            sig.setAnterior(ant);
                            this.raiz = sig;
                            eliminado = true;
                            legth--;
                        }
                    } else {
                        NodoLCD<T> ant = tmp.getAnterior();
                        NodoLCD<T> sig = tmp.getSiguiente();
                        ant.setSiguiente(sig);
                        sig.setAnterior(ant);
                        eliminado = true;
                        legth--;
                    }
                }
                tmp = tmp.getSiguiente();
            } while (!eliminado);
        } else {
            throw new NotFoundNodeException("No existe un elemento con el tag: " + tag);
        }
    }

    /**
     * Modifica el tag de busqueda de un nodo
     *
     * @param oldTag
     * @param newTag
     * @throws NotFoundNodeException
     */
    public void modificarTag(String oldTag, String newTag) throws NotFoundNodeException {
        NodoLCD<T> tmp = this.buscarNodo(oldTag);
        if (tmp == null) {
            throw new NotFoundNodeException("No existe un nodo con la tag ingresada");
        } else {
            tmp.setTag(newTag);
        }
    }

    /**
     * Retorna el ultimo elemento de la lista circular
     *
     * @return
     */
    public T getUltimo() {
        if (this.raiz == null) {
            return null;
        } else {
            return this.raiz.getAnterior().getData();
        }
    }

    public T[] listToArray(Class<T[]> arrayType) {
        T[] array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(), (this.legth)));
        NodoLCD<T> tmp = this.raiz;
        if (tmp != null) {
            int cont = 0;
            do {
                array[cont] = tmp.getData();
                tmp = tmp.getSiguiente();
                cont++;
            } while (tmp != this.raiz);
        }
        return (T[]) array;
    }

    /**
     * @return the raiz
     */
    public NodoLCD<T> getRaiz() {
        return raiz;
    }

    public class NodoLCD<T> {

        private NodoLCD<T> anterior;
        private NodoLCD<T> siguiente;
        private T data;
        private String tag;

        public NodoLCD(String tag, T data) {
            this.tag = tag;
            this.data = data;
            this.anterior = null;
            this.siguiente = null;
        }

        /**
         * @return the anterior
         */
        public NodoLCD<T> getAnterior() {
            return anterior;
        }

        /**
         * @param anterior the anterior to set
         */
        public void setAnterior(NodoLCD<T> anterior) {
            this.anterior = anterior;
        }

        /**
         * @return the siguiente
         */
        public NodoLCD<T> getSiguiente() {
            return siguiente;
        }

        /**
         * @param siguiente the siguiente to set
         */
        public void setSiguiente(NodoLCD<T> siguiente) {
            this.siguiente = siguiente;
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

        @Override
        public String toString() {
            return "Tag: " + this.tag + " ,Data: " + this.data;
        }
    }
}
