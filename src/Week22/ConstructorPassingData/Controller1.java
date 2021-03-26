package Week22.ConstructorPassingData;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {

    // Holds this controller's Stage
    private final Stage thisStage;

    // Define the nodes from the Layout1.fxml file. This allows them to be referenced within the controller
    @FXML
    private TextField txtToSecondController;
    @FXML
    private Button btnOpenLayout2;
    @FXML
    private Label lblFromController2;

    public Controller1() {

        // Create the new stage
        thisStage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Layout1.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            thisStage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            thisStage.setTitle("Passing ScreenControllers Example - Layout1");

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

    /**
     * The initialize() method allows you set setup your scene, adding actions, configuring nodes, etc.
     */
    @FXML
    private void initialize() {
        // Add an action for the "Open Layout2" button
        btnOpenLayout2.setOnAction(event -> openLayout2());
    }

    /**
     * Performs the action of loading and showing Layout2
     */
    private void openLayout2() {

        System.out.println("in click");

        // Create the second controller, which loads its own FXML file. We pass a reference to this controller
        // using the keyword [this]; that allows the second controller to access the methods contained in here.
        Controller2 controller2 = new Controller2(this);
        //Controller2 controller2 = new Controller2();



        thisStage.close();

        // Show the new stage/window
        controller2.showStage();

    }

    /**
     * Returns the text entered into txtToSecondController. This allows other controllers/classes to view that data.
     */
    public String getEnteredText() {
        return txtToSecondController.getText();
    }

    /**
     * Allows other controllers to set the text of this layout's Label
     */
    public void setTextFromController2(String text) {
        lblFromController2.setText(text);
    }
}
