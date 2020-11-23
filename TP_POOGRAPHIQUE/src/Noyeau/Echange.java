package Noyeau;


public class Echange extends Transaction {


    public double calculerprix(Bien b) {//l'echange contient deux biens le premier celui proposé par l'agence et le deusième celui qui veut faire l'échange.
        double prix=b.getprix();
        String nom = b.getClass().getName();//nom contient le type du Bien soit maison soit Appartement soit terrain.

        System.out.println("le nom est  "+nom);
        if (prix <5000000)
        {
            if (b.getwilaya() .getprixmetre()<50000) {
                prix=prix+((prix*3)/100);
            }
            else
            {
                prix= (prix + ((prix*3.5)/100));
            }
        }
        else {
            if   (5000000 <prix && prix  <15000000) {
                if (b.getwilaya() .getprixmetre()<50000) {
                    prix=prix+((prix*2)/100);
                }
                else
                {
                    prix= (prix+((prix*2.5)/100));
                }

            }
            else//prix>15000000
            {
                if (b.getwilaya() .getprixmetre()<70000) {
                    prix=prix+((prix*1)/100);
                }
                else
                {
                    prix=(prix+((prix*2)/100));
                }

            }
        }
        /*********************teste si appartement ************************/
        if (nom.equals("Appartement")) {
            if(((Appartement)b).getetage()<=2) {
                prix=prix+50000;
            }
        }
        /*********************teste si maison ************************/
        if (nom.equals("Maison")) {
            if(((Maison)b).getgarage() || ((Maison)b).getjardin() || ((Maison)b).getpicine()  ) {
                prix=(prix+(0.005*prix));
            }
        }

        /*********************teste si terrains ************************/
        if (nom.equals("Terrain")) {
            if( ((Terrain)b).getnbfacade()>1) {
                for(int i=1;i<= ((Terrain)b).getnbfacade();i++) {
                    prix= (prix+(0.005*prix));
                }
            }
        }
        /******************************************************************/

        if(!b.getwilaya2().equals(b.getwilaya()) )
        {
            System.out.println("lolo");
            prix = prix +(0.0025)*prix;
        }
        return prix;


    }

}

