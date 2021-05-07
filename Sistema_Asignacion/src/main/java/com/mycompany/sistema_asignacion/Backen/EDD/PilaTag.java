package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NullTagException;

/**
 * Al igual que una pila normal esta puede guardar los datos agregando un tag de
 * identificacion para buscar elementos dentro de la pila
 *
 * @author benjamin
 * @param <T>
 */
public class PilaTag<T> {

    private NodoPilaTag<T> raiz;
    private int size;

    /**
     * Contructor de la Pila
     */
    public PilaTag() {
        this.raiz = null;
        this.size = 0;
    }

    /**
     * Introduce un elemento en la pila
     *
     * @param data
     * @param tag
     */
    public void push(T data, String tag){
        if (this.raiz == null) {
            this.raiz = new NodoPilaTag<T>(data, tag, null);
            this.size++;
        } else {
            NodoPilaTag<T> tmp = this.raiz;
            this.raiz = new NodoPilaTag<T>(data, tag, tmp);
            this.size++;
        }
    }

    /**
     * Retira el elmento superior de la pila sacandolo Si la pila esta vacia
     * genera una excepcion NoDataException
     *
     * @return
     */
    public T pop(){
        if (this.isEmpty()) {
            return null;
        } else {
            NodoPilaTag<T> tmp = this.raiz;
            this.raiz = tmp.getNext();
            this.size--;
            return tmp.getData();
        }
    }

    /**
     * Retorna el objeto superior en la pila sin sacarlo Si la pila esta vacia
     * genera una excepcion NoDataException
     *
     * @return
     */
    public T peek() throws NoDataException {
        if (this.isEmpty()) {
            throw new NoDataException("No hay elementos en la pila");
        } else {
            return this.raiz.getData();
        }
    }

    /**
     * Retorna un valor logico, si existe un elemento en la pila con un tag
     * determinado
     *
     * @param tag
     * @return
     */
    public boolean buscar(String tag) {
        if (this.isEmpty()) {
            return false;
        } else {
            NodoPilaTag<T> tmp = this.raiz;
            while (tmp != null) {
                if (tmp.getTag().equals(tag)) {
                    return true;
                }
                tmp = tmp.getNext();
            }
            return false;
        }
    }

    /**
     * Retorna un valor logico si la pila esta vacia, true si lo esta, false si
     * esta tiene elementos
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

    /**
     * Retorna el tamaño de la pila
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    public void imprimirPila() {
        if (this.raiz == null) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("-----------------------");
            NodoPilaTag<T> tmp = this.raiz;
            while (tmp != null) {
                System.out.println(tmp.toString());
                tmp = tmp.getNext();
            }
            System.out.println("-----------------------");
        }
    }

    public class NodoPilaTag<T> {

        private NodoPilaTag<T> next;
        private T data;
        private String tag;

        public NodoPilaTag(T data, String tag, NodoPilaTag<T> next) {
            this.next = next;
            this.data = data;
            this.tag = tag;
        }

        /**
         * Retorna el siguiente elemento del nodo evaluado
         *
         * @return
         */
        public NodoPilaTag<T> getNext() {
            return next;
        }

        /**
         * Retorna el dato guardado en el nodo evaluado
         *
         * @return
         */
        public T getData() {
            return data;
        }

        /**
         * Retorna el tag del elemento en la pila
         *
         * @return
         */
        public String getTag() {
            return tag;
        }

        @Override
        public String toString() {
            return "Data: " + data;
        }

    }
}
