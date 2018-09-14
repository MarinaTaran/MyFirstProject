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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
        stock.addProduct(new Product("sour cream", 20, 20, "teva"));
        stock.addProduct(new Product("hummus", 30, 50, "cabar"));
        stock.addProduct(new Product("eegs", 50, 30, "leser"));
        stock.addProduct(new Product("hummus", 20, 30, "cabar"));
        System.out.println(stock.toString());

    }

    @FXML
    Button add_basket;
    @FXML
    Button order_product;
    @FXML
    TextField n_order;
    @FXML
    TableView product_view;
    @FXML
    TextField search_product;
    @FXML
    TableView busket_view;

    ObservableList<Product>  model=FXCollections.observableArrayList(stock.getProducts());
    ObservableList<Product>  model3=FXCollections.observableArrayList();
    public  void  initialize() {
        initTableView1();
        TableColumn<Product, String> addNameToBusket = new TableColumn<>("Name of product");
        addNameToBusket.setCellValueFactory(new PropertyValueFactory<>("name"));
       busket_view.getColumns().addAll(addNameToBusket);
        busket_view.setItems(model3);
    }

    private void initTableView1() {
        TableColumn<Product, String> fNameCol = new TableColumn<>("Name of product");
        fNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Product, Integer> fPrice = new TableColumn<>("Price");
        fPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn<Product, Integer> fWeight = new TableColumn<>("Quantity");
        fWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        TableColumn<Product, String> fManufac= new TableColumn<>("Manufacture");
        fManufac.setCellValueFactory(new PropertyValueFactory<>("manufact"));
        product_view.getColumns().addAll(fNameCol,fManufac,fPrice,fWeight);
        product_view.setItems(model);
    }


    public void qwerty() {  //obrabotka nazhatiy na klavishu
//        Vector<Product> basket = new Vector<>();
       String temp = search_product.getText().toLowerCase();
//        for (Product temp1 : stock.getProducts()) {
//            if (temp1.getName().toLowerCase().startsWith(temp)) {
//                basket.add(temp1);
//            }
        ObservableList<Product> filtr=model.
                    filtered((w)->{return w.getName().startsWith(temp);});
        System.out.println(filtr);
//            model.clear();
           product_view.setItems(filtr);

        }
       // System.out.println("key pressed " + search_product.getText());

//        System.out.println(basket);
        public  void mclic(){
            System.out.println("method klick");
            System.out.println(product_view.getSelectionModel().getSelectedItem());
            model3.add((Product)product_view.getSelectionModel().getSelectedItem());
            busket_view.setItems(model3);


        }

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
