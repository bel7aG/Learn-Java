public class Person implements Human {
  private String name, surname;

  public Person(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public void identity() {
    System.out.println("\n\n\n\t\t\t\tname: " + this.name + "\n\n\t\t\t\t" + "surname: " + this.surname);
  }
}
