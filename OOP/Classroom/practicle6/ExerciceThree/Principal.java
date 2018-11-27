public class Principal {
  public static void main(String[] args) {
    // System.out.println("name: ");
    // if (userInput.hasNextLine()) {
    //   String name = userInput.nextLine();
    // } else {
    //   System.out.println("we need a String type here ...");
    // }
    //
    // System.out.println("surname: ");
    // if (userInput.hasNextLine()) {
    //   String surname = userInput.nextLine();
    // } else {
    //   System.out.println("we need a String type here ...");
    //   break;
    // }

    Person belhassen = new Person("Belhassen", "gharsallah");

    Client s = new Client("Ananymous", "yayaya", 98);

    People p = new People();
    p.birthDay(belhassen);

    p.birthDay(s);
    p.explore();
  }
}
