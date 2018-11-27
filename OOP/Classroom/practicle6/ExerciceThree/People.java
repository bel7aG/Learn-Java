public class People {
  private Human countrys[] = new Human[100];
  //  = new Human[100]
  private int humanNumber;

  public void birthDay(Human h) {
    countrys[humanNumber++] = h;
  }

  public void explore() {
    for (int i = 0; i < humanNumber; i++) {
      countrys[i].identity();
    }
  }

}
