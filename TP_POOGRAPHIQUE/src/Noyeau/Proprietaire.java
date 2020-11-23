package Noyeau;

import java.util.*;
public class Proprietaire {
    private  String  nom,prenom,adresse_mail ,adresse, tel;
    /***************les methode********************************/

    public Proprietaire() {

    }
    public Proprietaire(String  n,String  p,String  ad ,String  addr, String  t) {
        this.nom=n;
        this.prenom=p;
        this. adresse_mail=ad;
        this.adresse=addr;
        this. tel=t;

    }
    public void afficher() {
        System.out.println("le nom:   " + nom);
        System.out.println("le prenom:   " +prenom);
        System.out.println("l'adresse_mail:   " +adresse_mail);
        System.out.println("l'adresse:   " +adresse);
        System.out.println("le numero de tel :   " + tel);


    }
    public String  getnom() {
        return nom ;
    }
    public String  getprenom() {
        return prenom ;
    }
    public String  getadresse_mail() {
        return adresse_mail ;
    }
    public String  getadresse() {
        return adresse ;
    }
    public String  gettel() {
        return tel ;
    }
    public void setnom(String  nom) {
        this.nom=nom ;
    }
    public void setprenom(String  prenom) {
        this.prenom=prenom ;
    }
    public void setadresse_mai(String adresse_mai ) {
        this.adresse_mail=adresse_mai;
    }
    public void setadresse(String adresse ) {
        this.adresse=adresse;
    }
    public void settel(String tel ) {
        this.tel=tel;
    }
    @Override

    public boolean equals(Object o)
    {
        if(((Proprietaire)o).adresse.equals(this.adresse))
        {
            if(((Proprietaire)o).adresse_mail.equals(this.adresse_mail))
            {
                if(((Proprietaire)o).nom.equals(this.nom))
                {
                    if(((Proprietaire)o).prenom.equals(this.prenom))
                    {
                        if(((Proprietaire)o).tel.equals(this.tel))
                        {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }


}
