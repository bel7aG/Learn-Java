enum Price{GONCOURT, MEDICIS, INTERALLIE};
public class Roman extends Book {
  private Price priceLitt;

  public Roman(Price priceLitt, String author, int nbrPages, int numEnreg, String title) {
    super(author, nbrPages, numEnreg, title);
    this.priceLitt = priceLitt;
  }

  public void setPriceLitt(Price priceLitt) {
    this.priceLitt = priceLitt;
  }

  public Price getPriceLitt() {
    return this.priceLitt;
  }

  public String toString() {
    return super.toString() + "\n\tPrice Litt: " + this.priceLitt;
  }
}
