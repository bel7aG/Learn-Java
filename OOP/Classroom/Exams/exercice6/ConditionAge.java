public class ConditionAge implements ConditionAcces {
  private int ageMin;

  public ConditionAge(int ageMin) {
    this.ageMin = ageMin;
  }

  @Override
  public boolean autoriserAcces(Personne personne) {
    return personne.getAge() > this.ageMin;
  }

  @Override
  public String getDescription() {
    return "Age must be greater than " + this.ageMin + ".";
  }
}
