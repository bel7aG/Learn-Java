public class SalleProjection {
    private String designation;
    private int nbrplaces;

    public SalleProjection(String d,int nb){
        this.designation=d;
        this.nbrplaces=nb;
    }

    public int getNbrPlaces(){
        return this.nbrplaces;
    }

    @Override
    public String toString(){
        return ("la designation : "+this.designation+"\nle nombre de places : "+this.nbrplaces);
    }

}
