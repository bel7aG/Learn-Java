import java.util.Scanner;

public class mainMonster {
  public static void main(String[] args) {

    MonsterTwo.buildBattleDesk();
    char[][] battleDesk = new char[10][10];
    MonsterTwo[] Monsters = new MonsterTwo[3];

    Monsters[0] = new MonsterTwo("bel7aG", 1000, 20, 1);
    Monsters[1] = new MonsterTwo("issam", 1000, 23, 2);
    Monsters[2] = new MonsterTwo("nakch", 1000, 40, 1);


    MonsterTwo.redrawDesk();










  }
}
