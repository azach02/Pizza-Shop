import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        String customer;
        int toppings;
        Scanner input = new Scanner(System.in);
        Pizza pizza1 = new Pizza();
        // Input
        Pizza.intro();
        System.out.println("Type a name for the order: ");
        customer = input.nextLine();
        System.out.println("Number of Toppings?: ");
        toppings = input.nextInt();
        // Processing
        pizza1.enterName(customer);
        pizza1.addToppings(toppings);
        pizza1.calcPrice();
        // Output
        pizza1.summary();
        System.out.println("Pizza Time");
    }
}
