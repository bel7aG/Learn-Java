public class Client extends Person implements Human {
  private int num;

  public Client(String name, String surname, int num) {
    super(name, surname);
    this.num = num;
  }

  @Override
  public void identity() {
    super.identity();
    System.out.println("\n\t\t\t\tNumber: " + this.num + "\n\n\n\n\n\n\n\n");
  }
}
