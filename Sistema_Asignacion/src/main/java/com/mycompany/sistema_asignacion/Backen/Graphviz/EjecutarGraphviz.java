package com.mycompany.sistema_asignacion.Backen.Graphviz;

import java.io.File;
import java.io.IOException;

public class EjecutarGraphviz {

    public EjecutarGraphviz() {
    }

    public String ejecutar(String pathDotCode, String name) throws IOException {
        Process p = Runtime.getRuntime().exec(new String[]{"dot", "-Tpng", pathDotCode, "-o", name});
        File archivo = new File(name);
        return archivo.getAbsolutePath();
    }

}
