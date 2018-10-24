public class helloWorld {
  static String name = "Belhassen Gharsallah";
  static final double PINUM = 3.14;
  public static void main(String[] args) {
    int integerOne = 10, integerTwo = 1;
    boolean result;
    System.out.println("Hello");
    System.out.println("PINUM");
    System.out.println(integerOne);
    if (integerOne > integerTwo) {
      result = true;
    } else {
      result = false;
    }
    System.out.println(result);
    char randomChar = 65 + 1; //ASCII
    System.out.println(randomChar);

    String randomString = "is a JavaScript Developer";
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    String sentence = "\n\n" + name + " " + randomString + ".\n";
    System.out.println(sentence);

    String integerOneString = Integer.toString(integerOne);
    System.out.println(integerOneString);

    //convert a variable
    System.out.println("\n------------\n");
    double aDoubleVariable = 241.223212121121311;
    System.out.println(aDoubleVariable);

    int doubleCInt = (int) aDoubleVariable;
    System.out.println(doubleCInt);

    int x = 22;
    String xToString = Integer.toString(x); //Integer --> String
    System.out.println(xToString);

    int xToStringToInt = Integer.parseInt(xToString);
    System.out.println("\n" + xToStringToInt);
  }
}
