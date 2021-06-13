package controller;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class DashBoardFormController {
    public Button btnNewStudent;
    public Button btnAddPayment;

    public void btnNewStudent_OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        navigate("New Student" , "/view/NewStudentForm.fxml");
    }

    public void btnAddPayment_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Add Payment" , "/view/AddPaymentForm.fxml");
    }

    public void navigate(String title , String url){
        MainFormController ctrl = (MainFormController) btnAddPayment.getScene().getUserData();
        ctrl.navigate(title, url , MainFormController.NAV_ICON_BACK);
    }


    public void pneManageUsers_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Manage Users" , "/view/ManageUserForm.fxml");
    }

    public void pneEditPayment_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Edit Payment" , "/view/EditPaymentForm.fxml");
    }

    public void pneEditStudent_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Edit Student Details" , "/view/EditStudentForm.fxml");
    }

    public void pneSearchStudent_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Search Students" , "/view/SearchStudentForm.fxml");
    }

    public void pneSearchPayment_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Search Payment" , "/view/SearchPaymentForm.fxml");
    }
}


