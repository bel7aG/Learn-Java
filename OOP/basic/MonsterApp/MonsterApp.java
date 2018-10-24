import java.util.Arrays;

public class MonsterApp {
  public static void main(String[] args) {
    Monster bel7aG = new Monster();
    System.out.println(bel7aG.monsterName + " is so smart in JavaScript not this shit ..");
    System.out.println(bel7aG.monsterName + "\n\t Health: " + bel7aG.getHealth());

    bel7aG.attackTheMonster(999);

    System.out.println("After Attack is still alive but with low HP = " + bel7aG.getHealth());

    System.out.println("\n------------\n");

    MonsterTwo test = new MonsterTwo();

    System.out.println(test.buildBattleDesk);
  }
}
