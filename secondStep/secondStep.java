import java.util.Scanner;

public class secondStep {
  static Scanner userInput = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Your Favorite Number is = ");

    // if (userInput.hasNextInt()) {

    //   /*
    //     hasNextInt()
    //     hasNextLine()
    //     hasNextLong()
    //     hasNextShort()
    //     hasNextBoolean()
    //   */
    //   /*
    //     nextInt()
    //     nextFloat()
    //     nextLine() ==> for String Type
    //     nextDouble()
    //     nextShort
    //     nextBoolean
    //   */
    //   int numberEntered = userInput.nextInt();
    //   System.out.println(numberEntered);
    //   System.out.println(userInput.hasNextInt());
    // } else {
    //   System.out.println("Sorry man but we need a Number Here");
    // }

    // upgrade it with do while LOOP.
    Boolean checkInput = false;
    do {
      if (userInput.hasNextInt()) {
        int numberInputUpgradet = userInput.nextInt();
        System.out.println(numberInputUpgradet);
        checkInput = true;
      } else {
        System.out.print("Your Favorite Number is = ");
        userInput = new Scanner(System.in);
      }
    } while (!checkInput);

  }
}
