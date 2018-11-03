public class EmployeSalary extends Employe {

  private String grade;

  public EmployeSalary(int matricule, String name, String surname, String grade) {
    super(matricule, name, surname);
    this.grade = grade;
  }

  public float salaryCalculation() {
    return this.grade.toLowerCase() == "cadre" ? (430 - getImpot()) : (200 - getImpot());
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

}
