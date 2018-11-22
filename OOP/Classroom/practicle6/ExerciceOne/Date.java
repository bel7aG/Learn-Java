public class Date {
  private int day, month, year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    thi.year = year;
  }

  public int getDay() {
    return this.day;
  }

  public int getMonth() {
    return this.month;
  }

  public int getYear() {
    return this.year;
  }

  public void stream() {
    System.out.println("\n\tDate: " + this.day + "/" + this.month + "/" + this.year);
  }

}
