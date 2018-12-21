public class App {
    public static void main(String []args){
        SalleProjection sh=new SalleProjection("alhambra",100);
        SalleProjection sa=new SalleProjection("amilcar",80);

        Seance s1=new SeanceJour("rissala",sh,"5/8/2014_10h",5,20);
        Seance s2=new SeanceSoir("the equalizer",sh,"3/12/2014_20h",6,1.5);
        Seance s3=new SeanceJour("rissala",sa,"5/8/2014_12h",5,20);

        Cinema c1=new Cinema(5);
        c1.ajouterseance(s1);
       // c1.ajouterseance(s2);
        //c1.ajouterseance(s3);


       try{
         c1.achetePlace("rissala","5/8/2014_10h",50);
       }
          catch(PasdeseanceException e){
           System.out.println(e.getMessage());
       }
     try{
         c1.achetePlace("rissala","5/8/2014_10h" ,60);
         //c1.achètePlace("rissala","3/12/2014_20h",30);
         //c1.achètePlace("titanic","5/8/2014_18h",10);
       }
       catch(PasdeseanceException e){
           System.out.println();

       }


      System.out.println(c1.calculTauxRemplissageJour("rissala"));
      System.out.println(c1.calculTotalChiffreAffaireSeance(s1));

        c1.affichelesseance();


    }

}
