
import java.util.ArrayList;
public class Cinema implements Igestioncinema, Iutilisateurcinema{
    private int numsemaine;
    private ArrayList<Seance>clseance;

    public Cinema(int n){
        this.clseance=new ArrayList<Seance>();
        this.numsemaine=n;
    }

    public void ajouterseance(Seance s){
        this.clseance.add(s);
    }



    @Override
    public double calculTauxRemplissageJour(String titrefilm){
        double s=0,s1=0,res;

        for(int i=0;i<clseance.size();i++){
            if(clseance.get(i) instanceof SeanceJour){
            if(clseance.get(i).getTitrefilm().equals(titrefilm)){
                s+=clseance.get(i).nbrplacesvendu;
                s1+=clseance.get(i).getUnesalle().getNbrPlaces();
            }
            }
        }
        res=s/s1;
       return res;

    }
    @Override
    public double calculTotalChiffreAffaireSeance(Seance s){
        double res=0;
        for(int i=0;i<clseance.size();i++){
        if(clseance.get(i).estIdentique(s)){
            res+=clseance.get(i).calculCA();
        }
            }
        return res;
    }

      @Override
     public boolean achetePlace(String titrefilm,String dateheure,int nb) throws PasdeseanceException{
         boolean test=false;
         for(int i=0;i<clseance.size();i++){
             if(clseance.get(i).getTitrefilm().equals(titrefilm)&& clseance.get(i).getDateheure().equals(dateheure)){
                 if(clseance.get(i).nbrplacesvendu+nb<=clseance.get(i).getUnesalle().getNbrPlaces()){
                    clseance.get(i).nbrplacesvendu+=nb;
                    test=true;
                    return test;
                 }
                 else{
                     throw new PasdeseanceException();
                 }
             }
         }

       return  test;
     }
      @Override
   public void affichelesseance(){
       for(int i=0;i<clseance.size();i++){
           clseance.get(i).affiche();
       }

   }



}
