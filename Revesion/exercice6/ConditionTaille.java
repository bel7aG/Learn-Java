public class ConditionTaille implements ConditionAcces {
  private double tailleMin;

  public ConditionTaille(double tailleMin) {
    this.tailleMin = tailleMin;
  }

  @Override
  public boolean autoriserAcces(Personne personne) {
    return personne.getTaille() > this.tailleMin;
  }

  @Override
  public String getDescription() {
    return "Taille must be greater than " + this.tailleMin + ".";
  }

}
