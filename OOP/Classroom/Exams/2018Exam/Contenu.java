import java.util.ArrayList;

abstract class Contenu implements Publiable {

  protected String auteur;
  protected Date datePub;
  protected int nbAime;
  protected ArrayList <String> commentaires = new ArrayList <String> ();


  public Contenu(String auteur) {
    this.auteur = auteur;
    Date pub = new Date();
  }

  public void commenter(String c) {
    commentaires.add(c);
  }

  public void aimer() {
    nbAime += 1;
  }
}
