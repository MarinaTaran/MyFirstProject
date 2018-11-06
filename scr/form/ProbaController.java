package form;

import entity.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProbaController {
    @FXML
    Button reg;
    @FXML
    Button login;
    @FXML
    TextField text_emeil;
    @FXML
    PasswordField password;
    @FXML
    Label message;


    public void startReg() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registration.fxml"));
        // System.out.println(getClass().getResource("two.fxml"));
        Parent root2 = null;
        try {
            root2 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setScene(new Scene(root2));
        stage.show();
    }

    public boolean login1() {
        boolean result = false;
        String email = text_emeil.getText();
        String pas = password.getText();
        System.out.println(email + "email");
        System.out.println(pas + "password");
        if (User.login(email, pas) == null) {
            System.out.println("Authorisation Error !");
        } else {
            result = true;
            message.setText("Congratulation !!! You authorized");
            message.setVisible(true);
        }
        return result;
    }


    public void goToOrder() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("orderForUser.fxml"));
        // System.out.println(getClass().getResource("two.fxml"));
        Parent root2 = null;
        try {
            root2 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setScene(new Scene(root2));
        stage.show();

    }
}

