public class  HoursSalaryEmployee extends Employee {
  private int numberOfHours;

  public HoursSalaryEmployee(int numberOfHours, int matricule, String name, String surname, Date birthDay, float prime) {
    super(matricule, name, surname, birthDay, prime);
    this.numberOfHours = numberOfHours;
  }

  @Override
  public float salaryCalculation() {
    return (float) (this.numberOfHours * 2 + this.getPrime());
  }

  @Override
  public String toString() {
    return super.toString() + "\n\n\tJob Hours: " + this.numberOfHours + "\n\n\tSalary: " + this.salaryCalculation() + " Dinars\n\n";
  }
}
