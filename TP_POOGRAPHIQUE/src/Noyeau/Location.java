package Noyeau;


public class Location extends Transaction{
    public double calculerprix(Bien b)
    {
        double superficie = b.getsuperficie();
        double prix= b.getprix();
        String nom = b.getClass().getName();  //nom contient le type du Bien soit maison soit Appartement soit terrain.
        if(b.getsuperficie() <60)
        {
            if(b.getwilaya().getprixmetre() < 50000)
            {
                prix = prix + prix * 0.01;
            }
            else prix = prix +prix * 0.015;

        }
        if( 60< superficie  && superficie < 150)
        {
            if(b.getwilaya().getprixmetre() <50000)
            {
                prix = prix + 0.02 * prix;
            }
            else  prix = prix +prix * 0.025;

        }

        if(superficie > 150)
        {
            if(b.getwilaya().getprixmetre() <50000)
            {
                System.out.println("ederd");

                prix = prix + 0.03 * prix;
            }
            else  prix = prix +prix * 0.035;

        }
        //************** test si le bien est un appartement ***************//
        if (nom.equals("Appartement") )
        {

            if(((Appartement) b).getetage() <= 2)
            {
                prix = prix +5000;
            }
            boolean bool = ((Appartement) b).siassenceur();
            if(!bool  && ((Appartement) b).getetage() >= 6)
            {
                prix = prix - 500*superficie;
            }
        }
        //************** test si le bien est une maison *******************//

        if(nom.equals("Maison") )
        {
            boolean bool2 = ((Maison)b).getpicine();
            if(bool2 = true)


            {
                prix = prix + 50000;
            }
        }


        return prix;

    }

}
