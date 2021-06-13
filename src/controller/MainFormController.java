package controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFormController {
    public AnchorPane pneStage;
    public Label lblTitle;
    public ImageView imgNav;

    public void initialize() {

    }

    public void navigate(String title ,String url){
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource(url));
            pneStage.getChildren().clear();
            pneStage.getChildren().add(root);
            lblTitle.setText(title);
            Stage primaryStage = (Stage) (pneStage.getScene().getWindow());
            Platform.runLater(()->{
                primaryStage.sizeToScene();
                primaryStage.centerOnScreen();
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
