public class  HoursSalaryEmplyee extends Employee {
  private int numberOfHours;

  public HoursSalaryEmplyee(int numberOfHours, int matricule, String name, String surname, Date birthDay, float prime) {
    super(matricule, name, surname, birthDay, prime);
    this.numberOfHours = numberOfHours;
  }

  @Override
  public float salaryCalculation() {
    return (float) (this.numberOfHours * 2 + this.getPrime());
  }

  @Override
  public String toString() {
    return super.toString() + "\n\tJob Hours: " + this.numberOfHours;
  }
}
