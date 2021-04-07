import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Application {
  public static void main(String[] args) throws IOException {
    String rootPath = Paths.get("").toAbsolutePath(). toString();
    String sourceCode = rootPath + "/input2.txt";

    LexicalAnalyzer lexical = new LexicalAnalyzer(new FileReader(sourceCode));

    DartToken token;

    while ((token = lexical.yylex()) != null) {
      Integer correctLine = token.line + 1; 
      System.out.println("< " + token.value + " - " + token.name + " > (linha: " + correctLine + ")");
    }
  }
}