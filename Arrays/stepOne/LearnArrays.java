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

    String[] stringArrays = new String[30];
    stringArrays[13] = "https://www.github.com/bel7aG";
    stringArrays[3] = "bel7aG";
    stringArrays[6] = "belhassen gharsallah";
    stringArrays[14] = "LOLA66665";
    System.out.println(stringArrays[4]); // in array of String default value is null

    int behind;
    String pivot;
    System.out.println("--------");
    for (int i = 0; i < stringArrays.length; i++) {
      if (stringArrays[0] == null) {
        int forward = 1;

        while ((stringArrays[forward] == null && (forward <= stringArrays.length))) {
          forward++;
          if (stringArrays[forward] != null) {
            stringArrays[0] = stringArrays[forward];
            stringArrays[forward] = null;
            break;
          }
        }
      }
      if (stringArrays[i] != null && i > 0) {
        behind = (i);
        pivot = stringArrays[i];
        stringArrays[i] = null;
        while (stringArrays[behind] == null && behind >= 0) {
          behind--;
          if(stringArrays[behind - 1] != null) {
            stringArrays[behind] = pivot;
          }
        }
      }
    }


        for (int i = 0; i < stringArrays.length; i++) {
            System.out.println(stringArrays[i]);
        }

  }
}
