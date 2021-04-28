package Week24.ListViewDemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class LVDemoFXMLController {
    public Button btnRemove, btnAddToLVTwo;
    public ListView<String> lvOne,lvTwo;
    private ObservableList<String> oListOne, oListTwo;

    @FXML
    public void initialize(){
        oListOne = FXCollections.observableArrayList();
        oListTwo = FXCollections.observableArrayList();
        oListOne.add("Item 1");
        oListOne.add("Item 2");
        oListOne.add("Item 3");
        oListOne.add("Item 4");
        oListOne.add("Item 5");
        oListOne.add("Item 6");
        lvOne.setItems(oListOne);
        lvTwo.setItems(oListTwo);
    }

    public void btnAddToLVTwoClick(ActionEvent actionEvent) {
        String item = (String) lvOne.getSelectionModel().getSelectedItem();
        oListTwo.add(item);
    }

    public void btnRemoveClick(ActionEvent actionEvent) {
        String item  = (String) lvTwo.getSelectionModel().getSelectedItem();
        oListTwo.remove(item);
    }
}
