public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
    
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    return this.radius * Math.PI;
  }

  public String toString() {
    return "Circle radius: " + this.radius;
  }

}
