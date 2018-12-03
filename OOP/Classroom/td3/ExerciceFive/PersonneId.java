public class PersonneId implements Identity{
  private String name;
  private String surname;

  public PersonneId(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public String presente() {
    return "\n\n\t\tName: " + this.name + "\n\n\t\tsurname: " + this.surname;
  }

  public boolean compare(Object o) {
    if (!(o instanceof PersonneId)) {
      return false;
    } else {
      if (o.equals(PersonneId)) {
        return false;
      }
    }
    return false;
  }
}
