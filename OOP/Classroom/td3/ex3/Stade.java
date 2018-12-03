public class Stade {
  private String stadeName;
  private boolean etat;

  public Stade(String stadeName, boolean etat) {
    this.stadeName = stadeName;
    this.etat = etat;
  }

  public boolean getEtat() {
    return this.etat;
  }

  public String getStadeName() {
    return this.stadeName;
  }


}
