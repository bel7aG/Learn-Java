public class LearnArrays {

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

  }
}
