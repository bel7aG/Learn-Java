import java.util.ArrayList;

public class AgenceBancaire {
  private String agenceName;
  private int nbEffClient;
  private ArrayList <Client> clientArray = new ArrayList<Client>();


  public AgenceBancaire(String agenceName) {
    this.agenceName = agenceName;
  }

  public void addClient(Client newClient) {
      this.clientArray.add(0, newClient);

  }

  public Client getClient(Identite clientIdentity) {
    for (int i = 0; i < clientArray.size(); i++) {
      if (clientArray.get(i).getIdentiteClt().comparer(clientIdentity)) {
        return clientArray.get(i);
      }
    }
    return null;
  }

  public void stream() {
    for (int i = 0; i < clientArray.size(); i++) {
      System.out.println(this.clientArray.indexOf(clientArray.get(i)));
      clientArray.get(i).stream();
      System.out.println("------^------------^--------^----------------^-----------");
    }
  }
}
