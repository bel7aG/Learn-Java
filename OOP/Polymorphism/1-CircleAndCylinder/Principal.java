public class Principal {
  public static void main(String[] args) {
    //You can invoke all the methods defined in the Circle class for the reference c1,
    // (which is actually holding a Cylinder object)
    //This is because a subclass instance possesses all the properties of its superclass.
    // Circle c = new Cylinder(12.3, 33.1); // UPCASTING
    // System.out.println(c); //c.toString()

    /* System.out.println(c.getVolume());
CANNOT invoke method in Cylinder as it is a Circle reference!
This is because c1 is a reference to the Circle class,
which does not know about methods defined in the subclass Cylinder.
    */

    /*
c1 is a reference to the Circle class, but holds an object of
its subclass Cylinder. The reference c1, however, retains its internal identity.
In our example, the subclass Cylinder overrides methods getArea() and toString().
c1.getArea() or c1.toString() invokes the overridden version defined in the subclass Cylinder,
instead of the version defined in Circle.
This is because c1 is in fact holding a Cylinder object internally.
    */

    /*
                                            Summary
A subclass instance can be assigned (substituted) to a superclass' reference.
Once substituted, we can invoke methods defined in the superclass; we cannot invoke methods defined in the subclass.
However, if the subclass overrides inherited methods from the superclass, the subclass (overridden) versions will be invoked.
    */


    // Circle c2 = new Cylinder(10.2, 2.3);
    // // Cylinder cy2 = (Cylinder) c2;
    // Cylinder cy2 = (Cylinder)c2;
    //
    // System.out.println(cy2.getVolume());









    Circle circle1 = new Circle();

    Cylinder cy = new Cylinder();


    System.out.println(circle1 instanceof Circle); // true
    System.out.println(circle1 instanceof Cylinder); // false
    System.out.println(cy instanceof Cylinder); //true
    System.out.println(cy instanceof Circle);  //true

    Circle circle2 = new Cylinder();
    System.out.println(circle2 instanceof Circle); // true
    System.out.println(circle2 instanceof Cylinder); // true

















  }
}
