package Noyeau;
import java.util.*;

public class Bien implements Comparable {
    /*****************atribut*********************************/
    private String[] photos ;
    private float prix;
    private Wilaya wilaya;
    private double superficie;
    private Proprietaire  prop;
    private String transnat;
    private boolean negocible ;
    private String  descriptif;
    private int jour , mois, anne,heure,min;
    private Wilaya wilaya2;
    private static int cpt=1;
    private int matricul;
    /*****************************methode********************/
    public Bien()
    {

    }
    public int get_num()
    {
        return matricul;
    }
    public Bien (float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me) {

        this.prix=p;
        this.wilaya=w;
        this.superficie=s;
        this.prop=pr;
        this. transnat=t;
        //this. negocible=n;
        this.jour=j;
        this.mois=m;
        this.anne=a;
        this.heure = he;
        this.min = me;
        this.matricul=cpt;
        cpt++;

    }
    public Bien (float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Wilaya w2) {

        this.prix=p;
        this.wilaya=w;
        this.superficie=s;
        this.prop=pr;
        this. transnat=t;
        //this. negocible=n;
        this.jour=j;
        this.mois=m;
        this.anne=a;
        this.heure = he;
        this.min = me;
        this.wilaya2= w2;
        this.matricul=cpt;
        cpt++;

    }

    public int getmatricul()
    {
        return matricul;
    }

    public double getsuperficie()
    {
        return superficie;
    }

    public float getprix() {
        return prix;
    }
    public Wilaya getwilaya() {
        return wilaya;
    }
    public int  getjour() {
        return jour ;
    }
    public int  getmois() {
        return mois  ;
    }

    public int  getanne() {
        return anne ;
    }
    public String  gettransnat() {
        return transnat ;
    }
    public Proprietaire getprop()
    {
        return prop;
    }
    public Wilaya getwilaya2() {
        return wilaya2;
    }

    public void setsuperficie(double s)
    {
        superficie = s;
    }

    public void setprix(float prix) {
        this.prix=prix;
    }
    public void setwilaya(Wilaya wilaya ) {
        this.wilaya =wilaya ;
    }
    public void setjour(int jour ) {
        this.jour=jour ;
    }
    public void setmois(int mois ) {
        this.mois=mois ;
    }
    public void setanne(int anne ) {
        this.anne=anne ;
    }
    public void settransnat(String transnat) {
        this.transnat=transnat ;
    }

    public void setprop(Proprietaire p)
    {
        prop = p;
    }
    public void setwilaya2(Wilaya wilaya ) {
        this.wilaya =wilaya2 ;
    }


    public double calculerprix()
    {

        if(transnat.compareTo("Vente")==0  )
        {
            Vente v= new Vente();
            return v.calculerprix(this);
        }
        else
        {
            if(transnat.compareTo("Location")==0)
            {
                Location l= new Location();
                return l.calculerprix(this);
            }
            else
            {
                Echange e = new Echange();
                return e.calculerprix(this);
            }
        }


    }




    public  void  afficher() {
        System.out.println("le numero de bien est "+getmatricul());
        System.out.println("le prix du bien est:   " +prix );
        wilaya.afficher();
        System.out.println("la superficier de bien est:   " +superficie);
        prop.afficher();
        System.out.println("le type de transaction est:   " + transnat);
        if ( negocible)
        {
            System.out.println("le bien  est: negocible  " );
        }
        else
        {
            System.out.println("le bien n'est pas negocible  " );
        }

        System.out.println("  la date est  " + jour +" " +mois+ " " +anne);


    }

    //   surdéfinition de la méthode afficher pour affcihage sans les détails.

    public void afficher2()
    {
        System.out.println("le numero de bien est "+getmatricul());
        System.out.println("le bien est :   " +this.getClass().getName() );
        System.out.println("le prix du bien est:   " +prix );
        wilaya.afficher();
        System.out.println("la superficier de bien est:   " +superficie);
        prop.afficher();
        System.out.println("le type de transaction est:   " + transnat);
    }


    //*****redifinition de la méthode equals.********//

    @Override
    public boolean equals(Object o)//on verifie tous les attributs des deux biens s'il sont egaux
    {
        if((((Bien)o).anne == this.anne) &&(((Bien)o).jour == this.jour) && (((Bien)o).mois == this.mois))
        {
            if((((Bien)o).negocible == this.negocible) && (((Bien)o).descriptif == this.descriptif) && (((Bien)o).prix == this.prix))
            {
                if(((Bien)o).prop.equals(this.prop))
                {
                    if(((Bien)o).superficie == this.superficie)
                    {
                        if(((Bien)o).wilaya.equals(this.wilaya))
                        {
                            if(((Bien)o).transnat.equals(this.transnat))
                            {
                                return true;
                            }
                        }
                    }

                }
            }
        }
        return false;
    }

    //********* redifinition de la méthode compareTo*********/
    @Override
    public int compareTo(Object o)
    {
        int a = ((Bien)o).anne;
        int m = ((Bien)o).mois;
        int j = ((Bien)o).jour;
        int he = ((Bien)o).heure;
        int mi = ((Bien)o).min;

        if(((Integer)a).compareTo(this.anne) == 0)
        {
            if(((Integer)m).compareTo(this.mois)  ==  0)
            {
                if(((Integer)j).compareTo(this.jour)  ==  0)
                {
                    if(((Integer)he).compareTo(this.heure)  ==  0)
                    {
                        return ((Integer)mi).compareTo(this.min);
                    }
                    else
                    {
                        return ((Integer)he).compareTo(this.heure);

                    }
                }
                else
                {
                    return ((Integer)j).compareTo(this.jour);

                }
            }
            else
            {
                return ((Integer)m).compareTo(this.mois);
            }
        }
        else
        {
            return ((Integer)a).compareTo(this.anne);
        }

    }

    //****la méthode qui permet de modifier un bien.

    public Bien modifier_bien()
    {
        System.out.println("quel attribut vous voulez modifier pour votre bien ? ");
        System.out.println("1)_Le prix");
        System.out.println("2)_La wilaya ");
        System.out.println("3)_La superficie");
        System.out.println("4)_Le propriétaire");
        System.out.println("5)_La nature de transaction");
        System.out.println("6)_la date d'ajout");
        System.out.println("7)_La wilaya d'echange");
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre choix  :");
        int x = sc.nextInt();
        switch(x)
        {
            case 1:
            {
                System.out.println("Donner le nouveau prix de votre bien");
                int y = sc.nextInt();
                prix = y;
                break;
            }
            case 2:
            {
                System.out.println("Donner les informations de votre wilaya : ");
                System.out.println("Donner le nom de votre wilaya : ");
                wilaya.setnomwilaya(sc.next());
                System.out.println("Donner le prix du métre carré de votre wilaya : ");
                wilaya.setprixmetre(sc.nextDouble());
                break;

            }
            case 3:
            {
                System.out.println("Donner la nouvelle superficie de votre bien  : ");
                superficie = sc.nextInt();
                break;
            }
            case 4:
            {
                System.out.println("Donner les informations du nouveau prpriétaire  : ");
                System.out.println("Donner le nom de votre propriétaire  : ");
                prop.setnom(sc.next());
                System.out.println("Donner le prénom de votre propriétaire  : ");
                prop.setprenom(sc.next());
                System.out.println("Donner l'adresse de votre propriétaire  : ");
                prop.setadresse(sc.next());
                System.out.println("Donner l'adresse mail de votre propriétaire  : ");
                prop.setadresse_mai(sc.next());
                System.out.println("Donner le tel de votre propriétaire  : ");
                prop.settel(sc.next());
                break;
            }
            case 5:
            {
                System.out.println("Donner la nouvelle transaction  : ");
                transnat = sc.next();
                break;
            }
            case 6:
            {
                System.out.println("Donner la nouvelle date d'ajout (j/m/a) : ");
                jour = sc.nextInt();
                mois = sc.nextInt();
                anne = sc.nextInt();
                break;

            }
            case 7:
            {
                System.out.println("Donner la nouvelle wilaya d'échange  : ");
                System.out.println("Donner le nom de votre wilaya : ");
                wilaya2.setnomwilaya(sc.next());
                System.out.println("Donner le prix du métre carré de votre wilaya : ");
                wilaya2.setprixmetre(sc.nextDouble());
                break;

            }
        }
        return this;



    }

    ///****la méthode qui vérifie si le bien satisfait le critère en entrée.

    public boolean sicritere(String  cr)
    {
        Scanner sc = new Scanner(System.in);
        if(cr.compareTo("type_transaction") == 0)
        {
            System.out.println("Donner le type de votre transaction (Vente/Location/Echange) ");
            String type = sc.next();
            if(type.compareTo("Vente") == 0)
            {
                if(this.gettransnat().compareTo("Vente" ) == 0)
                {
                    System.out.println("jdhfjd");
                    return true;
                }
            }

            if(type.compareTo("Location") == 0)
            {
                if(this.gettransnat().compareTo("Location" ) == 0)
                {
                    return true;
                }
            }
            if(type.compareTo("Echange") == 0)
            {
                if(this.gettransnat().compareTo("Echange" ) == 0)
                {
                    return true;
                }
            }
        }
        else
        {
            if(cr.compareTo("type_bien") == 0)
            {
                System.out.println("Donner le type de votre bien (Maison/Appartement/Terrain) ");
                String type = sc.next();
                if(type.compareTo("Maison") == 0)
                {
                    if(this.getClass().getName().compareTo("Maison" ) == 0)
                    {
                        return true;
                    }
                }

                if(type.compareTo("Appartement") == 0)
                {
                    if(this.getClass().getName().compareTo("Appartement" ) == 0)
                    {
                        return true;
                    }
                }
                if(type.compareTo("Terrain") == 0)
                {
                    if(this.getClass().getName().compareTo("Terrain" ) == 0)
                    {
                        return true;
                    }
                }
            }
            if(cr.compareTo("prix_max") == 0)
            {
                System.out.println("Donner le prix max ");
                float p = sc.nextFloat();
                if(((Float) this.getprix()).compareTo(p) < 0 )
                {
                    return true;
                }

            }
            if(cr.compareTo("prix_min") == 0)
            {
                System.out.println("Donner le prix min ");
                float p = sc.nextFloat();
                if(((Float) this.getprix()).compareTo(p) > 0 )
                {
                    return true;
                }

                if(cr.compareTo("superficie_max") == 0)
                {
                    System.out.println("Donner la superficie_max ");
                    double m = sc.nextDouble();
                    if(((Double) this.getsuperficie()).compareTo(m)< 0 )
                    {
                        return true;
                    }

                    if(cr.compareTo("superficie_min") == 0)
                    {
                        double r = sc.nextDouble();
                        if(((Double) this.getsuperficie()).compareTo(r) > 0 )
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





