package Week22.ConstructorPassingData;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {

    // Holds this controller's Stage
    private Stage thisStage;

    // Will hold a reference to the first controller, allowing us to access the methods found there.
    private final Controller1 controller1;

    // Add references to the controls in Layout2.fxml
    @FXML
    private Label lblFromController1;
    @FXML
    private TextField txtToFirstController;
    @FXML
    private Button btnSetLayout1Text;

    public Controller2(Controller1 controller1) {
        // We received the first controller, now let's make it usable throughout this controller.
        this.controller1 = controller1;

        // Create the new stage
        thisStage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Layout2.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            thisStage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            thisStage.setTitle("Passing ScreenControllers Example - Layout2");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Show the stage that was loaded in the constructor
     */
    public void showStage() {
        thisStage.show();
    }

    @FXML
    private void initialize() {

        // Set the label to whatever the text entered on Layout1 is
        lblFromController1.setText(controller1.getEnteredText());

        // Set the action for the button
        btnSetLayout1Text.setOnAction(event -> setTextOnLayout1());
    }

    public void passOSmeSTuff(int x){
        lblFromController1.setText(String.valueOf(x));
    }

    /**
     * Calls the "setTextFromController2()" method on the first controller to update its Label
     */
    private void setTextOnLayout1() {
        System.out.println("in method");
        //pass some data back to the parent / controller1 instance
        controller1.setTextFromController2(txtToFirstController.getText());
        thisStage.close();
        //re-open controller one from the existing instance
        controller1.showStage();
    }
}
