package com.mycompany.sistema_asignacion.Backen.EDD;

public class HashTable<T> {
    private static final int MAX_CAPACITY = 55;
    private int ocupacion;
    private int size;
    private T array[];

    public HashTable(Class<T[]> arrayType){
        this.ocupacion = 0;
        this.size = 37;
        array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(),(this.size)));
    }

    public void add(T data,int hash){
        int index = hash % this.size;
        System.out.println("Index: "+index);
    }


}