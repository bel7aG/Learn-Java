import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Belhassen");
    names.add("Gharsallah");
    names.add("lola");
    names.add("tchu");
    names.add("Gharsallah");
    names.add(1, "okokokokoklooool"); // insert element in the index (1) and push the other (without remove)

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    Boolean x = names.indexOf("Gharsallah") == names.lastIndexOf("Gharsallah");
    System.out.println("x" + x);


    boolean is = names.contains("Belhassen"); // return true if the element exist into the array.





  }
}
