import java.util.Scanner;
import java.util.List;

public class stepOneOOP {
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

  public String monster = "Belhassen Gharsallah";

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
    this.health -= intDecreaeHealth;
    if (this.health <= 0) {
      alive = false;
    }
  }

}
