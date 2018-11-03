public class Provider {
  private String name;
  private int address;

  public Provider(String name, String address) {
    this.name = name;
    this.address = address;
  }
  public getName() {
    return this.name;
  }

  public getAddress() {
    return this.address;
  }

  public String toString() {
    return "name: " + this.getName() + "\nAddress: " + this.getAddress();
  }
}
