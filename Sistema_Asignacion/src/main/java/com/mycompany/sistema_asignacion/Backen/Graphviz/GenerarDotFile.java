package com.mycompany.sistema_asignacion.Backen.Graphviz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.mycompany.sistema_asignacion.Backen.Exceptions.NoDataException;

public class GenerarDotFile {

    public GenerarDotFile() {
        
    }
    
    public void generarArchivo(String code, String nombre) throws IOException, NoDataException{
        if (code == null) {
            throw new NoDataException("No existen datos para Graficar");
        } else {
            if (code.isEmpty()) {
                throw new NoDataException("No existen datos para Graficar");
            } else {
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + ".dot", false));
                bw.write(code);
                bw.close();
            }
        }
    }
}
