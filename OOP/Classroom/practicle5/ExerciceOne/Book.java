public class Book extends Document {

  private String author;
  private int nbrPages;

  public Book(String author, int nbrPages, int numEnreg, String title) {
    super(numEnreg, title);
    this.author = author;
    this.nbrPages = nbrPages;
  }

  public String toString() {
    return "\n\n\nBook - \nNumero: " + super.getNum() + "\n\ttitle: " + super.getTitle() + "\n\tAuthor: " + this.author + "\n\tPages: " + this.nbrPages + "\n";
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }


  public void setNbrPages(int nbrPages) {
    this.nbrPages = nbrPages;
  }

  public int getNbrPages() {
    return this.nbrPages;
  }
}
