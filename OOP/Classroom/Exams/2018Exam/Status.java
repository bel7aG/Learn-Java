public class Status extends Contenu  {
  private String text;

  public Status(String auteur, String text) {
    super(auteur);
    this.text = text;
  }

  public void publier() {
    System.out.println("********************");
    System.out.println(this.text);
    System.out.println("Publier par " + this.auteur + " le " + this.datePub);
    System.out.println(super.commentaires.size() + ".com" + super.nbAime() + " Like");

    int n = commentaires.size();
    for (int i = 0; i < n; i++) {
      System.out.println(commentaires.get(i));
    }

    System.out.println("********************");
  }
}
