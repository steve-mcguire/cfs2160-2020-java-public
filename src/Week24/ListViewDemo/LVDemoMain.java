package Week24.ListViewDemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LVDemoMain extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("LVDemoFXML.fxml"));
            primaryStage.setTitle("JavaFX List Demo");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
