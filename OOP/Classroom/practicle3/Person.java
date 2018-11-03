import java.util.Arrays;

public class Person {
  private String name;
  private String surname;
  private Address homeAddress = new Address();
  private int nb = 0;
  public Car[] cars = new Car[10];

  public void changeHomeAddress(Address address) {
    this.homeAddress = address;
    System.out.println("Address" + this.homeAddress);
  }

  public void buyCar(Car newCar) {
    if (nb < 10) {
      this.cars[nb] = newCar;
      this.nb += 1;
    } else {
      System.out.println("Sorry you depassed the limit..");
    }
    System.out.println("Your new car name is " + this.cars[this.nb-1].mark + " color is " + this.cars[this.nb-1].color + "\n");
  }

  public void sellCar(int mat) {
    int k = 0;
    for (int i = 0; i < this.nb; i++) {
      if (this.cars[i].registrationNumber != mat) {
        this.cars[k] = this.cars[i];
        k++;
      } else {
        System.out.println("\n\n\n\nyou sell the car with RegistrationNumber: " + mat + " its mark is " + this.cars[i].mark + "\n\n\n\n\n\n");
        break;
      }
    }
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public Person(String name, String surname, Address homeAddress) {
    this.name = name;
    this.surname = surname;
    this.homeAddress = homeAddress;
  }

  public Person() {

  }

  public void Stream() {
    for (int i = 0; i < this.nb; i++) {
    }
  }


}
