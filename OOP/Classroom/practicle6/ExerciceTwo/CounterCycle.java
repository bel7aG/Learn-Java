public class CounterCycle extends AbsCounter {

  private int max;

  public CounterCycle(int min, int max, int current) {
    super(min, current);
    this.max = max;
  }

  @Override
  public void increment() {
    if (this.getCurrent() >= this.max) {
      this.setCurrent(this.getMin());
    } else {
      int inc = this.getCurrent() + 1;
      this.setCurrent(inc);
    }
  }

}
