package form;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProbaController {
    @FXML
    Button btn1;
    @FXML
Button login;
    @FXML
TextField text_emeil;
    @FXML
PasswordField password;

    public  void one(){
        System.out.println("sdsddssdsds");
    }

    public void login(){
       System.out.println(text_emeil.getText());
//        System.out.println(password.getText());
        System.out.println("sdsdsdsds");
    }

}
