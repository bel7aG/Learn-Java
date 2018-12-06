public class Principal {
  public static void main(String[] args) {
    ConditionAge cAge = new ConditionAge(15);
    Game gameOne = new Game("rainbow", 8, cAge);

    ConditionTaille cTaille = new ConditionTaille(1.2);
    Game gameTwo = new Game("Battle of royal", 4, cTaille);

    Personne me = new Personne("Belhassen", 22, 1.62);
    Personne me2 = new Personne("bel7aG", 12, 1.62);
    Personne me3 = new Personne("javascript", 52, 1.62);

    gameOne.utilise(me);
    gameOne.utilise(me2);
    gameOne.utilise(me3);
    gameOne.stream();
  }
}
