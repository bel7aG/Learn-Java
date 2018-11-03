/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercie3;


public class Employe_salaire extends Employe{
    private String grade ;
   public Employe_salaire (int mat , String nom , String pr ,String gr)
    {
        super(mat,nom,pr);
        this.grade=gr;
    }
   public String Changer_Grade(String nv_g)
   {
       return (grade=nv_g);
    }
   public float Calcul_salaire()
   {
    float salaire_net;
    if(grade.equals("Cadre"))
    {
      salaire_net=(430-(super.Getimpot()));
    }  
    else 
        salaire_net=(200-(super.Getimpot()));
    return (salaire_net);
   }
   
}