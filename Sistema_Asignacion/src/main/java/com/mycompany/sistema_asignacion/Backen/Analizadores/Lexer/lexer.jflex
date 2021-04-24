%%

/*segunda seccion, configuracion*/
%cup
/*%standalone*/
%unicode
%line
%column
%public
%{
    private Symbol after_symbl = new Symbol(0);
    private Symbol tmp_symbl = new Symbol(0);

    private Cola errores = new Cola();

%}

%eofval{
  return new java_cup.runtime.Symbol(parserUsuarioSym.EOF);
%eofval}

/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
palabrasRecervadas = (Usuario|Estudiante|Catedratico|Edificio|Salon|Curso|Horario|Asignar)
tipoUser = ((super)|(colaborador)|(estudiante))
alfaNumerico = [a-zA-Z]+([a-zA-Z0-9])*
horario = [\"]([1-9]|[1][0-2])([:])([0-5][0-9])(am|pm)([\-])([1-9]|[1][0-2])([:])([0-5][0-9])(am|pm)[\"]
innerText = {alfaNumerico}([ ]|{alfaNumerico})*
cadena = [\"]{innerText}[\"]
cadena2 = [\"]{alfaNumerico}[\"]
dia = lunes|martes|miercoles|jueves|viernes
day = [\"]({dia})[\"]
numerico = [0-9]+
carnet = ([1-9])([0-9]{8})

%{
    private void error(String lexeme) {
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        errores.agregar(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }

    public Cola getErrores(){
        return errores;
    }
    
%}

%%

/*LEXIX RULES*/
<YYINITIAL>{
    {palabrasRecervadas}
        {
            System.out.println("Palabra Recervada: "+yytext());
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
            System.out.println("Tipo Usuario: "+yytext());
            return new Symbol (TIPO_USER,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {dia}
        {
            System.out.println("Dia: "+yytext());
            return new Symbol (DIA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {alfaNumerico}
        {
            System.out.println("Cadena Alfanumerica: "+yytext());
            return new Symbol (ALFANUMERICO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {carnet}
        {
            System.out.println("Carnet: "+yytext());
            return new Symbol (CARNET,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    {cadena}
        {
            System.out.println("Cadena: "+yytext());
            return new Symbol (STRING,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    "("
        {
            System.out.println("Parentecis Apertura: "+yytext());
            return new Symbol (P_A,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ")"
        {
            System.out.println("Parentesis Cierre: "+yytext());
            return new Symbol (P_C,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ","
        {
            System.out.println("Coma: "+yytext());
            return new Symbol (COMA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
        }
    ";"
        {
            System.out.println("Punto y coma: "+yytext());
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