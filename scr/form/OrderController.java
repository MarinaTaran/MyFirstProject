package form;

import entity.Client;
import entity.Product;
import entity.Stock;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Vector;


public class OrderController {
    static Stock stock;

    static {
        new Client("mari", "123", "mari@gmail.com", "222333");
        new Client("mari1", "123", "mari1@gmail.com", "222333");
        new Client("mari2", "123", "mari2@gmail.com", "222333");
        stock = new Stock();
        stock.addProduct(new Product("smetana", 20, 20, "teva"));
        stock.addProduct(new Product("doktorskaya", 30, 50, "zaporozhskaya"));
        stock.addProduct(new Product("kivi", 50, 30, "africa"));
        stock.addProduct(new Product("kivi", 20, 30, "africa"));
        System.out.println(stock.toString());

    }

    @FXML
    Button add_basket;
    @FXML
    Button order_product;
    @FXML
    ListView busket_view;
    @FXML
    TextField n_order;
    @FXML
    TableColumn product_list;
    @FXML
    TableColumn quantity;
    @FXML
    TextField search_product;
    @FXML
    ListView ololo;
    ObservableList<Product>  model=FXCollections.observableArrayList(stock.getProducts());

    public  void  initialize() {
        ololo.setItems(model);

    }

    public void qwerty() {  //obrabotka nazhatiy na klavishu
//        Vector<Product> basket = new Vector<>();
       String temp = search_product.getText().toLowerCase();
//        for (Product temp1 : stock.getProducts()) {
//            if (temp1.getName().toLowerCase().startsWith(temp)) {
//                basket.add(temp1);
//            }
            List<Product> filtr=model.filtered((w)->{return true;});
        System.out.println(filtr);
            model.clear();
           model.addAll(filtr);

        }
       // System.out.println("key pressed " + search_product.getText());

//        System.out.println(basket);


    public void listOfProduct() {
        // product_list.;
    }

    public void qwe1() {
        System.out.println("fdfdfdfdfdf");
    }

    public void qwe_done() {
        System.out.println("obrabotka sobitiy drap down");
    }

}
