package CoffeeMachine;

public class Ingredient {
    String name;
    double quantity;
    double price;

    public Ingredient(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
