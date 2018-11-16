public class Reviews extends Document {

  private int year;
  private int month;

  public Reviews(int year, int month, int numEnreg, String title) {
    super(numEnreg, title);
    this.year = year;
    this.month = month;
  }

  public String toString() {
    String str = super.getNum() + "\n" + super.getTitle() + "\n" + this.year + "\n" + this.month;
    return str;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getMonth() {
    return this.month;
  }

}
