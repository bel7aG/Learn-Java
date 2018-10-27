import java.util.Scanner;

public class mainMonster {
  public static void main(String[] args) {

    MonsterTwo.buildBattleDesk();
    char[][] battleDesk = new char[10][10];
    MonsterTwo[] Monsters = new MonsterTwo[4];

    Monsters[0] = new MonsterTwo("bel7aG", 1000, 20, 1);
    Monsters[1] = new MonsterTwo("issam", 1000, 23, 2);
    Monsters[2] = new MonsterTwo("nakch", 1000, 40, 1);
    Monsters[3] = new MonsterTwo("nakch", 1000, 40, 1);

    int monsterIndexCountArray = 0;

    for (MonsterTwo monster : Monsters) {
        if (monster.getAlive()) {
          monsterIndexCountArray++;
        }
    }

    int[] arrayOfAliveMonsterIndex = new int[monsterIndexCountArray];

    for (int i = 0, j = 0; i < monsterIndexCountArray; i++) {
      if (Monsters[i].getAlive()) {
        arrayOfAliveMonsterIndex[j] = i;
        j++;
      }
    }

    for (int i = 0; i < arrayOfAliveMonsterIndex.length; i++) {
      System.out.println(arrayOfAliveMonsterIndex[i]);
    }

    MonsterTwo.redrawDesk();

  }
}
