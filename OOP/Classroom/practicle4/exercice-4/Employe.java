public class Employe {
  private int matricule;
  private String name;
  private String surname;
  private float impot;

  public Employe(int matricule, String name, String surname) {
    this.matricule = matricule;
    this.name = name;
    this.surname = surname;
  }

  public void setImpot(float paramFloat) {
    impot = paramFloat;
  }

  public float getImpot() {
    return impot;
  }

  public String toString() {
    return "Matricule: " + this.matricule + "\nname: " + this.name + "\nsurname: " + this.surname;
  }
}
