public class Principal {
  public static void main(String[] args) {
    Date belhassenBirthDay = new Date(5, 8, 1980);
    Date ahmedBirthDay = new Date(5, 8, 1978);

    Employee Belhassen = new SalaryEmployee(Tgrade.cadre, 432, "Belhassen", "Gharsallah", belhassenBirthDay, 200);
    System.out.println(Belhassen.toString());

    Employee ahmed = new HoursSalaryEmployee(192, 400, "Ahmed", "Saidane", ahmedBirthDay, 100);
    System.out.println(ahmed.toString());
  }
}
