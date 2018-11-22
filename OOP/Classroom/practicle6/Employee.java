public abstract class Employee {
  private int matricule;
  private String name, surname;
  private Dateq birthDay;
  private float prime;

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
      "\n\n"+ this.name + " " + this.surname +"\n\tMatricule: " + this.matricule +
      "\n\tBirth Day: " + this.birthDay + "\n\tPrime: " + this.prime
    );
  }
}
