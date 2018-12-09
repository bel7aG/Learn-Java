public class Principal {
  public static void main(String[] args) {

    A a1 = new C();
    B b1 = (B) a1;
    C c1 = (C) b1;

    A a2 = new B();
    B b2 = (B) a2;

    C c2 = (C) a2;
    if (c2 instanceof C) {
      System.out.println(c2);
    }


  }
}
