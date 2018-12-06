public class Principal {
  public static void main(String[] args) {
    AgenceBancaire twoOTw = new AgenceBancaire("2012");

    PersonneID hamma = new PersonneID("Mohamed", "Bahri");
    PersonneID mouna = new PersonneID("Mouna", "jouini");
    PersonneID belha = new PersonneID("Belhassen", "Gharsallah");
    EnterpriseID charika = new EnterpriseID("SOTUCO SARL", mouna);

    Client hammeClient = new Client(hamma, "Bizerte");
    twoOTw.addClient(hammeClient);
    Client mounaClient = new Client(charika, "Tunis");
    twoOTw.addClient(mounaClient);
    Client belhaClient = new Client(belha, "Tunis");
    twoOTw.addClient(belhaClient);

    twoOTw.stream();


  }
}
