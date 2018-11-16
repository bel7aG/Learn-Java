public class AddElement {
  private int[] a = new int[10];
  private int nombreDeElement;

  public void setArray(int[] a) {
    this.a = a;
  }

  public int[] getArray() {
    return this.a;
  }

  public void addOneElement(int x) {
    if (nombreDeElement < 10) {
      this.a[nombreDeElement++] = x;
    }
  }
}
