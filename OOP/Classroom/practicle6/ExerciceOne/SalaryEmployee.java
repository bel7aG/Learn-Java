enum Tgrade{cadre, executant};

public class SalaryEmployee extends Employee {
  private Tgrade grade;

  public SalaryEmployee(Tgrade grade, int matricule, String name, String surname, Date birthDay, float prime) {
    super(matricule, name, surname, birthDay, prime);
    this.grade = grade;
  }

  @Override
  public float salaryCalculation() {
    return this.grade.cadre ? (float) (700 + this.getPrime()) : (float) (200 + this.getPrime());
  }

  @Override
  public String toString() {
    return super.toString() + "\n\tgrade: " + this.grade;
  }
}
