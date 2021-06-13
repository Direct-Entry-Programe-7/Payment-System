package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {
    public AnchorPane pneStage;

    public void initialize() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/DashBoardForm.fxml"));
        pneStage.getChildren().add(root);
    }
}
