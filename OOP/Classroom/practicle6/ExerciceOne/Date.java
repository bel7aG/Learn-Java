public class Date {
  private int day, month, year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
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

  public String toString() {
    return "\n\n\tDate: " + this.day + "/" + this.month + "/" + this.year;
  }

}
