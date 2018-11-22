public abstract class Employee {
  private int matricule;
  private String name, surname;
  private Date birthDay;
  private float prime;

  public abstract float salaryCalculation();

  public Employee(int matricule, String name, String surname, Date birthDay, float prime) {
    this.matricule = matricule;
    this.name = name;
    this.surname = surname;
    this.birthDay = birthDay;
    this.prime = prime;
  }

  public float getPrime() {
    return this.prime;
  }

  public String toString() {
    return (
      "\n\n\n\t\t\t\tname: "+ this.name + " " + this.surname +"\n\n\tMatricule: " + this.matricule +
      "\n\n\tBirth Day: " + this.birthDay.toString() + "\n\n\tPrime: " + this.prime
    );
  }
}
