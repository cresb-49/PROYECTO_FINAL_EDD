package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;

public class HashTable<T> {
    private static final double MAX_CAPACITY = 0.55;
    private int items;
    private int size;
    private double factorDeCarga;

    private Object array[];

    public HashTable() {
        this.items = 0;
        this.size = 37;
        this.array = new Object[this.size];
    }

    /**
     * Agrega un elemento a la tabla hash
     * 
     * @param data
     * @param hash
     * @throws CloneNodeException
     */
    public void add(T data, int hash) throws CloneNodeException {
        int index = hash % this.size;
        if (this.array[index] == null) {
            NodeHash<T> nuevo = new NodeHash<>(data);
            System.out.println("Elemento agregado en posicion: " + index);
            this.array[index] = nuevo;
            this.items++;
            this.factorDeCarga = ((double) this.items / this.size);
            System.out.println("Factor de carga: " + this.factorDeCarga);
            if (this.factorDeCarga > MAX_CAPACITY) {
                System.out.println("Se necesita rehash");
            }
        } else {
            NodeHash<T> tmp = (NodeHash<T>) array[index];
            boolean igual = (tmp.getData().equals(data));
            System.out.println("Iguales: "+igual);
            if (!igual) {
                System.out.println("Colicion de elemento posicion: " + index);
                this.solucionarColicion(data, hash, 1,true);
                tmp.setReHashWall(true);
            } else {
                throw new CloneNodeException("Ya existe un elemento igual en la tabla");
            }
        }
    }

    /**
     * Soluciona el momento de la colicion con el array
     * 
     * @param data
     * @param hash
     * @param i
     * @throws CloneNodeException
     */
    private void solucionarColicion(T data, int hash, int i,boolean option) throws CloneNodeException {
        i = i + 1;
        int index = ((hash % this.size) * i);

        while (index >= this.size) {
            index = index - this.size;
        }

        if (this.array[index] == null) {
            NodeHash<T> nuevo = new NodeHash<>(data);
            System.out.println("Elemento agregado en posicion: " + index);
            this.array[index] = nuevo;
            this.items++;
            this.factorDeCarga = ((double) this.items / this.size);
            System.out.println("Factor de carga: " + this.factorDeCarga);
            if(option){
                if (this.factorDeCarga > MAX_CAPACITY) {
                    System.out.println("Se necesita rehash");
                    this.reHash();
                }
            }
        } else {
            NodeHash<T> tmp = (NodeHash<T>) array[index];
            boolean igual = (tmp.getData().equals(data));
            System.out.println("Iguales: "+igual);
            if (!igual) {
                System.out.println("Colicion de elemento posicion: " + index);
                this.solucionarColicion(data, hash, i,true);
                tmp.setReHashWall(true);
            } else {
                throw new CloneNodeException("Ya existe un elemento igual en la tabla");
            }
        }
    }

    private void reHash() throws CloneNodeException {
        //Copia de los elementos del hash anterior
        Object copiaArray[] = this.array;
        //Nuevo tamaño para la tabla hash 
        this.size = this.size + 21;
        this.array = new Object[this.size];
        this.items =0;

        for (Object copi : copiaArray) {
            NodeHash<T> antiguo = (NodeHash<T>) copi;
            if (!antiguo.isDelete()) {

                //PARAMETROS PARA EL NUEVO HASH
                int hash = antiguo.getData().hashCode();
                T data = antiguo.getData();
                int index = hash % this.size;
                //FIN PARAMETROS PARA EL NUEVO HASH

                if (this.array[index] == null) {
                    NodeHash<T> nuevo = new NodeHash<>(data);
                    System.out.println("Elemento agregado en posicion: " + index);
                    this.array[index] = nuevo;
                    this.items++;
                    this.factorDeCarga = ((double) this.items / this.size);
                    System.out.println("Factor de carga: " + this.factorDeCarga);
                } else {
                    NodeHash<T> tmp = (NodeHash<T>) array[index];
                    if (!tmp.getData().equals(data)) {
                        System.out.println("Colicion de elemento posicion: " + index);
                        this.solucionarColicion(data, hash, 1,false);
                        tmp.setReHashWall(true);
                    } else {
                        throw new CloneNodeException("Ya existe un elemento igual en la tabla");
                    }
                }
            }
        }
    }

    /**
     * Imprime la tabla hash
     */
    public void imprimirHash() {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println("key: " + i + " -> \n" + array[i]);
            }
        }
    }

    private class NodeHash<T> {

        private boolean delete;
        private boolean reHashWall;
        private T data;

        public NodeHash(T data) {
            this.data = data;
            this.delete = false;
            this.reHashWall = false;
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
         * @return the delete
         */
        public boolean isDelete() {
            return delete;
        }

        /**
         * @param delete the delete to set
         */
        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        /**
         * @return the reHashWall
         */
        public boolean isReHashWall() {
            return reHashWall;
        }

        /**
         * @param reHashWall the reHashWall to set
         */
        public void setReHashWall(boolean reHashWall) {
            this.reHashWall = reHashWall;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }

}