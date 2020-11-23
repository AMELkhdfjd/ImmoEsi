package sample;

import Noyeau.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main(){}
    Piece p = Piece.F4;
    Piece p2 = Piece.F3;
    Piece p3 = Piece.STUDIO;
    Proprietaire prop1 = new Proprietaire("Amel", "KHAMOUM", "ia_khamoum@esi.dz", "cité_34", "11111111");
    Proprietaire prop2 = new Proprietaire("bianca", "koko", "ij_koko@esi.dz", "cité_35", "22222222");
    Proprietaire prop3 = new Proprietaire("FARID", "KHAMOUM", "if_khamoum@esi.dz", "cité_36", "33333333");
    Proprietaire prop4 = new Proprietaire("DALILA", "ZEROUTI", "id_zerouti@esi.dz", "cité_37", "4444444");
    Agence agence = new Agence();



    Wilaya wilaya1 = new Wilaya("Alger", 100000);
    Wilaya wilaya2 = new Wilaya("Oran", 30000);
    Wilaya wilaya3 = new Wilaya("Bejai", 60000);


    Bien bien1 = new Appartement(4000000, wilaya2, 120, prop2, "Vente", 2, 1, 2020,2,30, p, false, 90, 1, true, false);


    Bien bien2 = new Maison(10000000, wilaya3, 200, prop1, "Vente", 3, 1, 2020,3,13, p, false, 200, 1, false, true,false);



    Bien bien3 = new Terrain(20000000, wilaya1, 500, prop1, "Vente", 4, 1, 2020,4,34, 3);


    Bien bien4 = new Appartement(40000, wilaya3, 100, prop2, "Location", 5, 1, 2020,4,54, p2, true, 100, 1, true, false);


    Bien bien5 = new Maison(150000, wilaya2, 160, prop3, "Location", 6, 1, 2020,3,22, p, true, 140, 1, false, false,true);

    Bien bien6 = new Appartement(60000, wilaya3, 50, prop2, "Location", 7, 1, 2020,2,43, p3, false, 50, 6, true, false);


    Bien bien7 = new Terrain(18000000, wilaya1, 650, prop1, "Echange", 8, 1, 2020,4,12, wilaya3, 1);

    Bien bien8 = new Maison(14000000, wilaya2, 200, prop2, "Echange", 9, 1, 2020,5,54, wilaya2, p, true, 200, 1, true,false, false);


    public Agence getAgence()
    {
        return agence;
    }
    @Override
    public void start(Stage primaryStage) throws Exception{



        agence.ajouter_prop( prop1);
        agence.ajouter_prop(prop2);
        agence.ajouter_prop(prop3);
        agence.ajouter_prop(prop4);
        agence.ajouter_wilaya(wilaya1);
        agence.ajouter_wilaya(wilaya2);
        agence.ajouter_wilaya(wilaya3);
        agence.ajouter_bien(bien1);
        agence.ajouter_bien(bien2);
        agence.ajouter_bien(bien4);
        agence.ajouter_bien(bien5);
        agence.ajouter_bien(bien5);
        agence.ajouter_bien(bien6);
        agence.ajouter_bien(bien8);
        agence.ajouter_bien(bien8);
        agence.ajouter_bien(bien3);
        agence.ajouter_bien(bien7);




        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
