abstract  class Seance implements Icomparateur{
    private String titefilm;
    private SalleProjection unesalle;
    private String dateHeure;
    protected double tarif;
    protected int nbrplacesvendu;

   public Seance(String t, SalleProjection s,String dh,double tr){
      this.dateHeure=dh;
      this.titefilm=t;
      this.unesalle=s;
      this.tarif=tr;
    }

   public String getTitrefilm(){
       return this.titefilm;
   }

   public SalleProjection getUnesalle(){
       return this.unesalle;
   }

   public String getDateheure(){
       return this.dateHeure;
   }

    @Override
   public boolean estIdentique(Object o){
       if(!(o instanceof Seance)){
           return false;
       }
       else{
           Seance s=(Seance)o;
           return (this.titefilm.equals(s.titefilm))&&(this.dateHeure.equals(s.dateHeure));
       }
   }

   abstract double calculCA();


    @Override
   public String toString(){
     return("le titre: "+this.titefilm+"\nla date et l'heure:"+this.dateHeure+"\nle tarif: "+this.tarif+"\nle nombre de place vendu: "+this.nbrplacesvendu+"\n "+this.unesalle.toString());
   }

   public void affiche(){
       System.out.println(this.toString());
   }
}
