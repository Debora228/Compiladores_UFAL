%%

%{
	private DartToken createToken(String name, String value) {
    return new DartToken(name, value, yyline);
	}
%}

%class LexicalAnalyzer

%type DartToken
%line 
%caseless

BRANCO 			= [\n| |\t|\r]
ID 					= [_|a-z|A-Z][a-z|A-Z|0-9|_]*
SOMA				= "+"
SUB					= "-"
MUL					= "*"
DIV				 	= "/"
INTEIRO 		= 0|[1-9][0-9]*
REAL				= (([0-9]+[.][0-9]*)|([0-9]*[.][0-9]+))
NOVALINHA		= [\n]
TEXTO				= (\"(.*?)\"|'(.*?)')


%%

"true"         {return createToken("Palavra reservada  TRUE", yytext());}
"for"          {return createToken("Palavra reservada  FOR", yytext());}
"var"          {return createToken("Palavra reservada  VAR", yytext());}
"int"          {return createToken("Palavra reservada  INT", yytext());}
"bool          {return createToken("Palavra reservada  VARBOOL", yytext());}
"else"         {return createToken("Palavra reservada  ELSE", yytext());}
"false"        {return createToken("Palavra reservada  FALSE", yytext());}
"while"        {return createToken("Palavra reservada  WHILE", yytext());}
"new"          {return createToken("Palavra reservada  NEW", yytext());}
"List"         {return createToken("Palavra reservada  LISTA", yytext());}
"add"          {return createToken("Palavra reservada  ADD", yytext());}
"if"           {return createToken("Palavra reservada  IF", yytext());}
"Map"          {return createToken("Palavra reservada  MAPA", yytext());}
"putIfAbsent"  {return createToken("Palavra reservada  PUT", yytext());}: 
"ifAbsent"     {return createToken("Palavra reservada  IFABSENT", yytext());}:
"update"       {return createToken("Palavra reservada  UPDATE", yytext());}
"print"        {return createToken("Palavra reservada PRINT", yytext());}
"substring"    {return createToken("Palavra reservada SUBSTRING", yytext());}
"void"         {return createToken("Palavra reservada VOID", yytext());}
"replaceRange"     {return createToken("Palavra reservada REPLACE", yytext());}

{BRANCO} 		    {/**/}
{ID} 			      {return createToken("Identificador", yytext());}
{SOMA}			    {return createToken("Operador soma", yytext());}
{SUB}			      {return createToken("Operador subtracao", yytext());}
{MUL}			      {return createToken("Operador multiplicacao", yytext());}
{DIV}			      {return createToken("Operador divisao", yytext());}
{INTEIRO} 		  {return createToken("Numero Inteiro", yytext());}
{REAL}			    {return createToken("Numero Real ",yytext());}
{NOVALINHA}		  {/**/}
{TEXTO}			    {return createToken("Texto ", yytext());}


. { throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + yyline + ", coluna " +yycolumn); }
