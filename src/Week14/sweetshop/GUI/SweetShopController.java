package Week14.sweetshop.GUI;

import Week14.sweetshop.SweetShop;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class SweetShopController {
    public Label lblWelcome;
    public Button btnAddPrice;
    public Label lblInstruction;
    public ListView<Integer> lvPrices;
    public TextField tbSweetPrice;
    public Button btnCheckout;
    public Button btnRemovePrice;
    private ArrayList<Integer> prices = new ArrayList<>();
    private ObservableList<Integer> p;
    private SweetShop ss = new SweetShop();

    @FXML
    private void initialize() {
        lblWelcome.setText("Welcome to the sweet shop");
        lblInstruction.setText("Please enter the price of sweet 1");
        //collectPrices();
        p = FXCollections.observableArrayList();
        lvPrices.setItems(p);
    }

    private void collectPrices(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }



    public void btnAddPriceClick(ActionEvent actionEvent) {
        try{
            String input = tbSweetPrice.getText();
            System.out.println(input);
            Integer price = ss.processInput(input);
            ss.addSweet(price);
        }catch(NumberFormatException n){
            System.out.println(n);
        }
    }

    public void btnCheckoutClick(ActionEvent actionEvent) {
    }

    public void btnRemovePriceClick(ActionEvent actionEvent) {
    }
}
