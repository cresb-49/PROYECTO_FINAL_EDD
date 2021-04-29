package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;

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
                tmp.setReHashBridge(true);
            } else {
                throw new CloneNodeException("Ya existe un elemento igual en la tabla");
            }
        }
    }

    /**
     * Soluciona el momento de la colision con el array
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
                this.solucionarColicion(data, hash, i,option);
                tmp.setReHashBridge(true);
            } else {
                throw new CloneNodeException("Ya existe un elemento igual en la tabla");
            }
        }
    }

    /**
     * Realiza el cresimiento de la tabla hash
     */
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
                        tmp.setReHashBridge(true);
                    } else {
                        throw new CloneNodeException("Ya existe un elemento igual en la tabla");
                    }
                }
            }
        }
    }

    /**
     * Busaca un elemento en la tabla hash
     * @param busqueda
     * @param hash
     * @return Objeto / null
     */
    public T buscar(T busqueda,int hash){
        int index = hash % this.size;

        NodeHash<T> tmp = (NodeHash<T>) this.array[index];

        if(tmp==null){
            return null;
        }else{
            T result = tmp.getData();
            if(result.equals(busqueda)){
                if(!tmp.isDelete()){
                    return result;
                }else{
                    return null;
                }
            }else{
                if(tmp.isReHashBridge()){
                    return this.busquedaReHash(busqueda, hash, 1);
                }else{
                    return null;
                }
            }

        }
    }

    /**
     * Metodo recursivo para la busqueda de un elemento en la tabla hash
     * @param busqueda
     * @param hash
     * @param i
     * @return
     */
    private T busquedaReHash(T busqueda, int hash, int i){

        i = i + 1;
        int index = ((hash % this.size) * i);
        while (index >= this.size) {
            index = index - this.size;
        }

        NodeHash<T> tmp = (NodeHash<T>) this.array[index];
        if(tmp==null){
            return null;
        }else{
            T result = tmp.getData();
            if(result.equals(busqueda)){
                if(!tmp.isDelete()){
                    return result;
                }else{
                    return null;
                }
            }else{
                if(tmp.isReHashBridge()){
                    return this.busquedaReHash(busqueda, hash, i);
                }else{
                    return null;
                }
            }
        }
    }

    /**
     * Elimina un dato de la tabla hash en base a un modelo 
     * @param dato
     * @param hash
     * @throws NotFoundNodeException
     */
    public void eliminar(T dato,int hash) throws NotFoundNodeException{
        int index = hash % this.size;
        NodeHash<T> tmp = (NodeHash<T>) this.array[index];
        if(tmp==null){
            throw new NotFoundNodeException("No existe el elemento buscado");
        }else{
            T result = tmp.getData();
            if(result.equals(dato)){
                if(tmp.isDelete()){
                    throw new NotFoundNodeException("No existe el elemento buscado");
                }else{
                    tmp.setDelete(true);
                }
            }else{
                if(tmp.isReHashBridge()){
                    this.eliminarReHash(dato, hash, 1);
                }else{
                    throw new NotFoundNodeException("No existe el elemento buscado");
                }
            }
        }
    }

    /**
     * Metodo recursivo para eliminar un dato de la tabla hash
     * @param dato
     * @param hash
     * @param i
     * @throws NotFoundNodeException
     */
    public void eliminarReHash(T dato, int hash, int i) throws NotFoundNodeException{
        i = i + 1;
        int index = ((hash % this.size) * i);
        while (index >= this.size) {
            index = index - this.size;
        }
        NodeHash<T> tmp = (NodeHash<T>) this.array[index];
        if(tmp==null){
            throw new NotFoundNodeException("No existe el elemento buscado");
        }else{
            T result = tmp.getData();
            if(result.equals(dato)){
                if(tmp.isDelete()){
                    throw new NotFoundNodeException("No existe el elemento buscado");
                }else{
                    tmp.setDelete(true);
                }
            }else{
                if(tmp.isReHashBridge()){
                    this.eliminarReHash(dato, hash, i);
                }else{
                    throw new NotFoundNodeException("No existe el elemento buscado");
                }
            }
        }
    }

    /**
     * Imprime la tabla hash
     */
    public void imprimirHash() {

        NodeHash<T> tmp =null;
        for (int i = 0; i < array.length; i++) {
            tmp = (NodeHash<T>) array[i];
            if(tmp !=null){
                if(!tmp.isDelete()){
                    System.out.println("key: " + i + " -> \n" + array[i]);
                }
            }
        }
    }

    private class NodeHash<T> {

        private boolean delete;
        private boolean reHashBridge;
        private T data;

        public NodeHash(T data) {
            this.data = data;
            this.delete = false;
            this.reHashBridge = false;
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
        public boolean isReHashBridge() {
            return reHashBridge;
        }

        /**
         * @param reHashWall the reHashWall to set
         */
        public void setReHashBridge(boolean reHashWall) {
            this.reHashBridge = reHashWall;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }

}