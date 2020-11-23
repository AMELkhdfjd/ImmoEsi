package Noyeau;
import  sample.*;
import java.util.*;

public class Agence  {

    public Agence()
    {

    }

    private Set<Bien>  list_bien = new TreeSet<Bien>();//liste des biens ordonnés.
    private ArrayList<Proprietaire> list_prop = new ArrayList<Proprietaire>();//liste des propriétaires.
    private ArrayList<Bien>  list_bienarch = new ArrayList<Bien>();//liste des biens archivés.
    private ArrayList<Wilaya> list_wilaya = new ArrayList<Wilaya>();//liste des wilayas.
    private ArrayList<String> list_critere = new ArrayList<String>();//La liste des critères.
    private  String nom_utilis = "admin";
    private  String password = "admin";
    public boolean authentification(String u,String p)
    {
        if(u.equals(nom_utilis) && p.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    //**************les méthodes******************//
    /******************************************************/
    public void aff_bien_num(int num) {


        Iterator<Bien>  it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien b1 = it.next();
            if (num ==b1.getmatricul())
            {
                b1. afficher();


            }


        }
    }
    /*********************************************************/

    public void aff_bie () {


        Iterator<Bien>  it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien b1 = it.next();

            System.out.println("le numero  :    "+ b1.getmatricul() +
                    "est un :   " +b1.getClass().getName());
        }


    }

    /*********************************************************/



    public boolean ajouter_listcrit(String g)//   ajouter un bien à la liste des biens.
    {
        return list_critere.add(g);
    }
    //****les méthodes de traitement pour la list des biens.

    public boolean ajouter_bien(Bien b)//   ajouter un bien à la liste des biens.
    {
        return list_bien.add(b);
    }

    public void suprimer_bien(int num)
    {
        Iterator<Bien>  it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien h = it.next();
            if(((Integer)h.getmatricul()).equals(num));
            {
                System.out.println("yuyu");

                list_bien.remove((Bien)h);

            }
        }
    }

	/*public void suprimer_bien(Bien b)   //supprimer un bien de la liste des bien ordonnés.
	{
		    Iterator<Bien>  it = list_bien.iterator();
		    while(it.hasNext())
		    {
		    	Bien h = it.next();
		    	if(b.equals(h))
		    	{
			        list_bien.remove(h);

		    	}
		    }
	}*/

    public void afficher_listbien()//la méthode qui affiche tous les biens de la liste ordonnés.
    {
        System.out.println("la taille :"+list_bien.size());
        Iterator<Bien> it = list_bien.iterator();
        while(it.hasNext())
        {
            System.out.println("*********************");
            it.next().afficher2();
        }
    }
    public int getsize()
    {
        return list_bien.size();
    }


    //***les méthodes de traitement pour la liste des biens archivés.


    public void archiver_bien(int nb)//archiver un bien.
    {
        Iterator<Bien> it = list_bienarch.iterator();
        while(it.hasNext())
        {
            Bien bien = it.next();
            if(bien.get_num() == nb)
            {
                list_bienarch.add(bien);
            }
        }


    }

    public void suprimer_bienarch(int n)   //supprimer un bien de la liste des bien archivés.
    {
        Iterator<Bien> it = list_bienarch.iterator();
        while(it.hasNext())
        {
            Bien bien = it.next();
            if(bien.get_num() == n)
            {
                list_bienarch.remove(bien);
            }
        }

    }



    public void afficher_listbienarch()//la méthode qui affiche tous les biens de la liste des biens archivés.
    {
        Iterator<Bien> it = list_bienarch.iterator();
        while(it.hasNext())
        {
            it.next().afficher();
        }
    }




    //***les méthodes de traitement pour la liste des propriétaires.


    public boolean ajouter_prop(Proprietaire b)//   ajouter un prop à la liste des propri"
    {
        return list_prop.add(b);
    }

    public void afficher_prop(Proprietaire p)    ///****afficher la liste des biens d'un propriétaire.
    {
        Iterator<Bien> it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien b = it.next();
            if(b.getprop().equals(p))
            {
                System.out.println("******Prop********");
                b.afficher();
            }
        }
    }

    public void suprimer_prop(Proprietaire b)   //supprimer un prop de la liste des propriétaires.
    {
        list_prop.remove(b);
    }

    //la méthode qui affiche tous les propr de la liste des propriétaires.
    public void afficher_prop()
    {
        Iterator<Proprietaire> it = list_prop.iterator();
        while(it.hasNext())
        {
            System.out.println("*********************");
            it.next().afficher();
        }
    }

    ////******les méthodes de traitement de la liste des wilayas.
    public boolean ajouter_wilaya(Wilaya b)//   ajouter un bien à la liste des biens.
    {
        return list_wilaya.add(b);
    }

    public void suprimer_wilaya(Wilaya b)   //supprimer un bien de la liste des bien ordonnés.
    {
        list_wilaya.remove(b);
    }

    public void afficher_listwilaya()//la méthode qui affiche tous les biens de la liste ordonnés.
    {
        Iterator<Wilaya> it = list_wilaya.iterator();
        while(it.hasNext())
        {
            System.out.println("*********************");
            it.next().afficher();
        }
    }

    ///******la méthode qui affiche les prix finaux pour chaque bien

    public void afficher_listbienprix()//la méthode qui affiche tous les biens de la liste ordonnés.
    {
        System.out.println("la taille :"+list_bien.size());
        Iterator<Bien> it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien b = it.next();
            System.out.println("*********************");
            b.afficher2();
            System.out.println("**********  le prix final de ce bien est  ***********"+b.calculerprix());


        }
    }

    ///****la méthode qui affiche selon des critères.

    public void affiche_crit()
    {
        int k=0;
        Iterator<Bien>  it = list_bien.iterator();
        while(it.hasNext())
        {
            Bien h = it.next();
            System.out.println("lolo "+list_critere.get(0));
            k=0;
            for(int g = 0;g < list_critere.size();g++)
            {
                if(h.sicritere(list_critere.get(g)))
                {
                    k=k+1;
                }


            }
            System.out.println("le k est "+k);

            if(k == list_critere.size())
            {
                h.afficher();
            }

        }
        list_critere.clear();
    }


}
