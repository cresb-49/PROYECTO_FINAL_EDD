package com.mycompany.sistema_asignacion.Backen.EDD.ArbolB;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NullTagException;

public class ArbolB<T> {

    private ListArbolB<T> raiz;
    private int orden;
    private SplitInfoArbolB<T> splitInfoArbolB;

    public ArbolB(int orden) {
        this.orden = orden;
        this.raiz = new ListArbolB<>();
    }

    public void agregar(T data, String tag) throws CloneNodeException, NullTagException {
        if (tag == null) {
            throw new NullTagException("Esta asignando una etiqueta para el arbol");
        } else {
            if(this.raiz.getSize()==0){
                this.raiz.agregar(data, tag);
            }else{
                this.agregarALista(this.raiz, data, tag);
            }
        }
    }

    private void agregarALista(ListArbolB<T> lista, T data, String tag) throws CloneNodeException {
        NodoArbolB<T> tmp = lista.getRaiz();
        while (tmp != null) {
            int val = tag.compareTo(tmp.getTag());
            if (val == 0) {
                throw new CloneNodeException("Ya existe un elemento " + tag);
            } else if (val < 0) {
                if(tmp.getMenor()!=null){
                    this.agregarALista(tmp.getMenor(), data, tag);
                    break;
                }else{
                    if(tmp.getSiguiente()==null){
                        lista.agregar(data, tag);
                        break;
                    }else{
                        tmp = tmp.getSiguiente();
                    }
                }
            } else if (val > 0) {
                if(tmp.getMayor()!=null){
                    this.agregarALista(tmp.getMayor(), data, tag);
                    break;
                }else{
                    if(tmp.getSiguiente()==null){
                        lista.agregar(data, tag);
                        break;
                    }else{
                        tmp = tmp.getSiguiente();
                    }
                }
            }
        }
        if(lista.getSize()>=this.orden){
            if(lista == this.raiz){
                System.out.println("Se necesita un split de la informacion de la raiz");
            }else{
                System.out.println("Se necesita un split de la informacion en nodo");
            }
            
        }
    }
    @Override
    public String toString() {
        return this.raiz.toString();
    }

}
