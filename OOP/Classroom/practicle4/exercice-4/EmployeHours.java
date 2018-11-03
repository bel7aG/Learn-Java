class EmployeHours extends Employe {
  private int jobHours;
  private int supHours;

  public EmployeHours(int matricule, String name, String surname, int jobHours, int supHours) {
    super(matricule, name, surname);
    this.jobHours = jobHours;
    this.supHours = supHours;
  }

  public float salaryCalculation(int newHours) {
    return (float)((this.jobHours * 0.650) + (this.supHours * 1.1)) - super.getImpot();
  }

  public void changeJobHours(int jobHours) {
    this.jobHours = jobHours;
  }

  public void changeSupHours(int supHours) {
    this.supHours = supHours;
  }

}
