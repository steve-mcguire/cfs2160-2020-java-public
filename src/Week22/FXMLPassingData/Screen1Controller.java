package Week22.FXMLPassingData;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Screen1Controller {
    public Button btnNextScreen;
    public TextField tfValueToPass;

    public void btnNextScreenClick(ActionEvent actionEvent) {
        try{
            if(tfValueToPass.getText().equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("I'm an alert I am!");
                alert.setHeaderText(null);
                alert.setContentText("Gimme some text if you don't mind, ta!");
                alert.showAndWait();

            }else {

                //Load second scene
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Screen2.fxml"));
                Parent parent = loader.load();

                //Get controller of scene2 from the FXMLLoader created above
                Screen2Controller scene2Controller = loader.getController();
                //Pass whatever data you want. You can have multiple method calls here
                scene2Controller.dataReceiver(tfValueToPass.getText());


                //Now to change the screen from 1 to 2
                //Get the current stage from any control, in this case the button that was clicked.
                Stage stage = (Stage) btnNextScreen.getScene().getWindow();
                //Set the scene with the new root (created from the loaded.load() above)
                stage.setScene(new Scene(parent));
                stage.setTitle("Second Window");

            }


        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void dataReceiver(String data){
        tfValueToPass.setText(data);
    }
}
