package Noyeau;

import java.util.Scanner;

public class Terrain extends Bien {

    //************** les attributs ****************//

    private String statut_juridique;
    private int nb_facade;

    //************* les méthodes *****************//

    public Terrain(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,int y)
    {
        super(p,w,s,pr,t,j,m,a,he,me);
        nb_facade = y;
    }

    public Terrain(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Wilaya w2,int y)
    {
        super(p,w,s,pr,t,j,m,a,he,me,w2);
        nb_facade = y;
    }
    public void afficher()
    {
        System.out.println("le bien est : "+this.getClass().getName());
        super.afficher();
        System.out.println("le statut juridique est "+statut_juridique);
        System.out.println("le nombre de façade est "+nb_facade);
    }

    public void setnbfacade(int b)
    {
        nb_facade = b;
    }

    public int getnbfacade()
    {
        return nb_facade;
    }

    public String getstatutjuridique()
    {
        return statut_juridique;
    }


    ///**** la méthode qui modifie les information du terrain


    public Bien modifier_bien()
    {
        System.out.println("vous voulez modifier les informations spécifique à votre terrain? (1 pour oui 0 pour non) ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y == 0)
        {
            super.modifier_bien();
        }
        else
        {
            System.out.println("quel attribut vous voulez modifier pour votre terrain ? ");
            System.out.println("1)_Le nombre de façade");
            System.out.println("2)_Le statut juridique ");

            int x = sc.nextInt();
            switch(x)
            {
                case 1:
                {
                    System.out.println("Donner le nouveau nombre de façade");
                    nb_facade = sc.nextInt();
                    break;
                }
                case 2:
                {
                    System.out.println("Donner le nouveau statur juridique");
                    statut_juridique = sc.next();
                    break;

                }


            }
        }
        return this;

    }




}
