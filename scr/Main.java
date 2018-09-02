import entity.Product;
import entity.Stock;
import entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {



    public static void main(String[] args) {

    Stock stock = new Stock();
    stock.addProduct(new Product("smetana",20,20,"teva") );
    stock.addProduct(new Product("doktorskaya",30,50,"zaporozhskaya"));
    stock.addProduct(new Product("kivi",50,30,"africa"));
    stock.addProduct(new Product("kivi",20,30,"africa"));
        System.out.println(stock.toString());
    //    Collection<Product> qwe=stock.toStringBalance();
       // qwe.add(new Product("smetana",20,20,"teva"));
        //qwe.iterator().next().weight=0;
        stock.toStringBalance();
    }

               }





//
