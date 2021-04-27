package com.mycompany.sistema_asignacion.Backen.EDD;

import com.mycompany.sistema_asignacion.Backen.Exceptions.CloneNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NotFoundNodeException;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NullTagException;


/**
 * CLASE ARBOL BINARIO DE BUSQUEDA, ESTABLECE LAS ACCIONES DE LOS OBJETOS
 * NodoArbol
 *
 * @author benjamin
 */
public class AVL<T> {

    private NodoArbol<T> raiz;
    private int cantidad = 0;

    public AVL() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregar(String tag, T contenido) throws CloneNodeException, NullTagException {
        if (tag == null) {
            throw new NullTagException("La hoja debe de contener una etiqueda de identificacion");
        } else {
            NodoArbol<T> nodo = new NodoArbol<>(tag, contenido);
            if (this.raiz == null) {
                this.raiz = nodo;
                System.out.println("Se agrego con exito el dato con tag: " + nodo.getTag());
            } else {
                this.agregarNodo(this.raiz, nodo);
            }
        }
    }
    
    /**
     * Metodo para agregar elementos al arbol
     * @param padre
     * @param nuevo
     * @throws CloneNodeException 
     */
    private void agregarNodo(NodoArbol<T> padre, NodoArbol<T> nuevo) throws CloneNodeException {
        if (nuevo.getTag().compareTo(padre.getTag()) > 0) {

            if (padre.getDerecha() == null) {
                padre.setDerecha(nuevo);
                nuevo.setPadre(padre);
                System.out.println("Se agrego con exito el dato con tag: " + nuevo.getTag());
                this.cantidad++;
            } else {
                this.agregarNodo(padre.getDerecha(), nuevo);
            }

            int factor = this.alturaArbol(padre.getDerecha()) - this.alturaArbol(padre.getIzquierda());
            padre.setFactorEquilibrio(factor);
            if (factor == 2) {
                System.out.println("El nodo: " + padre.getTag() + " necesita balanceo a la derecha");

                if (padre.getDerecha() != null) {
                    factor = this.alturaArbol(padre.getDerecha().getDerecha()) - this.alturaArbol(padre.getDerecha().getIzquierda());
                    padre.getDerecha().setFactorEquilibrio(factor);
                }

                if (((padre.getDerecha() == null) ? 1 : padre.getDerecha().getFactorEquilibrio()) < 0) {
                    System.out.println("Vuelta doble izquierda");
                    this.vueltaDobleIzquierda(padre);

                } else {
                    System.out.println("Vuelta simple izquierda");
                    this.vueltaSimpleIzquierda(padre);
                }
            } else if (factor == -2) {
                System.out.println("El nodo: " + padre.getTag() + " necesita balanceo a la izquierda");

                if (padre.getIzquierda() != null) {
                    factor = this.alturaArbol(padre.getIzquierda().getDerecha()) - this.alturaArbol(padre.getIzquierda().getIzquierda());
                    padre.getIzquierda().setFactorEquilibrio(factor);
                }

                if (((padre.getIzquierda() == null) ? -1 : padre.getIzquierda().getFactorEquilibrio()) > 0) {
                    System.out.println("Vuelta doble derecha");
                    this.vueltaDobleDerecha(padre);
                } else {
                    System.out.println("Vuelta simple derecha");
                    this.vueltaSimpleDerecha(padre);
                }

            }

        } else if (nuevo.getTag().compareTo(padre.getTag()) < 0) {

            if (padre.getIzquierda() == null) {
                padre.setIzquierda(nuevo);
                nuevo.setPadre(padre);
                System.out.println("Se agrego con exito el dato con tag: " + nuevo.getTag());
                this.cantidad++;
            } else {
                this.agregarNodo(padre.getIzquierda(), nuevo);
            }

            int factor = this.alturaArbol(padre.getDerecha()) - this.alturaArbol(padre.getIzquierda());
            padre.setFactorEquilibrio(factor);

            if (factor == 2) {
                System.out.println("El nodo: " + padre.getTag() + " necesita balanceo a la derecha");
                if (padre.getDerecha() != null) {
                    factor = this.alturaArbol(padre.getDerecha().getDerecha()) - this.alturaArbol(padre.getDerecha().getIzquierda());
                    padre.getDerecha().setFactorEquilibrio(factor);
                }
                if (((padre.getDerecha() == null) ? 1 : padre.getDerecha().getFactorEquilibrio()) < 0) {
                    System.out.println("Vuelta doble izquierda");
                    this.vueltaDobleIzquierda(padre);
                } else {
                    System.out.println("Vuelta simple izquierda");
                    this.vueltaSimpleIzquierda(padre);
                }

            } else if (factor == -2) {
                System.out.println("El nodo: " + padre.getTag() + " necesita balanceo a la izquierda");
                if (padre.getIzquierda() != null) {
                    factor = this.alturaArbol(padre.getIzquierda().getDerecha()) - this.alturaArbol(padre.getIzquierda().getIzquierda());
                    padre.getIzquierda().setFactorEquilibrio(factor);
                }
                if (((padre.getIzquierda() == null) ? -1 : padre.getIzquierda().getFactorEquilibrio()) > 0) {
                    System.out.println("Vuelta doble derecha");
                    this.vueltaDobleDerecha(padre);
                } else {
                    System.out.println("Vuelta simple derecha");
                    this.vueltaSimpleDerecha(padre);
                }
            }

        } else {
            throw new CloneNodeException("Ya existe un nodo con tag: " + nuevo.getTag());
        }
    }
    
    /**
     * Realiza la moviemiento doble a la derecha del arbol en el nodo desequilibrado
     * @param nodo 
     */
    private void vueltaDobleDerecha(NodoArbol<T> nodo) {
        if (nodo == this.raiz) {
            NodoArbol<T> nuevaRaiz = this.raiz.getIzquierda().getDerecha();

            NodoArbol<T> b = this.raiz.getIzquierda();
            NodoArbol<T> IC = nuevaRaiz.getIzquierda();
            NodoArbol<T> DC = nuevaRaiz.getDerecha();

            nuevaRaiz.setDerecha(this.raiz);
            nuevaRaiz.setIzquierda(b);

            b.setDerecha(IC);
            this.raiz.setIzquierda(DC);
            nuevaRaiz.setPadre(null);
            this.raiz = nuevaRaiz;

        } else {
            NodoArbol<T> P = nodo.getPadre();

            NodoArbol<T> b = nodo.getIzquierda();
            NodoArbol<T> c = b.getDerecha();
            NodoArbol<T> IC = c.getIzquierda();
            NodoArbol<T> DC = c.getDerecha();

            if (P.getDerecha() == nodo) {
                P.setDerecha(c);
            } else {
                P.setIzquierda(c);
            }

            c.setIzquierda(b);
            c.setDerecha(nodo);
            b.setDerecha(IC);
            nodo.setIzquierda(DC);

        }
    }
    
    /**
     * Realiza el movimiento doble a la izquierda en el nodo del arbol que esta desequilibrado
     * @param nodo 
     */
    private void vueltaDobleIzquierda(NodoArbol<T> nodo) {
        if (nodo == this.raiz) {
            NodoArbol<T> nuevaRaiz = this.raiz.getDerecha().getIzquierda();

            NodoArbol<T> b = this.raiz.getDerecha();
            NodoArbol<T> IC = nuevaRaiz.getIzquierda();
            NodoArbol<T> DC = nuevaRaiz.getDerecha();

            nuevaRaiz.setDerecha(b);
            nuevaRaiz.setIzquierda(this.raiz);

            b.setIzquierda(DC);
            this.raiz.setDerecha(IC);

            nuevaRaiz.setPadre(null);
            this.raiz = nuevaRaiz;

        } else {
            NodoArbol<T> P = nodo.getPadre();

            NodoArbol<T> b = nodo.getDerecha();
            NodoArbol<T> c = b.getIzquierda();

            NodoArbol<T> IC = c.getIzquierda();
            NodoArbol<T> DC = c.getDerecha();

            if (P.getDerecha() == nodo) {
                P.setDerecha(c);
            } else {
                P.setIzquierda(c);
            }

            c.setDerecha(b);
            c.setIzquierda(nodo);
            b.setIzquierda(DC);
            nodo.setDerecha(IC);
        }
    }
    
    /**
     * Realiza el movimento simple a la derecha en el nodo del arbol que esta desequilibrado
     * @param nodo 
     */
    private void vueltaSimpleDerecha(NodoArbol<T> nodo) {

        if (nodo == this.raiz) {
            NodoArbol<T> nuevaRaiz = this.raiz.getIzquierda();
            nuevaRaiz.setPadre(null);
            NodoArbol<T> a = nuevaRaiz.getDerecha();
            this.raiz.setIzquierda(a);
            nuevaRaiz.setDerecha(this.raiz);
            this.raiz = nuevaRaiz;
        } else {
            NodoArbol<T> P = nodo.getPadre();
            NodoArbol<T> b = nodo.getIzquierda();
            NodoArbol<T> e = b.getDerecha();

            if (P.getDerecha() == nodo) {
                P.setDerecha(b);
            } else {
                P.setIzquierda(b);
            }

            b.setDerecha(nodo);
            nodo.setIzquierda(e);
        }
    }
    
    /**
     * Realiza el movimiento simple a la izquierda en el node del arbol que esta desequilibrado
     * @param nodo 
     */
    private void vueltaSimpleIzquierda(NodoArbol<T> nodo) {

        if (nodo == this.raiz) {

            NodoArbol<T> nuevaRaiz = this.raiz.getDerecha();
            nuevaRaiz.setPadre(null);
            NodoArbol<T> a = nuevaRaiz.getIzquierda();
            this.raiz.setDerecha(a);
            nuevaRaiz.setIzquierda(this.raiz);
            this.raiz = nuevaRaiz;
        } else {
            NodoArbol<T> P = nodo.getPadre();
            NodoArbol<T> b = nodo.getDerecha();
            NodoArbol<T> e = b.getIzquierda();

            if (P.getDerecha() == nodo) {
                P.setDerecha(b);
            } else {
                P.setIzquierda(b);
            }

            b.setIzquierda(nodo);
            nodo.setDerecha(e);
        }
    }

    private int alturaArbol(NodoArbol<T> nodo) {
        int izquierda = 0, derecha = 0;
        if (nodo != null) {
            if (nodo.getIzquierda() != null) {
                izquierda = alturaArbol(nodo.getIzquierda());
            }
            if (nodo.getDerecha() != null) {
                derecha = alturaArbol(nodo.getDerecha());
            }
            return ((izquierda < derecha) ? derecha : izquierda) + 1;
        }
        return 0;
    }

    public NodoArbol<T> buscarNodo(String tag) {
        NodoArbol<T> nodo = null;
        nodo = this.buscarNodo(this.raiz, tag);
        return nodo;
    }
    
    /**
     * Busca el nodo en el arbol en base la tag de identificacion
     * @param nodo
     * @param tag
     * @return 
     */
    private NodoArbol<T> buscarNodo(NodoArbol<T> nodo, String tag) {
        NodoArbol<T> tmp = null;
        if (nodo != null) {
            if (tag.compareTo(nodo.getTag()) > 0) {
                tmp = this.buscarNodo(nodo.getDerecha(), tag);
            } else if (tag.compareTo(nodo.getTag()) < 0) {
                tmp = this.buscarNodo(nodo.getIzquierda(), tag);
            } else if (tag.compareTo(nodo.getTag()) == 0) {
                tmp = nodo;
            }
        }
        return tmp;
    }

    /**
     * Realiza el recorrido en inOrden del arbol
     */
    public void inOrden() {
        this.inOrden(raiz);
        System.out.println("");
    }
    
    /**
     * Logica de los movimeintos en inOrden
     * @param nodo 
     */
    private void inOrden(NodoArbol<T> nodo) {
        if (nodo.getIzquierda() != null) {
            this.inOrden(nodo.getIzquierda());
        }
        System.out.print(nodo.imprimirNodo());
        if (nodo.getDerecha() != null) {
            this.inOrden(nodo.getDerecha());
        }
    }
    /**
     * Realiza el recorrido en postOrden
     */
    public void postOrden() {
        this.postOrden(this.raiz);
        System.out.println("");
    }
    
    /**
     * Logica de los movimientos en postOrden en el arbol
     * @param nodo 
     */
    private void postOrden(NodoArbol<T> nodo) {
        if (nodo.getIzquierda() != null) {
            this.postOrden(nodo.getIzquierda());
        }
        if (nodo.getDerecha() != null) {
            this.postOrden(nodo.getDerecha());
        }
        System.out.print(nodo.imprimirNodo());
    }
    /**
     * Realiza el recorrido en preOrden del arbol
     */
    public void preOrden() {
        this.preOrden(this.raiz);
        System.out.println("");
    }
    /**
     * Logica de los movimientos en preorden
     * @param nodo 
     */
    private void preOrden(NodoArbol<T> nodo) {
        System.out.print(nodo.imprimirNodo());
        if (nodo.getIzquierda() != null) {
            this.preOrden(nodo.getIzquierda());
        }
        if (nodo.getDerecha() != null) {
            this.preOrden(nodo.getDerecha());
        }
    }

    /**
     * Recupera los datos del arbol de manera In Orden
     *
     * @return
     */
    public T[] AVLtoArrayInOrden(Class<T[]> arrayType) {
        T[] array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(),(this.cantidad + 1)));
        Cola<T> data = new Cola();

        this.recuperarDataInOrden(this.raiz, data);
        int cont = 0;
        while (!data.isEmpty()) {
            array[cont] = data.tomar();
            cont++;
        }
        return array;
    }

    /**
     * Recupera los datos del arbol de manera Post Orden
     *
     * @return
     */
    public T[] AVLtoArrayPostOrden(Class<T[]> arrayType) {
        T[] array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(),(this.cantidad + 1)));
        Cola<T> data = new Cola();

        this.recuperarDataPostOrden(this.raiz, data);
        int cont = 0;
        while (!data.isEmpty()) {
            array[cont] = data.tomar();
            cont++;
        }
        return array;
    }

    /**
     * Recupera los datos del Arbol de manera Pre Orden
     *
     * @return
     */
    public T[] AVLtoArrayPreOrden(Class<T[]> arrayType) {
        T[] array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(),(this.cantidad + 1)));
        Cola<T> data = new Cola();

        this.recuperarDataPreOrden(this.raiz, data);
        int cont = 0;
        while (!data.isEmpty()) {
            array[cont] = data.tomar();
            cont++;
        }
        return array;
    }

    private void recuperarDataInOrden(NodoArbol<T> nodo, Cola data) {
        if (nodo.getIzquierda() != null) {
            this.recuperarDataInOrden(nodo.getIzquierda(), data);
        }
        data.agregar(nodo.getContenido());
        if (nodo.getDerecha() != null) {
            this.recuperarDataInOrden(nodo.getDerecha(), data);
        }

    }

    private void recuperarDataPostOrden(NodoArbol<T> nodo, Cola data) {
        if (nodo.getIzquierda() != null) {
            this.recuperarDataPostOrden(nodo.getIzquierda(), data);
        }
        if (nodo.getDerecha() != null) {
            this.recuperarDataPostOrden(nodo.getDerecha(), data);
        }
        data.agregar(nodo.getContenido());
    }

    private void recuperarDataPreOrden(NodoArbol<T> nodo, Cola data) {
        data.agregar(nodo.getContenido());
        if (nodo.getIzquierda() != null) {
            this.recuperarDataPreOrden(nodo.getIzquierda(), data);
        }
        if (nodo.getDerecha() != null) {
            this.recuperarDataPreOrden(nodo.getDerecha(), data);
        }
    }

    /**
     * Metodo publico que recibe solamente el tag del arbol
     *
     * @param tag
     */
    public void eliminar(String tag) throws NotFoundNodeException {
        this.eliminar(this.raiz, tag);
    }
    
    /**
     * Logica para eliminar datos del arbol
     * @param nodo
     * @param tag
     * @throws NotFoundNodeException 
     */
    private void eliminar(NodoArbol<T> nodo, String tag) throws NotFoundNodeException {
        NodoArbol<T> candidato = null;
        if (nodo == null) {
            throw new NotFoundNodeException("No existe un nodo con tag \"" + tag + "\"");
        } else if (nodo.getTag().equals(tag)) {

            if (nodo == this.raiz) {
                NodoArbol<T> izquierdo = nodo.getIzquierda();
                NodoArbol<T> derecha = nodo.getDerecha();

                if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {

                    System.out.println("Eliminacion simple");
                    this.raiz = candidato;
                    this.cantidad--;

                } else if (nodo.getIzquierda() == null && nodo.getDerecha() != null) {

                    System.out.println("Se hace cambia por el nodo derecho del eliminado");
                    candidato = nodo.getDerecha();
                    candidato.setPadre(null);
                    this.raiz = candidato;
                    System.out.println("Se elimino con exito el nodo: " + tag);
                    this.cantidad--;

                } else if (nodo.getIzquierda() != null && nodo.getDerecha() == null) {
                    System.out.println("Buscados el ultimo nodo a la derecha del lado izquierdo");
                    candidato = this.recupearUltimoDerecha(this.raiz.getIzquierda());
                    System.out.println("Candidato remplazo: " + candidato.getTag());
                    //Actualizamos los nodos de izquierda y derecha del eliminado
                    izquierdo = nodo.getIzquierda();
                    derecha = nodo.getDerecha();
                    candidato.setDerecha(derecha);
                    candidato.setIzquierda(izquierdo);
                    this.raiz = candidato;
                    System.out.println("Se elimino con exito el nodo: " + tag);
                    this.cantidad--;

                } else if (nodo.getIzquierda() != null && nodo.getDerecha() != null) {
                    System.out.println("Buscados el ultimo nodo a la derecha del lado izquierdo");
                    candidato = this.recupearUltimoDerecha(this.raiz.getIzquierda());
                    System.out.println("Candidato remplazo: " + candidato.getTag());
                    //Actualizamos los nodos de izquierda y derecha del eliminado
                    izquierdo = nodo.getIzquierda();
                    derecha = nodo.getDerecha();
                    candidato.setDerecha(derecha);
                    candidato.setIzquierda(izquierdo);
                    this.raiz = candidato;
                    System.out.println("Se elimino con exito el nodo: " + tag);
                    this.cantidad--;
                }
            } else {
                System.out.println("Encontre el nodo a eliminar: " + tag);
                NodoArbol<T> padre = nodo.getPadre();
                NodoArbol<T> izquierdo = nodo.getIzquierda();
                NodoArbol<T> derecha = nodo.getDerecha();

                if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
                    System.out.println("Eliminacion simple");
                    if (padre.getIzquierda() == nodo) {
                        padre.setIzquierda(null);
                        nodo.setPadre(null);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    } else if (padre.getDerecha() == nodo) {
                        padre.setDerecha(null);
                        nodo.setPadre(null);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    }
                } else if (nodo.getIzquierda() == null && nodo.getDerecha() != null) {
                    System.out.println("Se hace cambia por el nodo derecho del eliminado");
                    if (padre.getIzquierda() == nodo) {
                        nodo.setPadre(null);
                        padre.setIzquierda(derecha);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    } else if (padre.getDerecha() == nodo) {
                        nodo.setPadre(null);
                        padre.setDerecha(derecha);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    }
                } else if (nodo.getIzquierda() != null && nodo.getDerecha() == null) {
                    System.out.println("Buscados el ultimo nodo a la derecha del lado izquierdo");
                    candidato = this.recupearUltimoDerecha(nodo.getIzquierda());
                    System.out.println("Candidato remplazo: " + candidato.getTag());
                    //Actualizamos los nodos de izquierda y derecha del eliminado
                    izquierdo = nodo.getIzquierda();
                    derecha = nodo.getDerecha();
                    if (padre.getIzquierda() == (nodo)) {
                        nodo.setPadre(null);
                        padre.setIzquierda(candidato);
                        candidato.setDerecha(derecha);
                        candidato.setIzquierda(izquierdo);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    } else if (padre.getDerecha() == (nodo)) {
                        nodo.setPadre(null);
                        padre.setDerecha(candidato);
                        candidato.setDerecha(derecha);
                        candidato.setIzquierda(izquierdo);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    }
                } else if (nodo.getIzquierda() != null && nodo.getDerecha() != null) {
                    System.out.println("Buscados el ultimo nodo a la derecha del lado izquierdo");
                    candidato = this.recupearUltimoDerecha(nodo.getIzquierda());
                    System.out.println("Candidato remplazo: " + candidato.getTag());
                    //Actualizamos los nodos de izquierda y derecha del eliminado
                    izquierdo = nodo.getIzquierda();
                    derecha = nodo.getDerecha();
                    if (padre.getIzquierda() == (nodo)) {
                        nodo.setPadre(null);
                        padre.setIzquierda(candidato);
                        candidato.setDerecha(derecha);
                        candidato.setIzquierda(izquierdo);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    } else if (padre.getDerecha() == (nodo)) {
                        nodo.setPadre(null);
                        padre.setDerecha(candidato);
                        candidato.setDerecha(derecha);
                        candidato.setIzquierda(izquierdo);
                        System.out.println("Se elimino con exito el nodo: " + tag);
                        this.cantidad--;
                    }
                }
            }

            if (candidato != null) {
                int factor = this.alturaArbol(candidato.getDerecha()) - this.alturaArbol(candidato.getIzquierda());
                System.out.println("Factor de nodo: " + candidato.getTag() + " es: " + factor);

                if (factor == 2) {
                    System.out.println("El nodo: " + candidato.getTag() + " necesita balanceo a la derecha");
                    if (candidato.getDerecha() != null) {
                        factor = this.alturaArbol(candidato.getDerecha().getDerecha()) - this.alturaArbol(candidato.getDerecha().getIzquierda());
                        candidato.getDerecha().setFactorEquilibrio(factor);
                    }
                    if (((candidato.getDerecha() == null) ? 1 : candidato.getDerecha().getFactorEquilibrio()) < 0) {
                        System.out.println("Vuelta doble izquierda");
                        this.vueltaDobleIzquierda(candidato);
                    } else {
                        System.out.println("Vuelta simple izquierda");
                        this.vueltaSimpleIzquierda(candidato);
                    }

                } else if (factor == -2) {
                    System.out.println("El nodo: " + candidato.getTag() + " necesita balanceo a la izquierda");
                    if (candidato.getIzquierda() != null) {
                        factor = this.alturaArbol(candidato.getIzquierda().getDerecha()) - this.alturaArbol(candidato.getIzquierda().getIzquierda());
                        candidato.getIzquierda().setFactorEquilibrio(factor);
                    }
                    if (((candidato.getIzquierda() == null) ? -1 : candidato.getIzquierda().getFactorEquilibrio()) > 0) {
                        System.out.println("Vuelta doble derecha");
                        this.vueltaDobleDerecha(candidato);
                    } else {
                        System.out.println("Vuelta simple derecha");
                        this.vueltaSimpleDerecha(candidato);
                    }
                }

            }

        } else if (tag.compareTo(nodo.getTag()) > 0) {
            this.eliminar(nodo.getDerecha(), tag);
            int factor = this.alturaArbol(nodo.getDerecha()) - this.alturaArbol(nodo.getIzquierda());
            System.out.println("Factor de nodo: " + nodo.getTag() + " es: " + factor);
            if (factor == 2) {
                System.out.println("El nodo: " + nodo.getTag() + " necesita balanceo a la derecha");
                if (nodo.getDerecha() != null) {
                    factor = this.alturaArbol(nodo.getDerecha().getDerecha()) - this.alturaArbol(nodo.getDerecha().getIzquierda());
                    nodo.getDerecha().setFactorEquilibrio(factor);
                }
                if (((nodo.getDerecha() == null) ? 1 : nodo.getDerecha().getFactorEquilibrio()) < 0) {
                    System.out.println("Vuelta doble izquierda");
                    this.vueltaDobleIzquierda(nodo);
                } else {
                    System.out.println("Vuelta simple izquierda");
                    this.vueltaSimpleIzquierda(nodo);
                }

            } else if (factor == -2) {
                System.out.println("El nodo: " + nodo.getTag() + " necesita balanceo a la izquierda");
                if (nodo.getIzquierda() != null) {
                    factor = this.alturaArbol(nodo.getIzquierda().getDerecha()) - this.alturaArbol(nodo.getIzquierda().getIzquierda());
                    nodo.getIzquierda().setFactorEquilibrio(factor);
                }
                if (((nodo.getIzquierda() == null) ? -1 : nodo.getIzquierda().getFactorEquilibrio()) > 0) {
                    System.out.println("Vuelta doble derecha");
                    this.vueltaDobleDerecha(nodo);
                } else {
                    System.out.println("Vuelta simple derecha");
                    this.vueltaSimpleDerecha(nodo);
                }
            }
        } else if (tag.compareTo(nodo.getTag()) < 0) {
            this.eliminar(nodo.getIzquierda(), tag);
            int factor = this.alturaArbol(nodo.getDerecha()) - this.alturaArbol(nodo.getIzquierda());
            System.out.println("Factor de nodo: " + nodo.getTag() + " es: " + factor);
            if (factor == 2) {
                System.out.println("El nodo: " + nodo.getTag() + " necesita balanceo a la derecha");
                if (nodo.getDerecha() != null) {
                    factor = this.alturaArbol(nodo.getDerecha().getDerecha()) - this.alturaArbol(nodo.getDerecha().getIzquierda());
                    nodo.getDerecha().setFactorEquilibrio(factor);
                }
                if (((nodo.getDerecha() == null) ? 1 : nodo.getDerecha().getFactorEquilibrio()) < 0) {
                    System.out.println("Vuelta doble izquierda");
                    this.vueltaDobleIzquierda(nodo);
                } else {
                    System.out.println("Vuelta simple izquierda");
                    this.vueltaSimpleIzquierda(nodo);
                }

            } else if (factor == -2) {
                System.out.println("El nodo: " + nodo.getTag() + " necesita balanceo a la izquierda");
                if (nodo.getIzquierda() != null) {
                    factor = this.alturaArbol(nodo.getIzquierda().getDerecha()) - this.alturaArbol(nodo.getIzquierda().getIzquierda());
                    nodo.getIzquierda().setFactorEquilibrio(factor);
                }
                if (((nodo.getIzquierda() == null) ? -1 : nodo.getIzquierda().getFactorEquilibrio()) > 0) {
                    System.out.println("Vuelta doble derecha");
                    this.vueltaDobleDerecha(nodo);
                } else {
                    System.out.println("Vuelta simple derecha");
                    this.vueltaSimpleDerecha(nodo);
                }
            }
        } else {
            throw new NotFoundNodeException("No existe un nodo con tag \"" + tag + "\"");
        }
    }

    /**
     * Recupera el ultimo nodo derecho ubicado en una posicion inicial en el
     * arbol
     *
     * @param nodo
     * @return
     */
    private NodoArbol<T> recupearUltimoDerecha(NodoArbol<T> nodo) {
        if (nodo.getDerecha() == null) {
            NodoArbol<T> padre = nodo.getPadre();
            if (padre.getDerecha() == nodo) {
                padre.setDerecha(nodo.getIzquierda());
            } else if (padre.getIzquierda() == nodo) {
                padre.setIzquierda(nodo.getIzquierda());
            }
            return nodo;
        } else {
            return this.recupearUltimoDerecha(nodo.getDerecha());
        }
    }

    /**
     * Retorna un valor logico, true si el arbol esta vacio, de lo contrario
     * retorna false
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

    private class NodoArbol<T> {

        private String tag;
        private T contenido;

        private NodoArbol<T> padre;
        private NodoArbol<T> izquierda;
        private NodoArbol<T> derecha;

        private int factorEquilibrio;

        public NodoArbol() {
        }

        public NodoArbol(String tag, T contenido) {
            this.tag = tag;
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

        public NodoArbol<T> getIzquierda() {
            return izquierda;
        }

        public void setIzquierda(NodoArbol<T> izquierda) {
            this.izquierda = izquierda;
            if (this.izquierda != null) {
                this.izquierda.setPadre(this);
            }
        }

        public NodoArbol<T> getDerecha() {
            return derecha;
        }

        public void setDerecha(NodoArbol<T> derecha) {
            this.derecha = derecha;
            if (this.derecha != null) {
                this.derecha.setPadre(this);
            }
        }

        public NodoArbol<T> getPadre() {
            return padre;
        }

        public void setPadre(NodoArbol<T> padre) {
            this.padre = padre;
        }

        public String imprimirNodo() {
            return "{" + "tag=" + tag + ", contenido=" + contenido + ", padre=" + ((padre == null) ? "null" : padre.getTag()) + '}';
        }

        public int getFactorEquilibrio() {
            return factorEquilibrio;
        }

        public void setFactorEquilibrio(int factorEquilibrio) {
            this.factorEquilibrio = factorEquilibrio;
        }

        @Override
        public String toString() {
            return "NodoArbol{" + "tag=" + tag + ", contenido=" + contenido + ", padre=" + padre + ", izquierda=" + izquierda + ", derecha=" + derecha + ", factorEquilibrio=" + factorEquilibrio + '}';
        }
    }
}
