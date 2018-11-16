public class Document {

  private int numEnreg;
  private String title;

  public Document(int numEnreg, String title) {
    this.numEnreg = numEnreg;
    this.title = title;
  }

  public String toString() {
    return "\n" + this.numEnreg + ": " + this.title + "\n";
  }

  public void setNum(int x) {
    this.numEnreg = x;
  }

  public int getNum() {
    return this.numEnreg;
  }


  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }
}
