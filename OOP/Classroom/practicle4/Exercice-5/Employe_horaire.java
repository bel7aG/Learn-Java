/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercie3;

/**
 *
 * @author ZAHRA
 */
public class Employe_horaire extends Employe {
    private int Nb_Heure_travail ;
    private int Nb_Heure_Sup;
     public Employe_horaire (int mat , String nom , String pr ,int nbh , int nbs)
        {
            super(mat,nom,pr);
            this.Nb_Heure_travail=nbh;
            this.Nb_Heure_Sup=nbs; 
        }
     public float Changer_Nb_H_Travail(int nv_NH)
     {
         return(Nb_Heure_travail=nv_NH);
     }
     
     public float Changer_Nb_H_Sup(int nv_NH)     
     {   
        return(Nb_Heure_Sup=nv_NH);
     }
     public float Calcul_salaire()
     {
         float sbrut=0;
         float snet=0;
         snet=sbrut-(super.Getimpot());
         sbrut=(float) ((Nb_Heure_travail * 0.650 + Nb_Heure_Sup*1.1));
         snet=sbrut-(super.Getimpot());   
         return (snet);
      }
}
     

