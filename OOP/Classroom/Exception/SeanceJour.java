public class SeanceJour extends Seance{
    private int pourcentagereduction;
    public SeanceJour(String t, SalleProjection s, String dh, double tr, int pr){
        super(t,s,dh,tr);
        this.pourcentagereduction=pr;
    }

    @Override
     double calculCA(){
        return (this.nbrplacesvendu*((this.tarif-this.tarif+this.pourcentagereduction)/100));
    }

    @Override
    public String toString(){
       return (super.toString()+"\nle pourcentage de reduction : "+this.pourcentagereduction+"\nle montant de la vente : "+this.calculCA()+"\n");

    }

    @Override
     public void affiche(){

        System.out.println(this.toString());
     }
}
