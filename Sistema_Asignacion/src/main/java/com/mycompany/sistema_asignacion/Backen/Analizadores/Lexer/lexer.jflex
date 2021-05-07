package com.mycompany.sistema_asignacion.Backen.Analizadores.Lexer;
import com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.sym;
import static com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.sym.*;
import com.mycompany.sistema_asignacion.Backen.Analizadores.token;
import com.mycompany.sistema_asignacion.Backen.EDD.Cola;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.Symbol;

%%

/*segunda seccion, configuracion*/
%class Lexer
%cup
/*%standalone*/
%unicode
%line
%column
%public
%{
    private Symbol after_symbl = new Symbol(0);
    private Symbol tmp_symbl = new Symbol(0);

    private Cola<String> errores;

%}

/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
palabrasRecervadas = (Usuario|Estudiante|Catedratico|Edificio|Salon|Curso|Horario|Asignar)
tipoUser = ((super)|(colaborador)|(estudiante))
alfaNumerico = ([0-9]|[:letter:])+
horario = [\"]([1-9]|[1][0-2])([:])([0-5][0-9])(am|pm)([\-])([1-9]|[1][0-2])([:])([0-5][0-9])(am|pm)[\"]
innerText = {alfaNumerico}([ ]|{alfaNumerico})+
cadena = [\"]{innerText}[\"]
cadena2 = [\"]{alfaNumerico}[\"]
dia = (lunes|martes|miercoles|jueves|viernes)
day = [\"]({dia})[\"]
/*numerico = [0-9]+*/
/*carnet = ([1-9])([0-9]{8})*/

%{
    private void error(String lexeme) {
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        errores.agregar(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }

    public void setErrores(Cola<String> errores) {
        this.errores = errores;
    }

    public Cola<String> getErrores() {
        return errores;
    }

    private boolean pruebaNumero(String text){
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    private boolean pruebaCarnet(String text){
        Pattern pattern = Pattern.compile("^([1-9])([0-9]{8})$");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
    
%}

%%

/*LEXIX RULES*/
<YYINITIAL>{
    {palabrasRecervadas}
        {
            //System.out.println("Palabra Recervada: "+yytext());
            switch(yytext()){
                case "Usuario":
                    return new Symbol (USER,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Estudiante":
                    return new Symbol (ESTU,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Catedratico":
                    return new Symbol (CATE,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Edificio":
                    return new Symbol (EDIF,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Salon":
                    return new Symbol (SALON,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Curso":
                    return new Symbol (CURSO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Horario":
                    return new Symbol (HORARIO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
                case "Asignar":
                    return new Symbol (ASIG,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
        }
    {tipoUser}   
        {
            //System.out.println("Tipo Usuario: "+yytext());
            return new Symbol (TIPO_USER,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {alfaNumerico}
        {
            //System.out.println("Cadena Alfanumerica: "+yytext());
            if(pruebaCarnet(yytext())){

                return new Symbol (CARNET,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));

            }else if(pruebaNumero(yytext())){

                return new Symbol (NUMERO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));

            }else{

                return new Symbol (ALFANUMERICO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
        }
    {day}
        {
            //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (CADENA_DIA,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
        }
    {cadena2}
        {
            //System.out.println("Cadena2: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (STRING,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
        }
    {cadena}
        {
            //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (STRING_SPACE,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
        }
    {horario}
        {
            //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (CADENA_HORARIO,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
        }
    "("
        {
            //System.out.println("Parentecis Apertura: "+yytext());
            return new Symbol (P_A,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ")"
        {
            //System.out.println("Parentesis Cierre: "+yytext());
            return new Symbol (P_C,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ","
        {
            //System.out.println("Coma: "+yytext());
            return new Symbol (COMA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ";"
        {
            //System.out.println("Punto y coma: "+yytext());
            return new Symbol (DOT_COMA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {LineTerminator}
        {
            /*Do nothing*/
        }
    {WhiteSpace}
        {
            /*Do nothing*/
        }
}
[^]     {
            error(yytext());
        }
