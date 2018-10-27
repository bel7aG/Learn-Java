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

    String[] stringArrays = new String[10];
    stringArrays[2] = "https://www.github.com/bel7aG";
    System.out.println(stringArrays[4]); // in array of String default value is null

    for (int i = 0; i < stringArrays.length; i++) {
      if (stringArrays[i] == null) {
        System.out.println("null");
      } else {
        System.out.println("in case " + (i + 1) + ": " + stringArrays[i]);
      }
    }

  }
}
