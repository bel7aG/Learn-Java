public class App {
  public static void main(String[] args) {

    Animal lion = new Lion();

    lion.message();

    Lion suzi = (Lion)lion;

    System.out.println(lion);
    System.out.println(suzi);



  }
}
