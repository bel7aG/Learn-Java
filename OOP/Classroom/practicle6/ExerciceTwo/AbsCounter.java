public abstract class AbsCounter {
  private int min, current;

  public AbsCounter(int min, int current) {
    this.min = min;
    this.current = current;
  }

  public void RAZ() {
    this.current = 0;
  }

  public int getMin() {
    return this.min;
  }


  public void setMin(int min) {
    this.min = min;
  }

  public void setCurrent(int current) {
    this.current = current;
  }


  public int getCurrent() {
    return this.current;
  }

  public abstract void increment();

}
