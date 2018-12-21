public class SeanceSoir extends Seance {
    private double montantSupp;
     public SeanceSoir(String t,SalleProjection s,String dh,double tr,double ms){
        super(t,s,dh,tr);
        this.montantSupp = ms;
    }

    @Override
     double calculCA(){
         return (this.nbrplacesvendu*this.tarif) + this.montantSupp;
     }

      @Override
    public String toString(){
       return (super.toString()+"\nle montant sup: "+this.montantSupp+"\nle montant de la vente : "+this.calculCA()+"\n");

    }

    @Override
     public void affiche(){

        System.out.println(this.toString());
     }
}
