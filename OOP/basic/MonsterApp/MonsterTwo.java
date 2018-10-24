import java.util.Arrays;

public class MonsterTwo {

  static char[][] battleDesk = new char[10][10];

  public static void buildBattleDesk() {
    for (char[] rowElement : battleDesk) {
      Arrays.fill(rowElement, '*');
    }
  }

  //constant
  public final String ID = "bel7aG";

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

  //constructors in Java LoooL
  public MonsterTwo() {

  }

  public MonsterTwo(int newAttack, int newMovement, boolean isAlive) {
    this.attack = newAttack;
    this.movement = newMovement;
    this.alive = isAlive;
  }

  public MonsterTwo(int newHealth) {
    this.health = newHealth;
  }

  public MonsterTwo(int newHealth, int newX, int newY) {
    this.xPosition = newX;
    this.yPosition = newY;
  }

  // Just i use this for test ..
  public static void main(String[] args) {
    for (int i = 0; i < battleDesk.length; i++) {
      for (int j = 0; j < battleDesk.length; j++) {
        battleDesk[i][j] = '*';
        System.out.print(battleDesk[i][j] + "\t");
      }
      System.out.println("\n");

    }
  }
}
