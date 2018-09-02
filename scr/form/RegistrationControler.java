package form;

import entity.ClientExceptin;
import entity.DaoClient;
import entity.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class RegistrationControler {
    private DaoClient dao = new DaoClient();

    @FXML
    public Button buttone_ok;
    @FXML
    public TextField enter_name;
    @FXML
    public TextField enter_email;
    @FXML
    public TextField enter_password;
    @FXML
    public TextField repeat_password;

    public void registration() {
        String password = enter_password.getText();
        String email = enter_email.getText();
        String name = enter_name.getText();
        String repeatPassword = repeat_password.getText();
        try {
            User us=dao.createUser(password,email,name,repeatPassword);
        } catch (ClientExceptin e) {
            System.out.println(e.myMessage);
            e.printStackTrace();
        }
    }

}
