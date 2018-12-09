import java.util.Scanner;

public class Math {

  static Scanner userInput = new Scanner(System.in);
  static double publicPI = 3.14;

  public static void main(String[] args) {
    System.out.print("First Number: ");
    int a = userInput.nextInt();

    System.out.print("Second Number: ");
    int b = userInput.nextInt();

    if (a > b) {
      System.out.println(a + " was greate then " + b);
    } else {
      System.out.println(b + " was greate then " + a);
    }

    System.out.println("Pi in main before change it in the addThemWithPI instance is equal to: " + publicPI);

    System.out.println(addThemWithPI(a, b));

    System.out.println("Pi in main after change it in the addThemWithPI instance is equal to: " + publicPI);



  }

  public static int addThemWithPI(int a, int b) {
    publicPI++;
    System.out.println("publicPI: " + publicPI);
    return Integer.parseInt((Integer.toString(b) + Integer.toString(a)));
  }
}
