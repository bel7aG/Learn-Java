public class PageFB {
  static Scanner userInput = new Scanner(System.in);

  private final String proprietaire, login;
  private String password;
  private int nbAncienPub;
  private ArrayList <Contenu> publication = new ArrayList <Contenu>();

  public PageFB(String login, String password, String proprietaire) {
    this.login = login;
    this.password = password;
    this.proprietaire = proprietaire;
  }

  public boolean authentifier(String login, String password) {
    return this.login.equals(login) && this.password.equals(password);
  }

  public int getNbNouvellePub() {
    return publication.size() - nbAncienPub;
  }

  public void afficherPage() throws loginPasswordIncorrect {
    Scanner s = new Scanner(System.in);
    System.out.println("donner votre login: ");
    String login = s.nextLine();
    System.out.println("Donner votre Password: ");
    String pwd = s.nextLine();
    if (this.authentifier(login, pwd)) {
      System.out.println("****************\n\n\n");
      System.out.println("Page de " + this.proprietaire + "\n");
      System.out.println("Le Nombre de nouvelles Publication: " + this.getNbNouvellePub());
      System.out.println("****************\n\n\n");
      for (int i = this.publication.size(); i >= 0; i--) {
        this.publication.get(i).publier();
      }
      this.nbAncienPub = this.publication.size();
    } else {
      throw new loginPasswordIncorrect("login or Password Incorrect");
    }
  }

  public void publierStatus(String s) {
    status st = new Status(this.proprietaire, s);
    publication.add(st);
  }

  public Contenu getPublication(int i) {
    return this.publication.get(i);
  }
}
