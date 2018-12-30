import java.util.*;

public class PageFB {
  private final String proprietaire;

  private final String login;
  private String motPasse;

  private int nbAnciensPub;

  private ArrayList<Contenu> publication = new ArrayList<Contenu>();

  public PageFB(String proprietaire, String login, String motPasse) {
    this.proprietaire = proprietaire;
    this.login = login;
    this.motPasse = motPasse;
  }

  public boolean authentifier(String login, String pw) {
    return this.login == login && this.motPasse == pw;
  }

  public int getNbNouvellesPub() {
    return this.publication.size() - this.nbAnciensPub;
  }

  public void afficherPage() throws loginPasswordIncorrect {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Login: ");
    String login = userInput.next();
    System.out.println("password: ");
    String motPasse = userInput.next();

    if (this.authentifier(login, motPasse)) {
      System.out.println("********************");
      System.out.println("Page de " + this.proprietaire);
      System.out.println("le nombre de nouvelles publication: " + this.getNbNouvellesPub());
      System.out.println("********************");

      for (int i = this.publication.size(); i >= 0; i--){
        this.publication.get(i).publier();
      }
      this.nbAnciensPub += 1;
    } else {
      throw new loginPasswordIncorrect("Login or password incorrect");
    }
  }

  public void publierStatut(String s) {
    Statut myNew = new Statut(this.proprietaire, s);
    this.publication.add(myNew);
  }

  public Contenu getContenu(int i) {
    return this.publication.get(i);
  }

}
