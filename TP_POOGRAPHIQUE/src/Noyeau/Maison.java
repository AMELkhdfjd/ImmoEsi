package Noyeau;

import java.util.Scanner;

public class Maison extends Habitable {

    private int nb_etage;
    private boolean garage ;
    private boolean jardin;
    private boolean picine ;
    /************************methode **********************/
    public Maison (float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he,int me,Piece f,boolean l,double su,int r, boolean g, boolean o, boolean q)
    {
        super(p,w,s,pr,t,j,m,a,he,me,f,l,su);

        this.nb_etage=r;
        this. garage=g;
        this.jardin=o;
        this.picine=q;

    }

    public Maison (float p,  Wilaya w,double s,Proprietaire pr, String t, int j ,int m,int a,int he ,int me,Wilaya w2,Piece f,boolean l,double su,int r, boolean g, boolean o, boolean q) {
        super(p,w,s,pr,t,j,m,a,he,me,w2,f,l,su);

        this.nb_etage=r;
        this. garage=g;
        this.jardin=o;
        this.picine=q;

    }
    public int  getnbetage() {
        return nb_etage  ;
    }
    public boolean getgarage() {
        return  garage ;
    }
    public boolean getjardin() {
        return  jardin ;
    }
    public boolean getpicine() {
        return picine  ;
    }
    public  void setnb_etage(int nb_etage) {
        this.nb_etage=nb_etage;
    }
    public  void setgarage(boolean garage) {
        this.garage=garage;
    }
    public  void setjardin(boolean jardin) {
        this.jardin=jardin;
    }
    public  void setpicine(boolean picine ) {
        this.picine=picine;
    }
    public void afficher() {
        System.out.println("le bien est : "+this.getClass().getName());
        super.afficher();
        System.out.println("le nombre d'etage de la maispn est : " +nb_etage );
        if ( garage)
        {
            System.out.println("la maison possède au moins un garage   " );
        }
        else
        {
            System.out.println(" la maison ne possède pas  un garage  " );
        }

        if (jardin )
        {
            System.out.println("la maison possède  un jardin   " );
        }
        else
        {
            System.out.println(" la maison ne possède pas  un jardin  " );
        }
        if (picine )
        {
            System.out.println("la maison possède  une picine   " );
        }
        else
        {
            System.out.println(" la maison ne possède pas  une picine  " );
        }
    }


    //****la méyhode qui modifie le bien.

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
            System.out.println("2)_l'existance d'un jardin ");
            System.out.println("3)_l'existance d'un garage ");
            System.out.println("4)_l'existance d'une picine ");
            System.out.println("Veuillez saisir votre choix  :");
            int x = sc.nextInt();
            switch(x)
            {
                case 1:
                {
                    System.out.println("Donner le nouveau nombre d'étage");
                    nb_etage = sc.nextInt();
                    break;
                }
                case 2:
                {
                    if(jardin)
                    {
                        jardin = false;
                    }
                    else
                    {
                        jardin = true;
                    }
                    break;

                }
                case 3:
                {

                    if(garage)

                    {
                        garage = false;
                    }
                    else
                    {
                        garage = true;
                    }
                    break;
                }
                case 4:
                {
                    if(picine)
                    {
                        picine = false;
                    }
                    else
                    {
                        picine = true;
                    }
                    break;
                }
            }
        }
        return this;
    }







}

