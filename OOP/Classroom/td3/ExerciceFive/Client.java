public class Client {
  private String adresse;
  private Identity identity;

  public Client(Identity identity, String adresse) {
    this.identity = identity;
    this.adresse = adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public Identity getIdentity() {
    return this.identity;
  }

  public void streamClient() {
    System.out.println(identity.presente() + "\n\n\t\tAdresse: " + this.adresse);
  }
}
