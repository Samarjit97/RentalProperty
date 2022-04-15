package coreproject.view.mainview;

import coreproject.core.ViewHandler;
import coreproject.view.LandlordViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class RetailerController {
    private ViewHandler viewHandler;
    private Stage stage;
    private Scene scene;
    private LandlordViewModel landlordVM;
    Parent root;
    @FXML
    private Button rental;

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> property;

    @FXML

    private String[] propertyType={"House","Apartment", "Summer House"};



    public void init(ViewHandler viewHandler, LandlordViewModel landLordVM){
        this.viewHandler=viewHandler;
        this.landlordVM=landLordVM;




    }

    public void rental(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../landlord/Owner.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();





    }

    public void leased(ActionEvent e) {
        System.out.println("Lease");
    }

    public void commercial(ActionEvent e) {
        System.out.println("Commercial");
    }
}
