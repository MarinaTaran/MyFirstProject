package entity;

import java.time.LocalDate;
import java.util.Vector;

public class Order {
    String number;
    Client owner;
    LocalDate dateOrder;
    OrderState state;
    Vector<Product> basket = new Vector<>();

    public Order(String number, Client owner, LocalDate dateOrder, OrderState state) {
        this.number = number;
        this.owner = owner;
        this.dateOrder = dateOrder;
        this.state = state;

    }
}

