public class Product {
    String name;
    int weight;
    int price;
    String manufact;


    public Product(String name, int weight, int price, String manufact) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufact = manufact;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", manufact='" + manufact + '\'' +
                '}';
    }
}
