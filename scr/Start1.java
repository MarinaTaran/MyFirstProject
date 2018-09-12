import entity.Client;
import entity.Product;
import entity.Stock;
import entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start1 extends Application

{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form/orderForUser.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800,500 ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
