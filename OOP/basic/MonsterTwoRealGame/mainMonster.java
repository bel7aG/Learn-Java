public class mainMonster {

  public static void main(String[] args) {
    MonsterTwo.buildBattleDesk();
    char[][] battleDesk = new char[10][10];

    MonsterTwo[] Monsters = new MonsterTwo[3];

    Monsters[0] = new MonsterTwo("bel7aG", 1000, 120, 1);

    MonsterTwo.redrawDesk();


  }
}
