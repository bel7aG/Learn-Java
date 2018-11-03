public class Wheel {
  private String model;
  private int num;
  private int rayon;
  private int width;

  public String getModel() {
    return this.model;
  }

  public int getRayon() {
    return this.rayon;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public Wheel(String model, int num, int rayon, int width) {
    this.model = model;
    this.num = num;
    this.rayon = rayon;
    this.width = width;
  }
}
