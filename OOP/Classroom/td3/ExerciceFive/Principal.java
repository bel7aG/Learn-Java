public class Principal {
  public static void main(String[] args) {
    Banc bancOne = new Banc("2012", 60);
    PersonneId personOne = new PersonneId("bahri", "Mohammed");

    Client clientOne = new Client(personOne, "Bizerte");

    PersonneId personTwo = new PersonneId("Jouini", "Mouna");
    Enterprise entre = new Enterprise("SOTUCO SARL", personTwo);
    Client clientTwo = new Client(entre, "Tunis");

    bancOne.addClient(clientOne);
    bancOne.addClient(clientTwo);

    bancOne.stream();


  }
}
