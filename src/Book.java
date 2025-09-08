import java.util.ArrayList;

public class Food {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;

    public Food(String customerName, ArrayList<String> items, ArrayList<Double> prices) {
        this.customerName = customerName;
        this.items = items;
        this.prices = prices;
        totalOrders++;
    }

    public String getTitle() {
        return customerName;
    }

    public void displayInfo() {
        String ratingLevel = getTotalLevel();
        System.out.println("Order for: " + customerName + ", Items: " + items + ", Total Orders: " + totalOrders + ", Order Size: " + ratingLevel);
    }

    public void setPrices(double price) {
        if (price >= 1 && price <= 5) {
            prices.add(price);
            System.out.println("Item priced " + price + " added successfully.");
        } else {
            System.out.println("Error: Invalid price. Must be between 1 and 5.");
        }
    }

    private String getTotalLevel() {

        double averagePrice = prices.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        if (averagePrice >= 4.0) {
            return "Large";
        } else if (averagePrice >= 3.0) {
            return "Medium";
        } else {
            return "Small";
        }
    }
}
