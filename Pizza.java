// Chap 3 Extra
// Starting Price for a pizza is 13.99
// Toppings cost .50 cents each

public class Pizza {
    // Variables
    private String custName;
    private double price;
    private int numToppings;

    // Default Constructor
    public Pizza() {
        custName = "Customer";
        price = 13.99;
        numToppings = 0;
    }

    public static void intro() {
        System.out.println("**************************************");
        System.out.println("**Welcome to the Digital Pizza Shop!**");
        System.out.println("**************************************");
    }

    public void enterName(String name) {
        custName = name;
    }

    public void addToppings(int num) {
        numToppings = num;
    }

    public void calcPrice() {
        price = price + (numToppings * .50);
    }

    public void summary() {
        System.out.println();
        System.out.println("Thank you, " + custName + "!");
        System.out.println("A pizza with " + numToppings + " topping(s) will cost $" + price);
    }
}
