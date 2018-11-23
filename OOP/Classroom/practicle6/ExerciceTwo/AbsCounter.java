public abstract class AbsCounter {
  private int min, current;

  public AbsCounter(int min, int current) {
    this.min = min;
    this.current = current;
  }

  public void RAZ() {
    this.current = 0;
  }

  public abstract void increment();

}
