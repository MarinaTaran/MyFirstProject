/*5.1 Создайте простую модель , позволяющую принимать товар в магазин и продавать его. Весь товар поступивший храните
в коллекции Вектор. Модель должна позволять - добавить товар в магазин, поискать его по наименованию , цене или
 производителю, продать товар, вывести список остатков на складе, сформировать заказ клиенту для дальнейшей адресной доставки.

 */


import java.util.*;

public class Stock {

    Vector<Product> products = new Vector<Product>();
    Scanner scanner = new Scanner(System.in);

//    do
//
//    {
//        System.out.println("Which operation do you choose: 1 - add product, 2 - search product by name, 3 - " +
//                "search product by price, 4 - search product by manufacture, 5 - sale product, 6 - create order for " +
//                "send, 7 - to string balance, 8 - to string products, 0 - exit ");
//        int choose = 0;
//        if (scanner.hasNextInt()) {
//            choose = scanner.nextInt();
//            switch (choose) {
//                case 1:
//                    addProduct();
//                    break;
//                case 2:
//                    searchProductName();
//                    break;
//                case 3:
//                    searchProductPrice()
//                    break;
//                case 4:
//                    searchProductManufact()
//                    break;
//                case 5:
//                    saleProduct();
//                    break;
//                case 6:
//                    createOrderForSend();
//                    break;
//                case 7:
//                    toStringBalance();
//                    break;
//                case 8:
//                    toString()
//                    break;
//                case 0:
//                    break;
//            }
//        } while (choose != 0) ;
//
//
//    }


    public void addProduct(Product product) {
        boolean isFound = false;
        for (Product temp : products) {
            if (product.name.equals(temp.name) && product.manufact.equals(temp.manufact) && product.price == temp.price) {
                isFound = true;
                temp.weight += product.weight;
                break;
            }
        }
        if (!isFound) {
            products.add(product);

        }
    }

    public Vector<Product> searchProductName(String name) {
        Vector<Product> basketByName = new Vector<>();
        for (Product temp : products) {
            if (temp.name.equals(name)) {
                basketByName.add(temp);

            }
        }
        return basketByName;
    }

    //
    public Vector<Product> searchProductPrice(int price) {
        Vector<Product> basketByPrice = new Vector<>();
        for (Product temp : products)
            if (temp.price == price) {
                basketByPrice.add(temp);
            }
        return basketByPrice;
    }

    public Vector<Product> searchProductManufact(String manufactor) {
        Vector<Product> basketByManufact=new Vector<>();
        for (Product temp:products){
            if (temp.manufact.equals(manufactor)) {
                basketByManufact.add(temp);
            }
        }
        return basketByManufact;

        }

    public boolean saleProduct(String name,int quntaty) {
        boolean result=false;
        for (Product temp:products){
            if (temp.name.equals(name)&&temp.weight>quntaty){
              temp.weight -=quntaty;
              result=true;
              break;
            }else{
                if(temp.name.equals(name)){
                    result=true;
                    temp.weight=0;
                }
            }
        }

        return result ;
    }

    public void toStringBalance() {
       // Vector<Product> balance=new Vector<>();
        //Set<String> setPointer=new Set<String>();
        for (Product temp:products){
            System.out.println(temp);
        }

       // return Collections.unmodifiableCollection(products);
    }

    public Vector<Product> createOrderForSend(String name,int weight) {
        Vector<Product> orderForSend = new Vector<>();
        for (Product temp : products) {
            if (temp.name.contains(name) && temp.weight > weight) {
                // orderForSend.add();
            }
        }
    return  null;
    }

    public String toString() {
        return products.toString();
    }
}

