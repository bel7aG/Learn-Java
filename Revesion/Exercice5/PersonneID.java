public class PersonneID implements Identite {
  private String name, surname;

  public PersonneID(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String PersonneID() {
    return "\n\n\tName: " + this.name + " " + this.surname;
  }

  public boolean comparer(Object o) {
    if (o instanceof Object) {
      PersonneID p = (PersonneID) o;
      return this.name == p.name && this.surname == p.surname;
    } else {
      return false;
    }
  }

}
