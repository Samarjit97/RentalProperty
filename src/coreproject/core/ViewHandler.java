package coreproject.core;

import coreproject.view.mainview.RetailerController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {
    private Scene addData;
    private Stage stage;
    private ViewModelFactory vmf;

    public ViewHandler(ViewModelFactory vmf) {
        this.vmf=vmf;
        stage=new Stage();

    }
    public void start() throws IOException {
        openRetailerView();

    }

    public void openRetailerView() throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/mainview/Rental.fxml"));
        Parent root=loader.load();
        RetailerController controller=loader.getController();

        controller.init(this,vmf.getLandLordVM());
        addData =new Scene(root);
        stage.setTitle("Property Renter");
        stage.setScene(addData);
        stage.show();




    }

}
