public class Client {
  private String adresse;
  private Identite identiteClt;

  public Client(Identite identiteClt, String adresse) {
    this.identiteClt = identiteClt;
    this.adresse = adresse;
  }


	public String getAdresse() {
		return adresse;
	}

	public Identite getIdentiteClt() {
		return identiteClt;
	}

  public void stream() {
    System.out.println(this.identiteClt.PersonneID() + "\n\n\t\tadresse: " + this.adresse + "\n");
  }

}
