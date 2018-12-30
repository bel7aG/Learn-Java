public class App {
  public static void main(String[] args) {
    devideByZero(2);
  }

  public static void devideByZero(int x) {
    try {

      System.out.println(x/0);

    } catch(Exception e) {
      System.out.println("Sorry");
      System.out.println(e.getMessage());
      System.out.println(e.toString());
    }
  }

}
