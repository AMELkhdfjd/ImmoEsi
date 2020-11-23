package sample;
import Noyeau.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXML;


public class Administrateur {


    public TextField num_bien;
    public RadioButton archiver;
    public RadioButton supprimer;
    public Button ok;
    public Pane pane2;
    public Pane pane1;
    public GridPane grid1;
    public GridPane grid2;
    public RadioButton  detail;
    public Label erreur1;
    int i = Integer.parseInt(num_bien.getText());
    public void ceer_opera()
    {
        pane1.setVisible(true);
        pane2.setVisible(false);
        grid1.setVisible(false);
        grid2.setVisible(false);
    }
   // Main m  = new Main();
   // Agence a = m.getAgence();
    Agence a = new Agence();
    public void opera_bien()
    {
        if(i <= a.getsize() )
        {
            if(archiver.isSelected())
            {
                a.archiver_bien(i);
            }
            else
            {
                if(supprimer.isSelected())
                {
                    a.suprimer_bien(i);
                }
                else
                {
                    if ( detail.isSelected())
                    {
                         pane2.setVisible(true);
                    }
                }
            }
        }
        else{
            erreur1.setVisible(true);



        }
    }





}
