import java.util.Scanner;
import java.util.Arrays;

public class LearnArrays {

  public static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args) {

            // Array of String

    // first Dec
    int[] myBeautyArray = new int[10];
    // second Dec
    int[] mySecondArray;
    mySecondArray = new int[20];

    String randomNum = "33";
    mySecondArray[1] = Integer.parseInt(randomNum);

    System.out.println(mySecondArray[1]);
    System.out.println(mySecondArray[0]); // ==> Java: in array of Integer the default value is 0

            // Array of String

    String[] stringArray = new String[30];
    stringArray[13] = "https://www.github.com/bel7aG";
    stringArray[3] = "bel7aG";
    stringArray[6] = "belhassen gharsallah";
    stringArray[14] = "LOLA66665";
    System.out.println(stringArray[4]); // in array of String default value is null

    int behind;
    String pivot;
    System.out.println("--------");
    for (int i = 0; i < stringArray.length; i++) {
      if (stringArray[0] == null) {
        int forward = 1;

        while ((stringArray[forward] == null && (forward <= stringArray.length))) {
          forward++;
          if (stringArray[forward] != null) {
            stringArray[0] = stringArray[forward];
            stringArray[forward] = null;
            break;
          }
        }
      }
      if (stringArray[i] != null && i > 0) {
        behind = (i);
        pivot = stringArray[i];
        stringArray[i] = null;
        while (stringArray[behind] == null && behind >= 0) {
          behind--;
          if(stringArray[behind - 1] != null) {
            stringArray[behind] = pivot;
          }
        }
      }
    }

    for (int i = 0; i < stringArray.length; i++) {
        System.out.println(stringArray[i]);
    }

            /* other array of string */

    String[] pLanguages = {
      "Javascript",
      "React",
      "es6",
      "css / scss",
      "jsx",
      "node",
      "python",
      "java",
      "PHP"
    };

    int index = 1;
    System.out.println();
    System.out.println();
    System.out.println();
    for (String language : pLanguages) {
      System.out.printf("Language %s is the %d for me.\n", language, index++);
    }

    String[][] multipleStringArray = new String[4][4];

    for (int i = 0; i < multipleStringArray.length; i++) {
      for (int j = 0; j < multipleStringArray[i].length; j++) {
        // multipleStringArray[i][j] = userInput.nextLine();
      }
    }

    System.out.println();
    System.out.println();
    for (int i = 0; i < multipleStringArray.length; i++) {
      System.out.print("| ");
      for (int j = 0; j < multipleStringArray[i].length; j++) {
        multipleStringArray[i][j] = "Line: " + Integer.toString(i + 1) + " - column: " + Integer.toString(j + 1);
        System.out.print(multipleStringArray[i][j] + " | ");
      }
      System.out.println();
      System.out.println();
    }

    System.out.println();
    System.out.println();
    System.out.println();
    for (String[] line :  multipleStringArray) {
      System.out.print("| ");
      for (String column : line) {
        System.out.print(column + " | ");
      }
      System.out.println();
      System.out.println();
    }

            /* Arrays.copyOf(myArray, numberOfElementAndIndexStartFromZero) */

    int[] myArray = {1, 4, 3, 12, 44, 12, 444, 121, 0};
    int[] copiedArray = Arrays.copyOf(myArray, 6); // copy the first 6 element inside thi array

    for (int element : copiedArray) {
      System.out.print(element + "\t");
    }

    /* Arrays.copyOfRange(myArray, numberStartFromZero) */
    System.out.println();
    String[] copyOfRangeArray = Arrays.copyOfRange(pLanguages, 0, 4);
    for (String element : copyOfRangeArray) {
      System.out.print(element + "\t");
    }

    System.out.println();

    Arrays.fill(myBeautyArray,  1231); // 1231 is my birthDayxD o\0

    for (int element : myBeautyArray) {
      System.out.print(element + "\t");
    }

            /* Array of Characters */
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    char[][] myDesk = new char[10][10];
    for (char[] line : myDesk) {
      System.out.print("| ");
      for (char column : line) {
        System.out.print('*' + " | ");
      }
      System.out.println();
      System.out.println();
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    int[] numbersToSort = new int[10];
    for (int i = 0; i < numbersToSort.length; i++) {
      numbersToSort[i] = (int) (Math.random() * 1000);
    }

    System.out.println("Before Sort:");

    for (int num : numbersToSort) {
      System.out.print(" | " + num + " ");
    }
    System.out.print("|");
    System.out.println();
    System.out.println();

    System.out.println("After call Arrays.sort(myArray):");
    Arrays.sort(numbersToSort);

    for (int num : numbersToSort) {
      System.out.print(" | " + num + " ");
    }
  }
}
