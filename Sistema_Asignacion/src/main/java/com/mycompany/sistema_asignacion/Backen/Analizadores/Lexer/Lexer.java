// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexer.jflex

package com.mycompany.sistema_asignacion.Backen.Analizadores.Lexer;
import com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.sym;
import static com.mycompany.sistema_asignacion.Backen.Analizadores.Parser.sym.*;
import com.mycompany.sistema_asignacion.Backen.Analizadores.token;
import com.mycompany.sistema_asignacion.Backen.EDD.Cola;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\4\1\0"+
    "\1\5\5\0\1\6\1\7\2\0\1\10\1\11\2\0"+
    "\1\12\1\13\1\14\3\15\4\16\1\17\1\20\5\0"+
    "\1\21\1\22\1\23\1\22\1\24\2\22\1\25\12\22"+
    "\1\26\1\22\1\27\5\22\6\0\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\22\1\37\1\40\1\22"+
    "\1\41\1\42\1\43\1\44\1\45\1\22\1\46\1\47"+
    "\1\50\1\51\1\52\4\22\1\0\1\3\103\0\100\22"+
    "\u0100\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\11\6\10\0\13\6\1\0\1\10\6\0\12\6"+
    "\1\11\6\0\12\6\3\0\2\6\1\12\5\6\1\13"+
    "\3\0\5\6\1\0\1\14\1\0\4\6\1\0\4\6"+
    "\2\0\4\6\5\0\1\15";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\53\0\53"+
    "\0\53\0\u0102\0\53\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9"+
    "\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331"+
    "\0\u035c\0\u0387\0\u03b2\0\u03dd\0\u0408\0\u0433\0\u045e\0\u0489"+
    "\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1"+
    "\0\53\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e"+
    "\0\u0739\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866"+
    "\0\u0891\0\53\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993"+
    "\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb"+
    "\0\u0b16\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0102"+
    "\0\u0c43\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef\0\u0102\0\u0d1a\0\u0d45"+
    "\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c\0\u0e47\0\u0e72\0\53"+
    "\0\u0e9d\0\u0ec8\0\u0ef3\0\u0f1e\0\u0f49\0\u0f74\0\u0f9f\0\u0fca"+
    "\0\u0ff5\0\u1020\0\u104b\0\u1076\0\u10a1\0\u10cc\0\u10f7\0\u1122"+
    "\0\u114d\0\u1178\0\u11a3\0\u11ce\0\u11f9\0\53";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\2\5\12\1\2\1\13\1\14\1\12\1\15"+
    "\1\16\1\17\1\20\1\21\2\12\1\22\1\12\1\23"+
    "\12\12\1\24\3\12\54\0\2\3\1\0\1\3\47\0"+
    "\1\3\1\4\1\5\1\3\50\0\2\5\61\0\1\25"+
    "\1\26\3\27\2\0\17\30\1\31\1\32\1\33\7\30"+
    "\1\34\12\0\5\12\2\0\32\12\12\0\5\12\2\0"+
    "\26\12\1\35\3\12\12\0\5\12\2\0\7\12\1\36"+
    "\20\12\1\37\1\12\12\0\5\12\2\0\12\12\1\40"+
    "\13\12\1\41\3\12\12\0\5\12\2\0\23\12\1\42"+
    "\6\12\12\0\5\12\2\0\7\12\1\43\22\12\12\0"+
    "\5\12\2\0\26\12\1\44\3\12\12\0\5\12\2\0"+
    "\23\12\1\45\6\12\12\0\5\12\2\0\26\12\1\46"+
    "\3\12\12\0\5\12\2\0\30\12\1\47\1\12\4\0"+
    "\1\50\1\51\4\0\1\30\4\27\2\0\32\30\4\0"+
    "\1\50\1\51\4\0\3\27\2\30\1\52\1\0\32\30"+
    "\4\0\1\50\1\51\4\0\5\30\1\52\1\0\32\30"+
    "\4\0\1\50\1\51\4\0\5\30\2\0\32\30\4\0"+
    "\1\50\1\51\4\0\5\30\2\0\30\30\1\53\1\30"+
    "\4\0\1\50\1\51\4\0\5\30\2\0\30\30\1\54"+
    "\1\30\4\0\1\50\1\51\4\0\5\30\2\0\7\30"+
    "\1\55\6\30\1\56\13\30\4\0\1\50\1\51\4\0"+
    "\5\30\2\0\16\30\1\57\13\30\12\0\5\12\2\0"+
    "\16\12\1\60\13\12\12\0\5\12\2\0\27\12\1\61"+
    "\2\12\12\0\5\12\2\0\25\12\1\62\4\12\12\0"+
    "\5\12\2\0\16\12\1\63\13\12\12\0\5\12\2\0"+
    "\27\12\1\64\2\12\12\0\5\12\2\0\25\12\1\65"+
    "\4\12\12\0\5\12\2\0\20\12\1\66\11\12\12\0"+
    "\5\12\2\0\30\12\1\65\1\12\12\0\5\12\2\0"+
    "\20\12\1\67\11\12\12\0\5\12\2\0\27\12\1\70"+
    "\2\12\12\0\5\12\2\0\24\12\1\71\5\12\4\0"+
    "\1\50\1\72\4\0\5\50\2\0\32\50\12\0\4\73"+
    "\41\0\1\50\1\51\4\0\5\30\2\0\13\30\1\74"+
    "\16\30\4\0\1\50\1\51\4\0\5\30\2\0\22\30"+
    "\1\75\7\30\4\0\1\50\1\51\4\0\5\30\2\0"+
    "\25\30\1\76\4\30\4\0\1\50\1\51\4\0\5\30"+
    "\2\0\13\30\1\77\16\30\4\0\1\50\1\51\4\0"+
    "\5\30\2\0\13\30\1\100\16\30\12\0\5\12\2\0"+
    "\15\12\1\101\14\12\12\0\5\12\2\0\13\12\1\102"+
    "\16\12\12\0\5\12\2\0\26\12\1\103\3\12\12\0"+
    "\5\12\2\0\14\12\1\104\15\12\12\0\5\12\2\0"+
    "\30\12\1\105\1\12\12\0\5\12\2\0\7\12\1\106"+
    "\22\12\12\0\5\12\2\0\23\12\1\107\6\12\12\0"+
    "\5\12\2\0\7\12\1\110\22\12\12\0\5\12\2\0"+
    "\30\12\1\111\1\12\12\0\5\12\2\0\13\12\1\112"+
    "\16\12\12\0\5\113\40\0\1\50\1\51\4\0\5\30"+
    "\2\0\31\30\1\75\4\0\1\50\1\51\4\0\5\30"+
    "\2\0\13\30\1\114\16\30\4\0\1\50\1\51\4\0"+
    "\5\30\2\0\27\30\1\75\2\30\4\0\1\50\1\51"+
    "\4\0\5\30\2\0\25\30\1\115\4\30\4\0\1\50"+
    "\1\51\4\0\5\30\2\0\25\30\1\54\4\30\12\0"+
    "\5\12\2\0\22\12\1\116\7\12\12\0\5\12\2\0"+
    "\12\12\1\117\17\12\12\0\5\12\2\0\23\12\1\120"+
    "\6\12\12\0\5\12\2\0\16\12\1\121\13\12\12\0"+
    "\5\12\2\0\12\12\1\122\17\12\12\0\5\12\2\0"+
    "\25\12\1\123\4\12\12\0\5\12\2\0\22\12\1\120"+
    "\7\12\12\0\5\12\2\0\10\12\1\124\21\12\12\0"+
    "\5\12\2\0\12\12\1\125\17\12\12\0\5\12\2\0"+
    "\25\12\1\126\4\12\30\0\1\127\14\0\1\127\11\0"+
    "\1\50\1\51\4\0\5\30\2\0\26\30\1\130\3\30"+
    "\4\0\1\50\1\51\4\0\5\30\2\0\11\30\1\131"+
    "\20\30\12\0\5\12\2\0\7\12\1\132\22\12\12\0"+
    "\5\12\2\0\25\12\1\133\4\12\12\0\5\12\2\0"+
    "\11\12\1\123\20\12\12\0\5\12\2\0\16\12\1\134"+
    "\13\12\12\0\5\12\2\0\16\12\1\103\13\12\12\0"+
    "\5\12\2\0\23\12\1\135\6\12\12\0\5\12\2\0"+
    "\16\12\1\136\13\12\42\0\1\137\14\0\1\50\1\140"+
    "\4\0\5\30\2\0\32\30\4\0\1\50\1\51\4\0"+
    "\5\30\2\0\23\30\1\141\6\30\12\0\5\12\2\0"+
    "\25\12\1\120\4\12\12\0\5\12\2\0\7\12\1\142"+
    "\22\12\12\0\5\12\2\0\7\12\1\143\22\12\12\0"+
    "\5\12\2\0\25\12\1\144\4\12\12\0\5\12\2\0"+
    "\7\12\1\145\22\12\11\0\1\146\45\0\1\50\1\51"+
    "\4\0\5\30\2\0\20\30\1\75\11\30\12\0\5\12"+
    "\2\0\27\12\1\147\2\12\12\0\5\12\2\0\22\12"+
    "\1\150\7\12\12\0\5\12\2\0\7\12\1\151\22\12"+
    "\12\0\5\12\2\0\22\12\1\152\7\12\13\0\1\153"+
    "\3\154\46\0\5\12\2\0\16\12\1\155\13\12\12\0"+
    "\5\12\2\0\27\12\1\156\2\12\12\0\5\12\2\0"+
    "\12\12\1\157\17\12\12\0\5\12\2\0\27\12\1\160"+
    "\2\12\12\0\3\154\2\0\1\161\52\0\1\161\45\0"+
    "\5\12\2\0\11\12\1\103\20\12\12\0\5\12\2\0"+
    "\13\12\1\120\16\12\12\0\5\12\2\0\23\12\1\112"+
    "\6\12\12\0\5\12\2\0\13\12\1\126\16\12\12\0"+
    "\4\162\47\0\5\163\64\0\1\164\14\0\1\164\47\0"+
    "\1\165\15\0\1\166\45\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4644];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\3\11\1\1\1\11\11\1\10\0"+
    "\13\1\1\0\1\11\6\0\12\1\1\11\6\0\12\1"+
    "\3\0\11\1\3\0\5\1\1\0\1\11\1\0\4\1"+
    "\1\0\4\1\2\0\4\1\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol after_symbl = new Symbol(0);
    private Symbol tmp_symbl = new Symbol(0);

    private Cola<String> errores;

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
    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { error(yytext());
            }
            // fall through
          case 14: break;
          case 2:
            { /*Do nothing*/
            }
            // fall through
          case 15: break;
          case 3:
            { //System.out.println("Parentecis Apertura: "+yytext());
            return new Symbol (P_A,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            // fall through
          case 16: break;
          case 4:
            { //System.out.println("Parentesis Cierre: "+yytext());
            return new Symbol (P_C,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            // fall through
          case 17: break;
          case 5:
            { //System.out.println("Coma: "+yytext());
            return new Symbol (COMA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            // fall through
          case 18: break;
          case 6:
            { //System.out.println("Cadena Alfanumerica: "+yytext());
            if(pruebaCarnet(yytext())){

                return new Symbol (CARNET,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));

            }else if(pruebaNumero(yytext())){

                return new Symbol (NUMERO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));

            }else{

                return new Symbol (ALFANUMERICO,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            }
            // fall through
          case 19: break;
          case 7:
            { //System.out.println("Punto y coma: "+yytext());
            return new Symbol (DOT_COMA,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            // fall through
          case 20: break;
          case 8:
            { //System.out.println("Cadena2: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (STRING,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
            }
            // fall through
          case 21: break;
          case 9:
            { //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (STRING_SPACE,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
            }
            // fall through
          case 22: break;
          case 10:
            { //System.out.println("Palabra Recervada: "+yytext());
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
            // fall through
          case 23: break;
          case 11:
            { //System.out.println("Tipo Usuario: "+yytext());
            return new Symbol (TIPO_USER,after_symbl.sym,0, new token(yytext(),yycolumn+1,yyline+1));
            }
            // fall through
          case 24: break;
          case 12:
            { //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (CADENA_DIA,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
            }
            // fall through
          case 25: break;
          case 13:
            { //System.out.println("Cadena: "+yytext());
            String newText = yytext();
            newText = newText.substring(1, newText.length()-1);
            return new Symbol (CADENA_HORARIO,after_symbl.sym,0, new token(newText,yycolumn+1,yyline+1));
            }
            // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
