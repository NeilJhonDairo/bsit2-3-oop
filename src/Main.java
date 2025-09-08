import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> items = new ArrayList<>();
        items.add("Burger");
        items.add("Fries");
        items.add("Pizza");

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(8.50);
        prices.add(3.25);

        Food order1 = new Food("Alice Johnson", items, prices);
        order1.displayInfo();

        Food order2 = new Food("Bob Smith", items, prices);
        order2.displayInfo();

        Food order3 = new Food("Charlie Brown", items, prices);
        order3.displayInfo();

        System.out.println("\nTotal books created: 3");
        System.out.println("Largest order: Bob Smith (32.45");
    }
}

