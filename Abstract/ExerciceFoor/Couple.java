public class couple implements Nuplet {
  private int eltOne, eltTwo;

  public couple(int eltOne, int eltTwo) {
    this.eltOne = eltOne;
    this.eltTwo = eltTwo;
  }

  @Override
  public int sum() {
    return (this.eltOne + this.eltTwo);
  }

  @Override
  public int produit() {
    return (this.eltOne * this.eltTwo);
  }

  @Override
  public int moyen() {
    return (int) this.sum() / 2;
  }


  public Couple add(Couple x) {
    Couple addedCouple = new COuple(0, 0);
    addedCouple.eltOne =  this.eltOne + x.eltOne;
    addedCouple.eltTwo =  this.eltTwo + x.eltTwo;
    return x;
  }

}
