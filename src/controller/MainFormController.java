package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {
    public AnchorPane pneStage;

    public void initialize() {

    }

    public void navigate(String url){
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource(url));
            pneStage.getChildren().clear();
            pneStage.getChildren().add(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
