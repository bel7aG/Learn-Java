public class RobotNewGeneration extends Robot {
  public RobotNewGeneration(String name) {
    super(name);
  }

  public step(int steps) {
    this.y = this.direction.toLowerCase() == "north" ? (this.y += steps)  : this.y;
    this.y = this.direction.toLowerCase() == "sud" ? (this.y -= steps) : this.y;

    this.x = this.direction.toLowerCase() == "east" ? (this.x += steps) : this.x;
    this.x = this.direction.toLowerCase() == "west" ? this.x-- : this.x;

  }
}
