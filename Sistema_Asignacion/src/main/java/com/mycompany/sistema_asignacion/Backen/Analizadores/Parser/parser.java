
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package com.mycompany.sistema_asignacion.Backen.Analizadores.Parser;

import com.mycompany.sistema_asignacion.Backen.Objetos.DatosSistema;
import com.mycompany.sistema_asignacion.Backen.Analizadores.token;
import com.mycompany.sistema_asignacion.Backen.Analizadores.Lexer.Lexer;
import com.mycompany.sistema_asignacion.Backen.EDD.*;
import com.mycompany.sistema_asignacion.Backen.Exceptions.*;
import com.mycompany.sistema_asignacion.Backen.Objetos.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\014\000\002\002" +
    "\014\000\002\002\007\000\002\002\015\000\002\002\002" +
    "\000\002\002\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\003\003\000\002\003\003\000\002" +
    "\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\016\002\ufffc\003\005\004\010\005\007\007" +
    "\004\011\006\001\002\000\004\022\055\001\002\000\004" +
    "\002\ufffb\001\002\000\004\022\040\001\002\000\004\022" +
    "\024\001\002\000\004\022\013\001\002\000\004\002\012" +
    "\001\002\000\004\002\001\001\002\000\004\016\014\001" +
    "\002\000\004\024\015\001\002\000\004\020\016\001\002" +
    "\000\004\024\017\001\002\000\004\014\020\001\002\000" +
    "\004\023\021\001\002\000\004\025\022\001\002\000\016" +
    "\002\ufffc\003\005\004\010\005\007\007\004\011\006\001" +
    "\002\000\004\002\000\001\002\000\004\017\025\001\002" +
    "\000\004\024\026\001\002\000\010\003\030\020\027\021" +
    "\031\001\002\000\006\023\ufffa\024\ufffa\001\002\000\006" +
    "\023\ufff8\024\ufff8\001\002\000\006\023\ufff9\024\ufff9\001" +
    "\002\000\004\024\033\001\002\000\010\003\030\020\027" +
    "\021\031\001\002\000\004\023\035\001\002\000\004\025" +
    "\036\001\002\000\016\002\ufffc\003\005\004\010\005\007" +
    "\007\004\011\006\001\002\000\004\002\uffff\001\002\000" +
    "\010\003\042\017\043\026\041\001\002\000\006\023\ufff7" +
    "\024\ufff7\001\002\000\006\023\ufff5\024\ufff5\001\002\000" +
    "\006\023\ufff6\024\ufff6\001\002\000\004\024\045\001\002" +
    "\000\010\003\030\020\027\021\031\001\002\000\004\024" +
    "\047\001\002\000\010\003\042\017\043\026\041\001\002" +
    "\000\004\024\051\001\002\000\010\003\042\017\043\026" +
    "\041\001\002\000\004\023\053\001\002\000\004\025\054" +
    "\001\002\000\004\002\ufffd\001\002\000\004\020\056\001" +
    "\002\000\004\023\057\001\002\000\004\025\060\001\002" +
    "\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\002\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\033\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\036\001\001\000\002\001\001\000\004" +
    "\003\043\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\045\001\001" +
    "\000\002\001\001\000\004\003\047\001\001\000\002\001" +
    "\001\000\004\003\051\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



           
    private DatosSistema datos;
    private Cola<String> errores;
    private TraductorErrores traductor;

    public parser(Lexer lex,DatosSistema datos,Cola<String> errores){
        super(lex);
        this.traductor = new TraductorErrores();
        this.datos = datos;
        this.errores = errores;
    }

    public void report_error(String message, Object info){
        System.out.println("reporterror");
    }
    public void report_fatal_error(String message, Object info){
        System.out.println("reportfatal");
    }

    public void syntax_error(Symbol cur_token){
        token tok = (token) cur_token.value;
        String err = "Error sintactico { "+tok.getLexeme()+" } se esperaba[";
        for (int i = 0; i < expected_token_ids().size(); i++) {
            if (!traductor.tokenEsperado(expected_token_ids().get(i)).equals("")) {
                err = err + traductor.tokenEsperado(expected_token_ids().get(i));
                if (i < (expected_token_ids().size() - 1)) {
                    err = err + " ó ";
                }
            }
        }
        err = err +"] Linea: "+tok.getLine()+",Columna: "+tok.getColumn();
        System.out.println(err);
        errores.agregar(err);
    }

    protected int error_sync_size() {
        return 1;
    }

    public Cola<String> getErrores(){
        return errores;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= exp EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // exp ::= USER P_A ALFANUMERICO COMA STRING COMA TIPO_USER P_C DOT_COMA exp 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object nombre = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int passleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int passright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object pass = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int tipoUserleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tipoUserright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object tipoUser = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
            int id;
            Usuario newUser = null;
            
            if(datos.getUsuarios().isEmpty()){
                id = 0;
                newUser = new Usuario(id, ((token)nombre).getLexeme(), ((token)pass).getLexeme(), ((token)tipoUser).getLexeme());
            }else{
                Usuario tmp = datos.getUsuarios().getUltimo();
                newUser = new Usuario((tmp.getId()+1), ((token)nombre).getLexeme(), ((token)pass).getLexeme(), ((token)tipoUser).getLexeme());
            }
            if(newUser!=null)
            {
                try {
                    datos.getUsuarios().add(newUser, newUser.getNombre());
                } catch (CloneNodeException e) {
                    errores.agregar("Ya existe un usuario \""+newUser.getNombre()+"\" en el sistema");
                }
            }
            System.out.println(newUser.toString());
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // exp ::= ESTU P_A CARNET COMA cadenas COMA cadenas P_C DOT_COMA exp 
            {
              Object RESULT =null;
		

        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // exp ::= EDIF P_A STRING P_C DOT_COMA 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object nombre = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
            Edificio newEdificio = new Edificio(((token)nombre).getLexeme());
            try {
              datos.getEdificios().add(newEdificio, newEdificio.getNombre());
            } catch (CloneNodeException ex) {
                errores.agregar("Ya existe un edificio:" + newEdificio.getNombre());
            }
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // exp ::= CURSO P_A nums COMA cadenas COMA nums COMA nums P_C DOT_COMA 
            {
              Object RESULT =null;
		int codigoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int codigoright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Object codigo = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object nombre = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int semestreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int semestreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object semestre = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int creditosleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int creditosright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object creditos = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
            

            int numSemestre = Integer.valueOf(((token)semestre).getLexeme());
            
            if(numSemestre>0&&numSemestre<=10){
              Curso newCurso = new Curso(Integer.valueOf(((token)codigo).getLexeme()), ((token)nombre).getLexeme(), numSemestre, Integer.valueOf(((token)creditos).getLexeme()));
              try {
                datos.getCursos().addOrden(newCurso, String.valueOf(newCurso.getCodigo()));
              } catch (CloneNodeException ex) {
                errores.agregar("Ya existe un curso con codigo: "+newCurso.getCodigo()+"Linea: "+((token)codigo).getLine()+" Columna: "+((token)codigo).getColumn());
              }
            }else{
              errores.agregar("Error Semantico: el numero asociado al semestre debe ser entre el rango [1 - 10], Linea: "+((token)semestre).getLine()+",Columna: "+((token)semestre).getColumn());
            }
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // exp ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // exp ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // cadenas ::= STRING 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = e1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadenas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // cadenas ::= STRING_SPACE 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = e1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadenas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // cadenas ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadenas",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // nums ::= NUMERO 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT =e1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("nums",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // nums ::= CARNET 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT =e1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("nums",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // nums ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nums",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
