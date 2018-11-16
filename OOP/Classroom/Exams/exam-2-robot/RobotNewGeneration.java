public class RobotNewGeneration extends Robot {
  public RobotNewGeneration(String name, int x, int y, String direction) {
    super(name, x, y, direction);
  }

  public void step(int steps) {
    for (int step = 0; step < steps; step++) {
      this.step();
    }
  }

  public void left() {
    this.right();
    this.right();
    this.right();
  }

  public void halfTurn() {
    this.right();
    this.right();
  }
}
