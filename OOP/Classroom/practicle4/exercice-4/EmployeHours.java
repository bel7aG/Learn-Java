class EmployeHours extends Employe {
  private int jobHours;
  private int suphours;

  public EmployeHours(String matricule, String name, String surname, int impot, int jobHours, int suphours) {
    super(matricule, name, );
    this.jobHours = jobHours;
    this.suphours = suphours;
  }

  public float salaryCalculation(int newHours) {
    return (float)((this.jobHours * 0.650) + (this.supHours * 1.1)) - super.import;
  }

  public void changeJobHours(int jobHours) {
    this.jobHours = jobHours;
  }

  public void changeSupHours(int supHours) {
    this.supHours = supHours;
  }

}
