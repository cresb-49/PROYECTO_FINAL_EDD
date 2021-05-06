package com.mycompany.sistema_asignacion.Backen.EDD.ArbolB;

import com.mycompany.sistema_asignacion.Backen.EDD.Cola;
import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NullTagException;

public class ArbolB<T> {

    private ListArbolB<T> raiz;
    private int orden;
    private SplitInfoArbolB<T> splitInfoArbolB;
    private int size;

    public ArbolB(int orden) {
        this.orden = orden;
        this.raiz = new ListArbolB<>();
        this.splitInfoArbolB = new SplitInfoArbolB<>();
        this.size = 0;
    }

    public void agregar(T data, String tag) throws CloneNodeException, NullTagException {
        if (tag == null) {
            throw new NullTagException("Esta asignando una etiqueta para el arbol");
        } else {
            if (this.raiz.getSize() == 0) {
                this.raiz.agregar(data, tag);
            } else {
                this.agregarALista(null, this.raiz, data, tag);
            }
        }
    }

    public T buscar(String tag) {
        return buscarDato(this.raiz, tag);
    }

    private T buscarDato(ListArbolB<T> lista, String tag) {
        NodoArbolB<T> tmp = lista.getRaiz();
        if (tmp == null) {
            return null;
        } else {
            while (tmp != null) {
                int val = tag.compareTo(tmp.getTag());
                if (val == 0) {
                    return tmp.getData();
                } else if (val < 0) {
                    if (tmp.getMenor() != null) {
                        return this.buscarDato(tmp.getMenor(), tag);
                    } else {
                        if (tmp.getSiguiente() == null) {
                            return null;
                        } else {
                            tmp = tmp.getSiguiente();
                        }
                    }
                } else if (val > 0) {
                    if (tmp.getMayor() != null) {
                        return this.buscarDato(tmp.getMayor(), tag);
                    } else {
                        if (tmp.getSiguiente() == null) {
                            return null;
                        } else {
                            tmp = tmp.getSiguiente();
                        }
                    }
                }
            }
            System.out.println("raiz nula");
            return null;
        }
    }

    private void agregarALista(ListArbolB<T> listaAnterior, ListArbolB<T> lista, T data, String tag)
            throws CloneNodeException {
        NodoArbolB<T> tmp = lista.getRaiz();
        while (tmp != null) {
            int val = tag.compareTo(tmp.getTag());
            if (val == 0) {
                throw new CloneNodeException("Ya existe un elemento " + tag);
            } else if (val < 0) {
                if (tmp.getMenor() != null) {
                    this.agregarALista(lista, tmp.getMenor(), data, tag);
                    break;
                } else {
                    if (tmp.getSiguiente() == null) {
                        lista.agregar(data, tag);
                        this.size++;
                        break;
                    } else {
                        tmp = tmp.getSiguiente();
                    }
                }
            } else if (val > 0) {
                int val2 = 0;
                if(tmp.getSiguiente()!=null){
                    val2 = tag.compareTo(tmp.getSiguiente().getTag());
                }
                //&& val2 <= 0
                if (tmp.getMayor() != null ) {
                    this.agregarALista(lista, tmp.getMayor(), data, tag);
                    break;
                } else {
                    if (tmp.getSiguiente() == null) {
                        lista.agregar(data, tag);
                        this.size++;
                        break;
                    } else {
                        tmp = tmp.getSiguiente();
                    }
                }
            }
        }
        if (lista.getSize() >= this.orden) {
            if (lista == this.raiz) {
                System.out.println("Se necesita un split de la informacion de la raiz");
                NodoArbolB<T> nuevaRaiz = this.splitInfoArbolB.dividirLista(this.raiz);
                this.raiz = new ListArbolB<>();
                this.raiz.agregarNodo(nuevaRaiz);
            } else {
                System.out.println("Se necesita un split de la informacion en nodo");
                NodoArbolB<T> nodoSeparado = this.splitInfoArbolB.dividirLista(lista);
                listaAnterior.agregarNodo(nodoSeparado);
            }

        }
    }

    /**
     * Recupera los datos del arbol de manera In Orden
     *
     * @return
     */
    public T[] AVLtoArrayInOrden(Class<T[]> arrayType) {
        T[] array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(),(this.size + 1)));
        Cola<T> data = new Cola<>();

        this.recuperarDataInOrden(this.raiz, data);
        int cont = 0;
        while (!data.isEmpty()) {
            array[cont] = data.tomar();
            cont++;
        }
        return array;
    }

    private void recuperarDataInOrden(ListArbolB<T> nodo, Cola<T> data) {
        /*
        if (nodo.getIzquierda() != null) {
            this.recuperarDataInOrden(nodo.getIzquierda(), data);
        }
        data.agregar(nodo.getContenido());
        if (nodo.getDerecha() != null) {
            this.recuperarDataInOrden(nodo.getDerecha(), data);
        }
        */
    }

    @Override
    public String toString() {
        return this.raiz.toString();
    }

    /**
     * @return the raiz
     */
    public ListArbolB<T> getRaiz() {
        return raiz;
    }

}
