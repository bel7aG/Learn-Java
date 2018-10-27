public class LearnStatic {
  private String name = "belhasse";
  private String surname;
  private int age;
  private static int body = 1;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return this.surname;
  }


  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void setBody(int newBody) {
    body = newBody;
  }

  public static int getBody() {
    return body;
  }

  public LearnStatic(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }


}
