package Noyeau;


public class Wilaya {
    private double prix_metre;
    private String w;  //le nom de la wilaya.


    //*************** les méthodes *****************//

    public Wilaya()
    {

    }
    public Wilaya(String f,double a)//le constructeur.
    {
        prix_metre = a;
        w=f;
    }


    public double getprixmetre()
    {
        return prix_metre;
    }

    public void setprixmetre(double r)
    {
        prix_metre = r;
    }
    public String getnomwilaya()
    {
        return w;
    }
    public void setnomwilaya(String s)
    {
        w=s;
    }


    public void afficher()
    {
        System.out.println("le nom de la wilaya est : "+w);
        System.out.println("le prix du mètre carré est  : "+prix_metre);

    }

    public boolean equals(Object o)
    {
        if((((Wilaya)o).prix_metre == this.prix_metre) && (((Wilaya)o).w.equals(this.w)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
