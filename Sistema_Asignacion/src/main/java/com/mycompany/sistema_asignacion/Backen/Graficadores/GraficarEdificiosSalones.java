package com.mycompany.sistema_asignacion.Backen.Graficadores;

import com.mycompany.sistema_asignacion.Backen.EDD.ListaCircularDoble;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaSimple;
import com.mycompany.sistema_asignacion.Backen.EDD.ListaSimple.NodoListaSimple;
import com.mycompany.sistema_asignacion.Backen.EDD.Pila;
import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;
import com.mycompany.sistema_asignacion.Backen.Objetos.Edificio;
import com.mycompany.sistema_asignacion.Backen.Objetos.Salon;

public class GraficarEdificiosSalones {

    private ListaCircularDoble<Edificio> edificios;

    public GraficarEdificiosSalones(ListaCircularDoble<Edificio> edificios) {
        this.edificios = edificios;
    }

    public String generarDotCode() {
        if (edificios != null) {
            if (!edificios.isEmpty()) {

                String modeloNodo = "node[shape = box,height=.1];\n";
                String confRank = "{ rank = same;\n"; // end ;}
                String code = "digraph USUARIOS {\n";

                Pila<String> declaraciones = new Pila<>();
                Pila<String> relaciones = new Pila<>();
                Pila<String> rank = new Pila<>();
                ListaCircularDoble.NodoLCD tmp = this.edificios.getRaiz();

                if (tmp != null) {
                    do {

                        declaraciones.push("nodeLC_EDIFICIO" + tmp.getTag() + "[label = \"" + tmp.getData().toString() + "\",group=1];");
                        relaciones.push("nodeLC_EDIFICIO" + tmp.getTag() + " -> " + "nodeLC_EDIFICIO" + tmp.getSiguiente().getTag() + ";");
                        relaciones.push("nodeLC_EDIFICIO" + tmp.getTag() + " -> " + "nodeLC_EDIFICIO" + tmp.getAnterior().getTag() + ";");
                        rank.push("nodeLC_EDIFICIO" + tmp.getTag() + ";");
                        tmp = tmp.getSiguiente();

                    } while (tmp != this.edificios.getRaiz());

                    code = code + modeloNodo + "\n";

                    while (!declaraciones.isEmpty()) {
                        try {
                            code = code + declaraciones.pop() + "\n";
                        } catch (NoDataException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    code = code + confRank;
                    while (!rank.isEmpty()) {
                        try {
                            code = code + rank.pop() + "\n";
                        } catch (NoDataException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    code = code + "}\n";

                    while (!relaciones.isEmpty()) {
                        try {
                            code = code + relaciones.pop() + "\n";
                        } catch (NoDataException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    //////acciones de las sublistas de cada edificio
                    Edificio edificio = null;
                    ListaSimple<Salon> salones = null;
                    NodoListaSimple nodo = null;
                    Salon salon = null;
                    Salon salonTmp = null;

                    String subgraph = "subgraph{\n";
                    String declaracionesSub = "";
                    String relacionesSub = "";
                    tmp = this.edificios.getRaiz();
                    if (tmp != null) {
                        do {
                            edificio = (Edificio) tmp.getData();
                            salones = edificio.getSalones();
                            if (salones != null) {
                                nodo = salones.getRaiz();
                                if (nodo != null) {
                                    salon = (Salon) nodo.getDato();
                                    relacionesSub = relacionesSub + "nodeLC_EDIFICIO" + salon.getEdificio() + " -> nodeSalon" + salon.getEdificio() + salon.getNumeroSalon() + ";\n";
                                    while (nodo != null) {
                                        declaracionesSub = declaracionesSub + "nodeSalon" + salon.getEdificio() + salon.getNumeroSalon() + "[label=\"" + salon.toString() + "\"];\n";
                                        if (nodo.getSiguiente() != null) {
                                            salonTmp = (Salon) nodo.getSiguiente().getDato();
                                            relacionesSub = relacionesSub + "nodeSalon" + salon.getEdificio() + salon.getNumeroSalon() + " -> " + "nodeSalon" + salonTmp.getEdificio() + salonTmp.getNumeroSalon()+"\n";
                                        }
                                        nodo = nodo.getSiguiente();
                                    }
                                }
                                tmp = tmp.getSiguiente();
                                subgraph = subgraph + declaracionesSub + relacionesSub;
                                subgraph = subgraph + "}\n";
                                code = code + subgraph;
                            }
                            subgraph = "subgraph{\n";
                            relacionesSub = "";
                            declaracionesSub = "";
                        } while (tmp != this.edificios.getRaiz());
                    }
                    //////fin acciones de las sublistas de cada edificio

                    code = code + "}";
                    return code;
                } else {
                    return null;
                }

            } else {
                return null;
            }
        }
        return null;
    }
}
