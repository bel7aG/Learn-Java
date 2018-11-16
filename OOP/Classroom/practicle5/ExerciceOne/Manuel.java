public class Manuel extends Book {
  private int niveau;

  public Manuel(int niveau, String author, int nbrPages, int numEnreg, String title) {
    super(author, nbrPages, numEnreg, title);
    this.niveau = niveau;
  }

  public void setNiveau(int niveau) {
    this.niveau = niveau;
  }

  public int getNiveau() {
    return this.niveau;
  }

  public String toString() {
    return super.toString() + "\tniveau: " + this.niveau;
  }
}
