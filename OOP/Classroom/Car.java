public class Car {
  public int registrationNumber;
  public String mark;
  public String color;
  private Person Proprietaire = new Person();

  Wheel[] Wheels = new Wheel[4];

  public void changeWheel(Wheel newWheel, int changedWheelNumber) {
    Wheels[changedWheelNumber] = newWheel;
  }

  public String getRegistrationNumber() {
    return this.mark;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String newColor) {
    this.color = newColor;
  }


  public Car(int registrationNumber, String mark, String color) {
    this.registrationNumber = registrationNumber;
    this.mark = mark;
    this.color = color;
  }

}
