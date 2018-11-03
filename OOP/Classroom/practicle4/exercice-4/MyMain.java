public class myMain {
  public static void main(String[] args) {
    System.out.println("\n\n\n\n\n");

    EmployeHours me = new EmployeHours(1, "Belhassen", "Gharsallah", 400, 22);
    me.setImpot(20);
    System.out.println(me.toString() + "\nimpot: " + me.getImpot());

    System.out.println("\n\n\n");

    EmployeSalary user = new EmployeSalary(12, "user", "test", "GraDe");
    user.setImpot(14);
    System.out.println(me.toString() + "\nimpot: " + me.getImpot());
    System.out.println("\n\n\n\n\n");
  }
}
