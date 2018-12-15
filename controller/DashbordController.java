package lk.ijse.hibanate_Thogakade.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashbordController implements Initializable {

    @FXML
    private AnchorPane lordPnl;


    public void customerClicked(MouseEvent mouseEvent) throws IOException {
        Parent rootPane = FXMLLoader.load(this.getClass().getResource("../view/Customer.fxml"));
        Scene scene = new Scene(rootPane);
        lordPnl.getChildren().clear();
        lordPnl.getChildren().add(rootPane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void itemClicked(MouseEvent mouseEvent) throws IOException {
        Parent rootPane = FXMLLoader.load(this.getClass().getResource("../view/Item.fxml"));
        Scene scene = new Scene(rootPane);
        lordPnl.getChildren().clear();
        lordPnl.getChildren().add(rootPane);
    }
}
