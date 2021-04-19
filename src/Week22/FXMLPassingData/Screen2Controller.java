package Week22.FXMLPassingData;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Screen2Controller {
    public Label lblPassedValue;
    public Button btnBackToScreen1;
    public TextField tfScreen2;
    private String message;

    @FXML
    private void initialize() {

    }


    //this can accept anything, could be an arraylist, or even an instance of another class.
    public void dataReceiver(String passedMessage){
        this.message = passedMessage;
        lblPassedValue.setText("The value from screen 1 is: " + this.message);
    }

    public void btnNextScreenClick(ActionEvent actionEvent) {

    }

    public void btnBackToScreen1Click(ActionEvent actionEvent) {
        try{

            //Pass whatever data you want. You can have multiple method calls here
            if(tfScreen2.getText().equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("I'm an alert I am!");
                alert.setHeaderText(null);
                alert.setContentText("Enter some why don't ya!");
                alert.showAndWait();

            }else{
                //Load second scene
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Screen1.fxml"));
                Parent parent = loader.load();

                //Get controller of scene2 from the FXMLLoader created above
                Screen1Controller scene1Controller = loader.getController();
                scene1Controller.dataReceiver("Returned value is " + tfScreen2.getText());

                //Now to change the screen from 1 to 2
                //Get the current stage from any control, in this case the button that was clicked.
                Stage stage = (Stage) btnBackToScreen1.getScene().getWindow();
                //Set the scene with the new root (created from the loaded.load() above)
                stage.setScene(new Scene(parent));
                stage.setTitle("First Window Again");
            }


        }catch(Exception e){
            System.out.println(e);
        }

    }
}
