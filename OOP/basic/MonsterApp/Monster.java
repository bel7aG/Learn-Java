import java.util.Scanner;
import java.util.List;

public class Monster {
  static Scanner userInput = new Scanner(System.in);
  //constant
  public final String id = "bel7aG";

  private String iq = "Excelent";
  private int health = 1000;
  private int attack = 1000; //MAXIMUM
  private int movement = 10; //KM/s
  private int xPosition = 0;
  private int yPosition = 0;
  private boolean alive = true;

  public String monsterName = "Belhassen Gharsallah";

  public int getAttack() {
    return this.attack;
  }

  public int getMove() {
    return this.movement;
  }

  public int getHealth() {
    return this.health;
  }

  public void attackTheMonster(int decreaseHealth) {
    this.health -= decreaseHealth;
    if (this.health <= 0) {
      alive = false;
    }
  }

                //==> Overload

  public void attackTheMonster(double decreaseHealth) {
    int intDecreaseHealth = (int) decreaseHealth;
    this.health -= intDecreaseHealth;
    if (this.health <= 0) {
      alive = false;
    }
  }

  //constructor
  public Monster() {

  }

  public Monster(int newAttack, int newMovement, boolean isAlive) {
    this.attack = newAttack;
    this.movement = newMovement;
    this.alive = isAlive;
  }

  public Monster(int newHealth) {
    this.health = newHealth;
  }

  public Monster(int newHealth, int newX, int newY) {
    this(newHealth);
    this.xPosition = newX;
    this.yPosition = newY;
  }

}
