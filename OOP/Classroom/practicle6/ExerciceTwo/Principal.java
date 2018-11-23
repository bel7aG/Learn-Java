public class Principal {
  public static void main(String[] args) {
    int min = 1, max = 20, current = 2;
    AbsCounter ord = new OrdCounter(min, current);
    AbsCounter cycle = new CounterCycle(min, max, current);

    System.out.println("\n\n\t\tOrd Couter\t\t\t\tCycle Counter");
    for (int i = 0; i < (max + 4); i++) {
      cycle.increment();
      System.out.println("\t\t  " + ord.getCurrent());
      System.out.println("\t\t\t\t\t\t\t\t  " + cycle.getCurrent());
      System.out.println("\n|-------------------------------------|-------------------------------------|\n");
    }
  }
}
