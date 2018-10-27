public class meme {
  public static void main(String[] args) {
    Address address = new Address(11, "nahj", "Mohamed Ali", "Rades", 123);
    Person me = new Person("Belhassen", "Gharsallah", address);

    Car carOne = new Car(111, "Bugatti", "black");
    Car carTwo = new Car(999, "Audi", "Red");


    System.out.println("\n\n\n\n\n\nHello " + me.getName() + " " + me.getSurname() + "\n\n\n");


    me.buyCar(carOne);
    me.buyCar(carTwo);

    me.sellCar(999);

    me.Stream();


  }
}
