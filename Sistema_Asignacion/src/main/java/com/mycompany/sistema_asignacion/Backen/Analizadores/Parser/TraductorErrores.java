package com.mycompany.sistema_asignacion.Backen.Analizadores.Parser;

import static com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.sym.*;

public class TraductorErrores {

    public TraductorErrores() {

    }

    public String tokenEsperado(int id) {
        switch (id) {
        case COMA:
            return "\",\"";
        case DOT_COMA:
            return "\";\"";
        case P_A:
            return "\"(\"";
        case P_C:
            return "\")\"";
        case USER:
            return "P-R \"Usuario\"";
        case ESTU:
            return "P-R \"Estudiante\"";
        case CATE:
            return "P-R \"Catedratico\"";
        case EDIF:
            return "P-R \"Edificio\"";
        case SALON:
            return "P-R \"Salon\"";
        case CURSO:
            return "P-R \"Curso\"";
        case HORARIO:
            return "P-R \"Horario\"";
        case ASIG:
            return "P-R \"Asignar\"";
        case TIPO_USER:
            return "[estudiante, colaborador, super]";
        case CADENA_DIA:
            return "rango [lunes-viernes]";
        case CADENA_HORARIO:
            return "Horario de Clase";
        case ALFANUMERICO:
            return "Cadena alfanumerica";
        case CARNET:
            return "Carnet: 9 digitos";
        case NUMERO:
            return "Cadena Numerica";
        case STRING:
            return "Cadena alfanumerica en comillas sin espacios";
        case STRING_SPACE:
            return "Cadena alfanumerica en comillas con espacios";
        default:
            return "";
        }
    }
}
