import java.util.Scanner;

public class learnMethods {

  static Scanner userInput = new Scanner(System.in);
  static int randomNum;

  public static void main(String[] args) {
    System.out.print("Random Number: ");
    System.out.println(getRandomNum());
  }

  public static int getRandomNum() {
    return (int) (Math.random() * 10);
  }
}
