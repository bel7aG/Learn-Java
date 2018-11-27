public class Principal  {
  public static void main(String[] args) {
    Dog normalDog = new Dog();
    Dog policeDog = new PoliceDog();
    Dog petDog = new PetDog();

    normalDog.dogName();
    policeDog.dogName();
    petDog.dogName();

    //policeDog.getBossName(); this is an error we cant do that we need downcasting
    System.out.println( ((PoliceDog)policeDog).getBossName() );

    Dog down = new downDog();

    down.dogName();

  }
}
