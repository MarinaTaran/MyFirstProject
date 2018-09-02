import entity.Client;
import entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start1 extends Application

{
    static{
        new Client("mari","123","mari@gmail.com","222333");
        new Client("mari1","123","mari1@gmail.com","222333");
        new Client("mari2","123","mari2@gmail.com","222333");

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form/proba.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
