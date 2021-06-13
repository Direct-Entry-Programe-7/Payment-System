package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public Button btnNewStudent;
    public Button btnAddPayment;

    public void btnNewStudent_OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        navigate("New Student" , "/view/NewStudentForm.fxml");
    }

    public void btnAddPayment_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Add Payment" , "/view/AddPayment.fxml");
    }

    public void navigate(String title , String url){
        MainFormController ctrl = (MainFormController) btnAddPayment.getScene().getUserData();
        ctrl.navigate(title, url);
    }


}


