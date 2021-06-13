package controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFormController {

    public static  final int NAV_ICON_NONE = 0;
    public static  final int NAV_ICON_BACK = 1;

    public AnchorPane pneStage;
    public Label lblTitle;
    public ImageView imgNav;
    public ImageView imgMinimize;
    public ImageView imgClose;

    public void initialize() {
        firstWindow();
    }

    public void navigate(String title ,String url, int icon){
        try {
            imgNav.setVisible(true);
            switch (icon){
                case NAV_ICON_NONE:
                    imgNav.setVisible(false);
                    break;
                case NAV_ICON_BACK:
                    imgNav.setImage(new Image("/assets/eva_arrow-ios-back-fill.png"));
                    break;

            }
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

    public void firstWindow(){
        lblTitle.setMouseTransparent(true);
        imgNav.setVisible(false);
    }
}
