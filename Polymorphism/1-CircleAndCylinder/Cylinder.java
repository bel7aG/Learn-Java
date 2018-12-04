public class Cylinder extends Circle {
   // private instance variable
   private double height;
   // Constructor
   public Cylinder(double height, double radius) {
      super(radius);
      this.height = height;
   }
   // Getter
   public double getHeight() {
      return this.height;
   }
   // Return the volume of this cylinder
   public double getVolumne() {
      return super.getArea() * height;
   }
   // Override the inherited method to return the surface area
   @Override
   public double getArea() {
      return 2.0 * Math.PI * super.getRadius() * height;
   }
   // Override the inherited method to describe itself
   @Override
   public String toString() {
      return "Cylinder Height: " + height + ", " + super.toString();
   }
}
