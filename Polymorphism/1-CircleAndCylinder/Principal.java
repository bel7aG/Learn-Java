public class Principal {
  public static void main(String[] args) {
    //You can invoke all the methods defined in the Circle class for the reference c1,
    // (which is actually holding a Cylinder object)
    Circle c = new Cylinder(12.3, 33.1);
    System.out.println(c); //c.toString()
  }
}
