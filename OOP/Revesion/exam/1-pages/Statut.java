public class Statut extends Contenu {
  private String texte;

  public Statut(String auteur, String texte) {
    super(auteur);
    this.texte = texte;
  }

  public void publier() {
    System.out.println("****************************");
    System.out.println(this.texte);
    System.out.println(this.auteur + " le " + this.datePub);
    System.out.println(this.commentaires.size() + " commentaires " + this.nbAime + " Jaime");

    for (int i = 0; i < this.commentaires.size(); i++) {
      System.out.println("\t" + this.commentaires.get(i));
    }
    System.out.println("****************************");
  }
}
