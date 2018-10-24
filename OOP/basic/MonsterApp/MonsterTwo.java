import java.util.Arrays;

public class MonsterTwo {

  static char[][] battleDesk = new char[10][10];

  //constant
  public final String ID = "bel7aG";

  //fields
  private String iq = "Excelent";
  private int health = 1000;
  private int attack = 1000; //MAXIMUM
  private int movement = 10; //KM/s
  private boolean alive = true;

  public String monsterName;
  public char monsterNameCharOne;
  public int xPosition = 0;
  public int yPosition = 0;
  public static int numberOfMonsters = 0;

  public static void buildBattleDesk() {
    for (char[] rowElement : battleDesk) {
      Arrays.fill(rowElement, '*');
    }
  }

  public static void redrawDesk() {
    for (int line = 0; line < battleDesk.length; line++) {
      for (int column = 0; column < battleDesk.length; column++) {
        if (column != (battleDesk.length - 1)) {
          System.out.print("|_" + battleDesk[line][column] + "_|\t");
        } else {
          System.out.print("|_" + battleDesk[line][column] + "_|");
        }
      }
      System.out.println();
    }
  }

  public int getAttack() {
    return this.attack;
  }

  public int getMove() {
    return this.movement;
  }

  public int getHealth() {
    return this.health;
  }

  public boolean getAlive() {
    return alive;
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
  public MonsterTwo(String monsterName, int health, int attack, int movement) {
    this.monsterName = monsterName;
    this.health = health;
    this.attack = attack;
    this.movement = movement;

    int maxXDeskSpace = (battleDesk.length - 1);
    int maxYDeskSpace = (battleDesk[0].length - 1);
    int randomX, randomY;
    do {
      randomX = ((int) Math.random() * maxXDeskSpace);
      randomY = ((int) Math.random() * maxYDeskSpace);
    } while (battleDesk[randomX][randomY] != '*');

    this.xPosition = randomX;
    this.yPosition = randomY;

    this.monsterNameCharOne = this.monsterName.charAt(0);

    

  }

  // Just i use this for test ..

}
