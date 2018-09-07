package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner;
    Ingredient[] stock = new Ingredient[4];
    Ingredient[] stockHistory = new Ingredient[4];
    double income = 0;

    void startMenu() {
        stock[0] = new Ingredient("shugar", 5, 20);
        stock[1] = new Ingredient("milk", 3, 25);
        stock[2] = new Ingredient("coffee", 4, 50);
        stock[3] = new Ingredient("tea", 50, 4);
        scanner = new Scanner(System.in);
        int maineChoice;
        do {
            System.out.println("\nEnter: 1 - report, 2 - sale, 3 - add ingredients, 0 - exit!");
            maineChoice = scanner.nextInt();
            switch (maineChoice) {
                case 1:
                    report();
                    break;
                case 2:
                    sale();
                    break;
                case 3:
                    addIngredients();
                    break;
                case 0:
                    System.out.println("Exit from programm!");
                    break;
                default:
                    System.out.println("Mistake!You enter " + maineChoice);
            }
        } while (maineChoice != 0);
    }

    private void addIngredients() {
        int choiceIngredient;
        double quantity = 0;
        do {
            System.out.println("Choose: 1 - shugar, 2 - milk, 3 - coffee, 4 - tea, 0 - exit!");
            choiceIngredient = scanner.nextInt();
            if (choiceIngredient > 0 && choiceIngredient < 5) {
                System.out.println("Enter quantity:");
                quantity = scanner.nextDouble();
                stock[choiceIngredient - 1].quantity += quantity;
            } else if (choiceIngredient < 0 || choiceIngredient > 4) {
                System.out.println("Incorrect value!");
            }

//            switch (choiceIngredient) {
//                case 1:
//                    stock[0].quantity += quantity;
//                    break;
//                case 2:
//                    stock[1].quantity += quantity;
//                    break;
//                case 3:
//                    stock[2].quantity += quantity;
//                    break;
//                case 4:
//                    stock[3].quantity += quantity;
//                    break;
//                case 0:
//                    break;
//                default:
//
//            }
        } while (choiceIngredient != 0);
    }

    private void sale() {
        int chooseSaleMenu;
        do {
            System.out.println("Choose menu: 1 - milk, 2 - coffee, 3 - tea, 0 - exit");
            chooseSaleMenu = scanner.nextInt();
//            stock[chooseSaleMenu].quantity -= chooseSaleMenu;
//            System.out.println(stock[chooseSaleMenu].quantity);
//            if (chooseSaleMenu > 1 & chooseSaleMenu < 3) {
//                System.out.println("How many shugar do you want: 1 - 1 spoon, 2 - 2 spoons, 3 - 3 spoons, 0 - without shugar");
//                spoon = scanner.nextInt();
//                stock[0].quantity -= spoon;
////                ingredientBill = chooseSaleMenu *;
//                System.out.println(stock[0].quantity);
//
//            }
            switch (chooseSaleMenu) {
                case 1:
                    break;
                case 2:
                    System.out.println("Enter: 1 - coffee, 2 - double coffee!");
                    int doubleCoffee = scanner.nextInt();
                    stock[2].quantity -= 0.001 * doubleCoffee;
                    income += 0.001 * doubleCoffee * stock[2].price;
                    System.out.println("Enter: 1 - spoon, 2 - double spoon, 0 - sugar free!");
                    int shugarSpoon = scanner.nextInt();
                    stock[0].quantity -= 0.001 * shugarSpoon;
                    income += 0.001 * shugarSpoon * stock[0].price;
                    System.out.println("Enter: 1 - withMilk, 0 - withMilk free!");
                    int withMilk = scanner.nextInt();
                    stock[1].quantity -= 0.002 * withMilk;
                    income += 0.002 * withMilk * stock[1].price;
                    break;
                case 3:
                    stock[3].quantity -= 1;
                    income += 1 * stock[3].price;
                    System.out.println("Enter: 1 - spoon, 2 - double spoon, 0 - sugar free!");
                    int shugarSpoonTea = scanner.nextInt();
                    stock[0].quantity -= 0.001 * shugarSpoonTea;
                    income += 0.001 * shugarSpoonTea * stock[0].price;
                    break;
                case 0:
                    System.out.println("Exit from sale!");
                    break;
            }
        } while (chooseSaleMenu != 0);

    }

    private void report() {
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i]);
        }
        System.out.println("income = " + income + ";");
        System.out.printf("profit = %.2f;\n", income*0.55);
    }
}
