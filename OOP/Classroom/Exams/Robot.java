public class Robot {
  private String name;
  private int x; //Eastern
  private int y; //North
  private String direction;

  // constructor
  public Robot(String name) {
    this.name = name;
    this.x = this.y = 0;          //default
    this.direction = "east";     //default
  }

  public void move() {
    this.y = this.direction.toLowerCase() == "north" ? this.y++ : this.y;
    this.y = this.direction.toLowerCase() == "sud" ? this.y-- : this.y;

    this.x = this.direction.toLowerCase() == "east" ? this.x++ : this.x;
    this.x = this.direction.toLowerCase() == "west" ? this.x-- : this.x;
  }

  public void right() {
    this.direction =
      this.direction.toLowerCase().equals("north") ? "east" :
      this.direction.toLowerCase().equals("east") ? "sud" :
      this.direction.toLowerCase().equals("sud") ? "west" :
      this.direction.toLowerCase().equals("west") ? "north" :
      "dont joke with me brother ...";
  }

  public void display() {
    System.out.println("name: " + this.name);
    System.out.println("x Position: " + this.x);
    System.out.println("y Position: " + this.y);
    System.out.println("direction: " + this.direction);
  }
}
