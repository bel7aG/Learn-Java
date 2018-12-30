import java.util.Date;
import java.util.ArrayList;

public abstract class Contenu implements Publiable {
  protected String auteur;
  protected Date datePub;
  protected int nbAime;

  protected ArrayList<String> commentaires = new ArrayList<String>();

  public Contenu(String auteur) {
    this.auteur = auteur;
    this.datePub = new Date();
  }

  public void commenter(String c) {
    this.commentaires.add(c);
  }

  public void aimer() {
    this.nbAime += 1;
  }
}
