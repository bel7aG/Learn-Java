public class Banc {
  private String agenceName;
  private int clientNumber;
  private final int max;
  private Client[] clients;

  public Banc(String agenceName, int max) {
    this.agenceName = agenceName;
    this.max = max;
    this.clients = new Client[max];
  }

  public void addClient(Client client) {
    if (clientNumber < max && getClient(client.getIdentity()) == null) {
      this.clients[clientNumber++] = client;
    } else {
      System.out.println("\nfull size array ..\n");
    }
  }

  public Identity getClient(Identity id) {
    for (int i = 0; i < clientNumber; i++) {
      if (clients[i].getIdentity() == id) {
        return clients[i].getIdentity();
      }
    }
    return null;
  }

  public void stream() {
    for (int i = 0; i < clientNumber; i++) {
      clients[i].streamClient();
    }
  }
}
