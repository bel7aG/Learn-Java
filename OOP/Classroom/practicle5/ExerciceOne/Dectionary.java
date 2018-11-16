public class Dectionary extends Document {

  private String language;

  public Dectionary(String language, int numEnreg, String title) {
    super(numEnreg, title);
    this.language = language;
  }

  public String toString() {
    return super.getNum() + "\n" + super.getTitle() + "\n" + this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getLanguage() {
    return this.language;
  }

}
