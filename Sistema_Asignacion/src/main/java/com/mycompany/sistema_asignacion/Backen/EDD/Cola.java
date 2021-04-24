package com.mycompany.sistema_asignacion.Backen.EDD;

public class Cola<T> {

    private NodoCola<T> raiz;

    /**
     * Inicializa la cola vacia
     */
    public Cola() {

    }

    /**
     * Inicializa la cola con un objeto
     *
     * @param dato
     */
    public Cola(T dato) {
        NodoCola<T> nuevo = new NodoCola(dato);
        this.raiz = nuevo;
    }

    public void agregar(T dato) {
        NodoCola<T> nuevo = new NodoCola(dato);
        if (raiz == null) {
            this.raiz = nuevo;
        } else {
            this.agregarNodo(this.raiz, nuevo);
        }
    }

    private void agregarNodo(NodoCola<T> referencia, NodoCola<T> nuevo) {
        if (referencia.getSiguiente() == null) {
            referencia.setSiguiente(nuevo);
        } else {
            this.agregarNodo(referencia.getSiguiente(), nuevo);
        }
    }

    public T tomar() {
        if (raiz == null) {
            return null;
        } else {
            NodoCola<T> tmp = raiz;
            raiz = tmp.getSiguiente();
            T cont = tmp.getContenido();
            tmp = null;
            return cont;
        }
    }

    /**
     * Retorna el inicio de la cola sin sacarlo
     *
     * @return
     */
    public T inicio() {
        return this.raiz.getContenido();
    }

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirCola() {
        if (raiz == null) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("-----------------------");
            NodoCola tmp = raiz;
            while (tmp != null) {
                System.out.println(tmp.getContenido().toString());
                tmp = tmp.getSiguiente();
            }
            System.out.println("-----------------------");
        }
    }

    public class NodoCola<T> {

        private String tag;
        private T contenido;

        private NodoCola<T> anterior;
        private NodoCola<T> siguiente;

        public NodoCola() {
        }

        public NodoCola(String tag, T contenido) {
            this.tag = tag;
            this.contenido = contenido;
        }

        public NodoCola(T contenido) {
            this.contenido = contenido;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public T getContenido() {
            return contenido;
        }

        public void setContenido(T contenido) {
            this.contenido = contenido;
        }

        public NodoCola<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(NodoCola<T> anterior) {
            this.anterior = anterior;
        }

        public NodoCola<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoCola<T> siguiente) {
            this.siguiente = siguiente;
        }

        public String imprimirNodo() {
            return "Nodo {" + "tag=" + tag + ",contenido=" + contenido + ", anterior=" + anterior.getTag() + ",siguiente=" + siguiente.getTag() + '}';
        }

        public String imprimirNodoSimple() {
            return "Nodo{" + "tag=" + tag + ", contenido=" + contenido + ", siguiente=" + ((siguiente == null) ? "null" : siguiente.getTag()) + '}';
        }

        @Override
        public String toString() {
            return "Nodo{" + "tag=" + tag + ", contenido=" + contenido + ", anterior=" + anterior + ", siguiente=" + siguiente + '}';
        }

    }
}
