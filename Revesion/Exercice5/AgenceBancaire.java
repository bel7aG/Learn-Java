public class AgenceBancaire {
  private String agenceName;
  private int nbEffClient;
  private final int max;
  private Client[] clientArray;


  public AgenceBancaire(String agenceName, int max) {
    this.agenceName = agenceName;
    this.max = max;
    this.clientArray = new Client[max];
  }

  public void addClient(Client newClient) {
      this.clientArray[nbEffClient++] = newClient;
  }

  public Client getClient(Identite clientIdentity) {
    for (int i = 0; i < nbEffClient; i++) {
      if (clientArray[i].getIdentiteClt().comparer(clientIdentity)) {
        return clientArray[i];
      }
    }
    return null;
  }

  public void stream() {
    for (int i = 0; i < nbEffClient; i++) {
      clientArray[i].stream();
      System.out.println("------^------------^--------^----------------^-----------");
    }
  }
}
