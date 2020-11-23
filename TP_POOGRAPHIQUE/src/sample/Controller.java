package sample;
import Noyeau.Agence;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;



public class Controller {
      public  TextField  user_box;
     public PasswordField pass_box;
     public  RadioButton Administrateur;
     public  RadioButton Utilisateur;
     public Label label0;
     public Label label1;
     public Label label2;
    private Stage Form = new Stage();

     private  Agence agence =  new  Agence();

   public  void quitter(ActionEvent event )
    {
        Platform.exit();
    }


   public void Authen()
   {
       if(Administrateur.isSelected()) {

           try {
               label1.setVisible(false);
               label2.setVisible(false);

               if (agence.authentification(user_box.getText(), pass_box.getText())) {
                   label0.setVisible(false);

                  FXMLLoader loader = new FXMLLoader(getClass().getResource("Administrateur.fxml"));

                   Parent root = loader.load();

                   Scene scene = new Scene(root);
                   Form.setScene(scene);
                   System.out.println("yhyh");
                   Form.show();
               } else {
                   label0.setVisible(true);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

       else{
           try {


               System.out.println("lolo");
               FXMLLoader loader = new FXMLLoader(getClass().getResource("PUBLIC.fxml"));
               Parent root = loader.load();
               Scene scene = new Scene(root);
               Form.setScene(scene);
               Form.show();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
}
