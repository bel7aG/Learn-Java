public class StaticMain {
  public static void main(String[] args) {
    LearnStatic bel7aG = new LearnStatic("Belhassen", "Gharsallah", 22);
    LearnStatic issam = new LearnStatic("issam", "Abdelhak", 21);
    LearnStatic nakchCs = new LearnStatic("nakchCs", "bacouch", 21);
    LearnStatic.setBody(421);

    System.out.println();
    System.out.println();

    System.out.println(bel7aG.getName());
    System.out.println("body: " + LearnStatic.getBody() + "\n" + (bel7aG.isFine = "no"));
    System.out.println();
    System.out.println();
    System.out.println();

    LearnStatic.setBody(22);
    System.out.println(issam.getName());
    System.out.println("body: " + LearnStatic.getBody() + "\n" + nakchCs.isFine);
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println(nakchCs.getName());
    System.out.println("body: " + LearnStatic.getBody() + "\n");





  }
}
