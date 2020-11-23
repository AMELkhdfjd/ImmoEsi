package Noyeau;

import java.util.Scanner;

public class Appartement extends Habitable {

    //*************** les attributs *************//
    //private Habitable h;
    private int etage;
    private boolean  simplexe;
    private boolean assenceur;

    //*************** les méthodes *************//

    public Appartement(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Piece f,boolean l,double su,int g,boolean v,boolean q) //  le contructeur.
    {
        super(p,w,s,pr,t,j,m,a,he,me,f,l,su);

        etage = g;
        simplexe = v;
        assenceur = q;
    }
    public Appartement(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Wilaya w2,Piece f,boolean l,double su,int g,boolean v,boolean q) //  le contructeur.
    {
        super(p,w,s,pr,t,j,m,a,he,me,w2,f,l,su);

        etage = g;
        simplexe = v;
        assenceur = q;
    }

    public void afficher()
    {
        System.out.println("le bien est : "+this.getClass().getName());
        super.afficher();
        System.out.println("le numéro d'étage est "+etage);
        if(simplexe )     System.out.println("l'appartementd est un  simplexe");
        else           System.out.println("l'appartementd est un duplexe ");
        if(assenceur )
        {
            System.out.println("l'appartement a un assenceur");
        }

        else
        {
            System.out.println("l'appartement n'a pas un assenceur");
        }
    }

    public int getetage()
    {
        return etage;
    }
    public void setetage(int e)
    {
        etage = e;
    }

    public boolean siassenceur()
    {
        return assenceur;
    }
    public void setassenceur(boolean r)
    {
        assenceur = r;
    }
    public boolean sisimplexe()
    {
        return simplexe;
    }
    public Bien modifier_bien()
    {
        System.out.println("vous voulez modifier les informations spécifique à votre maison ? (1 pour oui 0 pour non) ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y == 0)
        {
            super.modifier_bien();
        }
        else
        {
            System.out.println("quel attribut vous voulez modifier pour votre maison ? ");
            System.out.println("1)_Le nombre d'étage");
            System.out.println("2)_S'il est simplexe ou duplexe ");
            System.out.println("3)_l'existance d'un assenceur ");
            System.out.println("Veuillez saisir votre choix  :");
            int x = sc.nextInt();
            switch(x)
            {
                case 1:
                {
                    System.out.println("Donner le nouveau nombre d'étage");
                    etage = sc.nextInt();
                    break;
                }
                case 2:
                {
                    if(simplexe)
                    {
                        simplexe = false;
                    }
                    else
                    {
                        simplexe= true;
                    }
                    break;

                }
                case 3:
                {

                    if(	assenceur)

                    {
                        assenceur = false;
                    }
                    else
                    {
                        assenceur = true;
                    }
                    break;
                }

            }
        }
        return this;

    }



}
