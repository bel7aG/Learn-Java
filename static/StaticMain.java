public class StaticMain {
  public static void main(String[] args) {
    LearnStatic bel7aG = new LearnStatic("Belhassen", "Gharsallah", 22);
    LearnStatic issam = new LearnStatic("issam", "Abdelhak", 21);
    LearnStatic nakchCs = new LearnStatic("nakchCs", "bacouch", 21);
    LearnStatic.setBody(421);

    System.out.println(bel7aG.getName());
    System.out.println("body: " + bel7aG.getBody() + "\n");

    nakchCs.setBody(22);
    System.out.println(issam.getName());
    System.out.println("body: " + issam.getBody() + "\n");

    System.out.println(nakchCs.getName());
    System.out.println("body: " + nakchCs.getBody() + "\n");

  }
}
