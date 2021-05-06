package com.mycompany.sistema_asignacion.Backen.EDD.ArbolB;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;

public class SplitInfoArbolB<T> {
    public SplitInfoArbolB(){

    }

    public NodoArbolB<T> dividirLista(ListArbolB<T> lista) throws CloneNodeException{
        NodoArbolB<T> result = null;
        
        ListArbolB<T> menor = new ListArbolB<>();
        ListArbolB<T> mayor = new ListArbolB<>();

        int mitad1 = ((lista.getSize()-1)/2)-1;
        int medio = mitad1 +1;


        NodoArbolB<T> tmp = lista.getRaiz();
        Object nodos [] = new Object[lista.getSize()];
        int cont =0;

        while (tmp != null) {
            nodos[cont] = tmp;
            tmp = tmp.getSiguiente();
            ((NodoArbolB<T>)nodos[cont]).setAnterior(null);
            ((NodoArbolB<T>)nodos[cont]).setSiguiente(null);
            cont++;
        }

        try {
            for (int i = 0; i < nodos.length; i++) {
                if(i>=0 && i<=mitad1){
                    menor.agregarNodo((NodoArbolB<T>)nodos[i]);
                }else if (i == medio){
                    result = (NodoArbolB<T>)nodos[i];
                }else if(i>medio){
                    mayor.agregarNodo((NodoArbolB<T>)nodos[i]);
                }
            }   
        } catch (Exception e) {
            System.out.println("Error de formacion del arbol: "+e.getMessage());
        }

        result.setAnterior(null);
        result.setSiguiente(null);
        result.setMayor(mayor);
        result.setMenor(menor);
        return result;
    }

}
