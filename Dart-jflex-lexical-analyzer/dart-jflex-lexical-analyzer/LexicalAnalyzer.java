// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/Debora Barbosa/eclipse-workspace/portugol-jflex-lexical-analyzer-main.zip_expanded/portugol-jflex-lexical-analyzer-main/language.flex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexicalAnalyzer {

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
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

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
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\4\0\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\11\17\1\20\1\21\1\22"+
    "\1\23\1\24\2\0\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\26\1\34\2\26\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\4\26\1\50\1\0\1\51\1\0\1\26\1\0\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\26\1\34"+
    "\2\26\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\4\26\1\52\1\53\1\54"+
    "\7\0\1\3\252\0\2\55\115\0\1\56\u01a8\0\2\3"+
    "\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
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
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\2\12\1\13\1\14\1\15"+
    "\1\1\1\16\4\17\1\20\13\17\1\21\1\22\1\23"+
    "\1\2\1\24\2\1\1\0\1\25\1\0\1\25\1\26"+
    "\1\27\1\30\1\0\1\31\1\32\1\33\1\34\1\35"+
    "\4\17\1\36\1\17\1\0\2\17\1\0\3\17\1\0"+
    "\5\17\1\37\3\17\1\40\1\17\1\0\2\17\1\0"+
    "\1\40\1\17\1\41\2\17\1\0\1\17\2\42\3\17"+
    "\1\0\1\17\1\43\1\17\1\43\2\17\1\0\1\17"+
    "\1\0\1\17\1\44\1\45\7\17\1\0\1\46\1\17"+
    "\2\0\2\17\2\47\1\17\1\0\3\17\1\0\1\50"+
    "\3\17\1\0\2\51\1\17\1\0\1\52\1\17\1\53"+
    "\1\17\1\0\1\17\1\0\1\17\2\54\1\17\2\0"+
    "\2\17\2\55\1\17\1\56\1\17\1\0\2\17\1\0"+
    "\1\17\1\0\1\17\1\0\2\17\1\0\1\17\1\0"+
    "\1\57\1\60\1\57\1\17\1\0\3\17\1\0\1\61"+
    "\2\62\1\17\1\0\2\63\2\17\1\0\2\64\1\17"+
    "\1\0\2\17\2\65\2\66\1\17\1\0\1\17\1\0"+
    "\1\17\1\0\1\17\1\67\2\65\1\17\1\0\2\70"+
    "\2\71\1\72\1\17\1\0\1\17\1\0\1\17\1\0"+
    "\2\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[228];
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
    "\0\0\0\57\0\57\0\136\0\215\0\57\0\57\0\57"+
    "\0\274\0\57\0\353\0\u011a\0\57\0\u0149\0\u0178\0\57"+
    "\0\57\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439"+
    "\0\u0468\0\u0497\0\u04c6\0\u04f5\0\57\0\57\0\57\0\u0263"+
    "\0\57\0\u0524\0\u0553\0\136\0\136\0\215\0\215\0\57"+
    "\0\57\0\u011a\0\u0149\0\57\0\57\0\57\0\57\0\57"+
    "\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u0263\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\u0872\0\u08a1\0\u0263\0\u08d0\0\u08ff\0\u092e\0\u095d"+
    "\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0263"+
    "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0263\0\57\0\u0b91\0\u0bc0"+
    "\0\u0bef\0\u0c1e\0\u0c4d\0\u0263\0\u0c7c\0\57\0\u0cab\0\u0cda"+
    "\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0263\0\u0263\0\u0dc5\0\u0df4"+
    "\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0263\0\u0f3d"+
    "\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u0263\0\57\0\u1028\0\u1057"+
    "\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u0263\0\u1142\0\u1171\0\u11a0"+
    "\0\u11cf\0\u0263\0\57\0\u11fe\0\u122d\0\u0263\0\u125c\0\u0263"+
    "\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u0263\0\57\0\u1376"+
    "\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u0263\0\57\0\u1461\0\u0263"+
    "\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u15d9"+
    "\0\u1608\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u0263\0\u0263"+
    "\0\57\0\u1722\0\u1751\0\u1780\0\u17af\0\u17de\0\u180d\0\u0263"+
    "\0\u0263\0\57\0\u183c\0\u186b\0\u0263\0\57\0\u189a\0\u18c9"+
    "\0\u18f8\0\u0263\0\57\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3"+
    "\0\u1a12\0\u0263\0\57\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd"+
    "\0\u1b2c\0\u1b5b\0\u0263\0\u0263\0\57\0\u1b8a\0\u1bb9\0\u0263"+
    "\0\57\0\u0263\0\57\0\u0263\0\u1be8\0\u1c17\0\u1c46\0\u1c75"+
    "\0\u1ca4\0\u1cd3\0\u0263\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[228];
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
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\26\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\26\1\41\1\42\1\43\1\26\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\57\0\2\54"+
    "\2\0\1\55\52\54\2\56\2\0\1\56\1\57\51\56"+
    "\11\0\1\60\60\0\1\61\61\0\2\62\53\0\1\62"+
    "\1\0\2\63\53\0\1\62\1\0\2\17\52\0\1\64"+
    "\7\0\1\65\1\66\55\0\1\67\56\0\1\70\51\0"+
    "\2\26\5\0\10\26\1\71\7\26\1\72\2\26\3\0"+
    "\1\26\21\0\2\26\5\0\23\26\3\0\1\26\21\0"+
    "\2\26\5\0\1\73\12\26\1\74\7\26\3\0\1\26"+
    "\21\0\2\26\5\0\4\26\1\75\2\26\1\76\13\26"+
    "\3\0\1\26\1\0\1\77\17\0\2\26\5\0\12\26"+
    "\1\100\4\26\1\101\3\26\3\0\1\26\2\0\1\102"+
    "\16\0\2\26\5\0\1\103\6\26\1\104\11\26\1\105"+
    "\1\26\3\0\1\26\1\0\1\106\17\0\2\26\5\0"+
    "\12\26\1\107\10\26\3\0\1\26\21\0\2\26\5\0"+
    "\4\26\1\110\6\26\1\111\7\26\3\0\1\26\21\0"+
    "\2\26\5\0\13\26\1\112\7\26\3\0\1\26\21\0"+
    "\2\26\5\0\1\113\22\26\3\0\1\26\21\0\2\26"+
    "\5\0\21\26\1\114\1\26\3\0\1\26\21\0\2\26"+
    "\5\0\1\115\15\26\1\116\4\26\3\0\1\26\21\0"+
    "\2\26\5\0\4\26\1\117\16\26\3\0\1\26\21\0"+
    "\2\26\5\0\4\26\1\120\16\26\3\0\1\26\21\0"+
    "\2\26\5\0\7\26\1\121\13\26\3\0\1\26\1\0"+
    "\1\122\17\0\2\26\5\0\1\123\3\26\1\124\16\26"+
    "\3\0\1\26\42\0\1\125\50\0\1\126\43\0\2\26"+
    "\5\0\6\26\1\127\14\26\3\0\1\26\21\0\2\26"+
    "\5\0\4\26\1\130\16\26\3\0\1\26\21\0\2\26"+
    "\5\0\16\26\1\131\1\132\3\26\3\0\1\26\2\0"+
    "\1\133\16\0\2\26\5\0\12\26\1\134\10\26\3\0"+
    "\1\26\21\0\2\26\5\0\22\26\1\135\3\0\1\26"+
    "\52\0\1\136\25\0\2\26\5\0\15\26\1\137\2\26"+
    "\1\140\2\26\3\0\1\26\21\0\2\26\5\0\2\26"+
    "\1\141\20\26\3\0\1\26\32\0\1\142\45\0\2\26"+
    "\5\0\2\26\1\143\20\26\3\0\1\26\21\0\2\26"+
    "\5\0\11\26\1\144\11\26\3\0\1\26\21\0\2\26"+
    "\5\0\12\26\1\145\10\26\3\0\1\26\41\0\1\146"+
    "\36\0\2\26\5\0\7\26\1\147\10\26\1\150\2\26"+
    "\3\0\1\26\1\0\1\151\17\0\2\26\5\0\7\26"+
    "\1\152\13\26\3\0\1\26\1\0\1\153\17\0\2\26"+
    "\5\0\6\26\1\154\14\26\3\0\1\26\21\0\2\26"+
    "\5\0\3\26\1\155\17\26\3\0\1\26\21\0\2\26"+
    "\5\0\13\26\1\156\7\26\3\0\1\26\21\0\2\26"+
    "\5\0\16\26\1\157\4\26\3\0\1\26\21\0\2\26"+
    "\5\0\13\26\1\160\7\26\3\0\1\26\21\0\2\26"+
    "\5\0\1\161\5\26\1\162\5\26\1\163\6\26\3\0"+
    "\1\26\21\0\2\26\5\0\12\26\1\164\10\26\3\0"+
    "\1\26\21\0\2\26\5\0\14\26\1\165\6\26\3\0"+
    "\1\26\44\0\1\166\33\0\2\26\5\0\16\26\1\167"+
    "\4\26\3\0\1\26\21\0\2\26\5\0\20\26\1\170"+
    "\2\26\3\0\1\26\37\0\1\151\10\0\1\171\7\0"+
    "\1\151\40\0\1\172\35\0\2\26\5\0\13\26\1\173"+
    "\7\26\3\0\1\26\21\0\2\26\5\0\1\174\22\26"+
    "\3\0\1\26\21\0\2\26\5\0\13\26\1\175\7\26"+
    "\3\0\1\26\43\0\1\176\34\0\2\26\5\0\17\26"+
    "\1\177\3\26\3\0\1\26\2\0\1\200\16\0\2\26"+
    "\5\0\21\26\1\201\1\26\3\0\1\26\21\0\2\26"+
    "\5\0\1\202\22\26\3\0\1\26\21\0\2\26\5\0"+
    "\16\26\1\203\4\26\3\0\1\26\46\0\1\204\31\0"+
    "\2\26\5\0\1\205\22\26\3\0\1\26\21\0\2\26"+
    "\5\0\2\26\1\206\20\26\3\0\1\26\21\0\2\26"+
    "\5\0\2\26\1\207\20\26\3\0\1\26\21\0\2\26"+
    "\5\0\4\26\1\210\16\26\3\0\1\26\32\0\1\211"+
    "\45\0\2\26\5\0\1\212\22\26\3\0\1\26\30\0"+
    "\1\213\47\0\2\26\5\0\7\26\1\214\13\26\3\0"+
    "\1\26\1\0\1\215\17\0\2\26\5\0\1\216\22\26"+
    "\3\0\1\26\21\0\2\26\5\0\2\26\1\217\20\26"+
    "\3\0\1\26\21\0\2\26\5\0\10\26\1\220\12\26"+
    "\3\0\1\26\21\0\2\26\5\0\7\26\1\221\13\26"+
    "\3\0\1\26\1\0\1\222\17\0\2\26\5\0\7\26"+
    "\1\223\13\26\3\0\1\26\1\0\1\224\17\0\2\26"+
    "\5\0\1\225\22\26\3\0\1\26\21\0\2\26\5\0"+
    "\13\26\1\226\7\26\3\0\1\26\43\0\1\227\34\0"+
    "\2\26\5\0\13\26\1\230\7\26\3\0\1\26\34\0"+
    "\1\231\52\0\1\232\47\0\2\26\5\0\16\26\1\233"+
    "\4\26\3\0\1\26\21\0\2\26\5\0\2\26\1\234"+
    "\20\26\3\0\1\26\21\0\2\26\5\0\20\26\1\235"+
    "\2\26\3\0\1\26\50\0\1\236\27\0\2\26\5\0"+
    "\1\237\22\26\3\0\1\26\21\0\2\26\5\0\13\26"+
    "\1\240\7\26\3\0\1\26\21\0\2\26\5\0\4\26"+
    "\1\241\16\26\3\0\1\26\34\0\1\242\43\0\2\26"+
    "\5\0\1\243\22\26\3\0\1\26\21\0\2\26\5\0"+
    "\7\26\1\244\13\26\3\0\1\26\1\0\1\245\17\0"+
    "\2\26\5\0\7\26\1\246\13\26\3\0\1\26\1\0"+
    "\1\247\35\0\1\245\20\0\1\245\17\0\2\26\5\0"+
    "\2\26\1\250\20\26\3\0\1\26\32\0\1\251\45\0"+
    "\2\26\5\0\4\26\1\252\16\26\3\0\1\26\21\0"+
    "\2\26\5\0\17\26\1\253\3\26\3\0\1\26\2\0"+
    "\1\254\44\0\1\254\11\0\1\254\16\0\2\26\5\0"+
    "\20\26\1\255\2\26\3\0\1\26\50\0\1\256\27\0"+
    "\2\26\5\0\13\26\1\257\7\26\3\0\1\26\21\0"+
    "\2\26\5\0\16\26\1\260\4\26\3\0\1\26\37\0"+
    "\1\247\20\0\1\247\41\0\1\261\34\0\2\26\5\0"+
    "\7\26\1\262\13\26\3\0\1\26\1\0\1\263\17\0"+
    "\2\26\5\0\20\26\1\264\2\26\3\0\1\26\21\0"+
    "\2\26\5\0\12\26\1\265\10\26\3\0\1\26\21\0"+
    "\2\26\5\0\22\26\1\266\3\0\1\26\52\0\1\267"+
    "\25\0\2\26\5\0\13\26\1\270\7\26\3\0\1\26"+
    "\21\0\2\26\5\0\13\26\1\271\7\26\3\0\1\26"+
    "\43\0\1\272\34\0\2\26\5\0\16\26\1\273\4\26"+
    "\3\0\1\26\46\0\1\274\31\0\2\26\5\0\13\26"+
    "\1\275\7\26\3\0\1\26\43\0\1\276\34\0\2\26"+
    "\5\0\3\26\1\277\17\26\3\0\1\26\21\0\2\26"+
    "\5\0\20\26\1\300\2\26\3\0\1\26\50\0\1\301"+
    "\27\0\2\26\5\0\1\302\22\26\3\0\1\26\30\0"+
    "\1\303\47\0\2\26\5\0\20\26\1\304\2\26\3\0"+
    "\1\26\50\0\1\305\27\0\2\26\5\0\4\26\1\306"+
    "\16\26\3\0\1\26\21\0\2\26\5\0\20\26\1\307"+
    "\2\26\3\0\1\26\21\0\2\26\5\0\1\310\22\26"+
    "\3\0\1\26\30\0\1\311\47\0\2\26\5\0\13\26"+
    "\1\312\7\26\3\0\1\26\43\0\1\313\34\0\2\26"+
    "\5\0\7\26\1\314\13\26\3\0\1\26\1\0\1\315"+
    "\17\0\2\26\5\0\16\26\1\316\4\26\3\0\1\26"+
    "\46\0\1\317\31\0\2\26\5\0\11\26\1\320\11\26"+
    "\3\0\1\26\41\0\1\321\36\0\2\26\5\0\16\26"+
    "\1\322\4\26\3\0\1\26\21\0\2\26\5\0\13\26"+
    "\1\323\7\26\3\0\1\26\21\0\2\26\5\0\10\26"+
    "\1\324\12\26\3\0\1\26\40\0\1\325\37\0\2\26"+
    "\5\0\11\26\1\326\11\26\3\0\1\26\41\0\1\327"+
    "\36\0\2\26\5\0\13\26\1\330\7\26\3\0\1\26"+
    "\43\0\1\331\34\0\2\26\5\0\13\26\1\332\7\26"+
    "\3\0\1\26\43\0\1\333\34\0\2\26\5\0\4\26"+
    "\1\334\16\26\3\0\1\26\21\0\2\26\5\0\4\26"+
    "\1\335\16\26\3\0\1\26\34\0\1\336\43\0\2\26"+
    "\5\0\12\26\1\337\10\26\3\0\1\26\42\0\1\340"+
    "\35\0\2\26\5\0\20\26\1\341\2\26\3\0\1\26"+
    "\50\0\1\342\27\0\2\26\5\0\13\26\1\343\7\26"+
    "\3\0\1\26\43\0\1\344\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7426];
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
    "\1\0\2\11\2\1\3\11\1\1\1\11\2\1\1\11"+
    "\2\1\2\11\23\1\3\11\1\1\1\11\2\1\1\0"+
    "\1\1\1\0\1\1\2\11\1\1\1\0\5\11\6\1"+
    "\1\0\2\1\1\0\3\1\1\0\13\1\1\0\2\1"+
    "\1\0\5\1\1\0\2\1\1\11\3\1\1\0\3\1"+
    "\1\11\2\1\1\0\1\1\1\0\12\1\1\0\2\1"+
    "\2\0\3\1\1\11\1\1\1\0\3\1\1\0\4\1"+
    "\1\0\1\1\1\11\1\1\1\0\4\1\1\0\1\1"+
    "\1\0\2\1\1\11\1\1\2\0\3\1\1\11\3\1"+
    "\1\0\2\1\1\0\1\1\1\0\1\1\1\0\2\1"+
    "\1\0\1\1\1\0\2\1\1\11\1\1\1\0\3\1"+
    "\1\0\2\1\1\11\1\1\1\0\1\1\1\11\2\1"+
    "\1\0\1\1\1\11\1\1\1\0\5\1\1\11\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\3\1\1\11\1\1"+
    "\1\0\1\1\1\11\1\1\1\11\2\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[228];
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
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
	private DartToken createToken(String name, String value) {
    return new DartToken(name, value, yyline);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicalAnalyzer(java.io.Reader in) {
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
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public DartToken yylex() throws java.io.IOException {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + yyline + ", coluna " +yycolumn);
            }
            // fall through
          case 60: break;
          case 2:
            { /**/
            }
            // fall through
          case 61: break;
          case 3:
            { return createToken("Abrir parenteses", yytext());
            }
            // fall through
          case 62: break;
          case 4:
            { return createToken("Fechar parenteses", yytext());
            }
            // fall through
          case 63: break;
          case 5:
            { return createToken("Operador multiplicacao", yytext());
            }
            // fall through
          case 64: break;
          case 6:
            { return createToken("Operador soma", yytext());
            }
            // fall through
          case 65: break;
          case 7:
            { return createToken("Virgula", yytext());
            }
            // fall through
          case 66: break;
          case 8:
            { return createToken("Operador subtracao", yytext());
            }
            // fall through
          case 67: break;
          case 9:
            { return createToken("Operador divisao", yytext());
            }
            // fall through
          case 68: break;
          case 10:
            { return createToken("Numero Inteiro", yytext());
            }
            // fall through
          case 69: break;
          case 11:
            { return createToken("Dois pontos", yytext());
            }
            // fall through
          case 70: break;
          case 12:
            { return createToken("Final de instrucao", yytext());
            }
            // fall through
          case 71: break;
          case 13:
            { return createToken("Operador menor", yytext());
            }
            // fall through
          case 72: break;
          case 14:
            { return createToken("Operador maior", yytext());
            }
            // fall through
          case 73: break;
          case 15:
            { return createToken("Identificador", yytext());
            }
            // fall through
          case 74: break;
          case 16:
            { return createToken("Palavra reservada e", yytext());
            }
            // fall through
          case 75: break;
          case 17:
            { return createToken("Abrir colchetes", yytext());
            }
            // fall through
          case 76: break;
          case 18:
            { return createToken("Fechar colchetes", yytext());
            }
            // fall through
          case 77: break;
          case 19:
            { return createToken("Abrir chaves", yytext());
            }
            // fall through
          case 78: break;
          case 20:
            { return createToken("Fechar chaves", yytext());
            }
            // fall through
          case 79: break;
          case 21:
            { return createToken("Texto ", yytext());
            }
            // fall through
          case 80: break;
          case 22:
            { return createToken("Operador Incrementa", yytext());
            }
            // fall through
          case 81: break;
          case 23:
            { return createToken("Operador Decrementa", yytext());
            }
            // fall through
          case 82: break;
          case 24:
            { return createToken("Numero Real ",yytext());
            }
            // fall through
          case 83: break;
          case 25:
            { return createToken("Operador de atribuicao", yytext());
            }
            // fall through
          case 84: break;
          case 26:
            { return createToken("Operador menor igual", yytext());
            }
            // fall through
          case 85: break;
          case 27:
            { return createToken("Operador de desigualdade", yytext());
            }
            // fall through
          case 86: break;
          case 28:
            { return createToken("Operador igualdade", yytext());
            }
            // fall through
          case 87: break;
          case 29:
            { return createToken("Operador maior igual", yytext());
            }
            // fall through
          case 88: break;
          case 30:
            { return createToken("Palavra reservada de", yytext());
            }
            // fall through
          case 89: break;
          case 31:
            { return createToken("Identificador de uniao", yytext());
            }
            // fall through
          case 90: break;
          case 32:
            { return createToken("Palavra reservada se", yytext());
            }
            // fall through
          case 91: break;
          case 33:
            { return createToken("Palavra reservada ate", yytext());
            }
            // fall through
          case 92: break;
          case 34:
            { return createToken("Palavra reservada div", yytext());
            }
            // fall through
          case 93: break;
          case 35:
            { return createToken("Palavra reservada fim", yytext());
            }
            // fall through
          case 94: break;
          case 36:
            { return createToken("Palavra reservada mod", yytext());
            }
            // fall through
          case 95: break;
          case 37:
            { return createToken("Palavra reservada nao", yytext());
            }
            // fall through
          case 96: break;
          case 38:
            { return createToken("Palavra reservada var", yytext());
            }
            // fall through
          case 97: break;
          case 39:
            { return createToken("Palavra reservada caso", yytext());
            }
            // fall through
          case 98: break;
          case 40:
            { return createToken("Palavra reservada faca", yytext());
            }
            // fall through
          case 99: break;
          case 41:
            { return createToken("Palavra reservada leia", yytext());
            }
            // fall through
          case 100: break;
          case 42:
            { return createToken("Palavra reservada para", yytext());
            }
            // fall through
          case 101: break;
          case 43:
            { return createToken("Tipo de dado numero real", yytext());
            }
            // fall through
          case 102: break;
          case 44:
            { return createToken("Palavra reservada tipo", yytext());
            }
            // fall through
          case 103: break;
          case 45:
            { return createToken("Palavra reservada const", yytext());
            }
            // fall through
          case 104: break;
          case 46:
            { return createToken("Palavra reservada entao", yytext());
            }
            // fall through
          case 105: break;
          case 47:
            { return createToken("Palavra reservada senao", yytext());
            }
            // fall through
          case 106: break;
          case 48:
            { return createToken("Palavra reservada vetor", yytext());
            }
            // fall through
          case 107: break;
          case 49:
            { return createToken("Palavra reservada funcao", yytext());
            }
            // fall through
          case 108: break;
          case 50:
            { return createToken("Palavra reservada inicio", yytext());
            }
            // fall through
          case 109: break;
          case 51:
            { return createToken("Tipo de dado valor logico", yytext());
            }
            // fall through
          case 110: break;
          case 52:
            { return createToken("Palavra reservada repita", yytext());
            }
            // fall through
          case 111: break;
          case 53:
            { return createToken("Palavra reservada escreva", yytext());
            }
            // fall through
          case 112: break;
          case 54:
            { return createToken("Tipo de dado numero inteiro", yytext());
            }
            // fall through
          case 113: break;
          case 55:
            { return createToken("Palavra reservada enquanto", yytext());
            }
            // fall through
          case 114: break;
          case 56:
            { return createToken("Palavra reservada registro", yytext());
            }
            // fall through
          case 115: break;
          case 57:
            { return createToken("Palavra reservada algoritmo", yytext());
            }
            // fall through
          case 116: break;
          case 58:
            { return createToken("Tipo de dado caractere", yytext());
            }
            // fall through
          case 117: break;
          case 59:
            { return createToken("Palavra reservada procedimento", yytext());
            }
            // fall through
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
