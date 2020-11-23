package Noyeau;


public class Habitable extends Bien {

    //******************* les attributs *******************//
    private Piece pc;
    private boolean meuble;
    private double superficie2;

    //****************** les méthodes ********************//

    public Habitable(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Piece f,boolean l,double su)
    {
        super(p,w,s,pr,t,j,m,a,he,me);
        pc=f;
        meuble = l;
        superficie2 = su;

    }


    public Habitable(float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Wilaya w2,Piece f,boolean l,double su)
    {
        super(p,w,s,pr,t,j,m,a,he,me,w2);

        pc=f;
        meuble = l;
        superficie2 = su;

    }

    public void afficher()
    {
        super.afficher();

        System.out.println("le nombre de piéce est : "+pc);
        System.out.println("la superficie de la surface habitable  est : "+superficie2);
        if(meuble)
        {
            System.out.println("le bien est meublé ");

        }
        else
        {
            System.out.println("le bien n'est pas meublé");

        }


    }
    public Piece getpiece()
    {
        return pc;
    }

    public double getsuperficie2()
    {
        return superficie2;
    }

    public void setsuperficie2(double s)
    {
        superficie2 =s;
    }
    public boolean getmeuble()
    {
        return meuble;
    }
    public void setmeuble(boolean h)
    {
        meuble = h;
    }

    public void setpiece(Piece p)
    {
        pc = p;
    }






}

