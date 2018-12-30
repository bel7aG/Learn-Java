public class App {
  public static void main(String[] args) {
    PageFB pOne = new PageFB("Belhassen Gharsallah", "a", "a");
    PageFB pTwo = new PageFB("Cyrine Baklouti", "b", "yyy");

    

    pOne.publierStatut("Bonjour yo");
    pTwo.publierStatut("Wassup yo");
    

    boolean a = pOne.authentifier("a", "a");
    System.out.println(a);

    pOne.afficherPage();
    

  }
}
