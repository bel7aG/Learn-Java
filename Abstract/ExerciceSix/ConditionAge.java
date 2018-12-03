public class ConditionAge implements ConditionAcces {
  private int ageMin;
  public conditionAge(int ageMin) {
    this.ageMin = ageMin;
  }
  @Override
  public boolean autoriseeAccess(Personne p) {
    return p.getAge() >= this.ageMin;
  }

  @Override
  public String getDescription() {
    return "Age must be greater or equal to " + this.ageMin;
  }

}
