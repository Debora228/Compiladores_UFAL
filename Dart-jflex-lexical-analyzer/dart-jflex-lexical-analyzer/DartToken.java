public class DartToken {
  public String name;
  public String value;
  public Integer line;

  public DartToken(String name, String value, Integer line) {
    this.name = name;
    this.value = value;
    this.line = line;
  }
}