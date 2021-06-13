package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public Button btnNewStudent;

    public void btnNewStudent_OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml")));
        stage.setScene(scene);
        stage.setTitle("xyz");
        stage.show();
    }
}


