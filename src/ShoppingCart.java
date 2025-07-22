public class ShoppingCart {
    // Calculate total price with discounts
    public static double calculateTotal(double[] prices, String customerType)
    {
        double total = 0;
        // First, calculate sum of all prices using a loop
        // Then apply discount based on customer type using switch:
        // "REGULAR": no discount
        // "PREMIUM": 10% discount
        // "VIP": 20% discount
        for (double price : prices) {
            total += price;
        }
        switch (customerType) {
            case "REGULAR": break;
            case "PREMIUM":
                total = total - (total * 0.1);
                break;
            case "VIP":
                total = total - (total * 0.2);
                break;
            default:
                System.out.println("Invalid customer type! No discount.");
                break;
        }
        return total;
    }
    // Find most expensive item
    public static double findMostExpensive(double[] prices) {
        // Use loop to find highest price
        // Handle empty array
        if (prices.length == 0) {
            System.out.println("Empty array!");
            return 0.0;
        }
        double highestPrice = prices[0];
        for (double price : prices) {
            if (price > highestPrice) {
                highestPrice = price;
            }
        }
        return highestPrice;
    }
    // Count items above a certain price
    public static int countExpensiveItems(double[] prices, double threshold) {
        // Count how many items cost more than threshold
        int counter = 0;
        for (double price : prices) {
            if (price > threshold) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        // Test with different customer types
        System.out.println("Regular customer total: $" + calculateTotal(cart, "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart, "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart, "VIP"));
        // Find most expensive item
        System.out.println("The most expensive item: $" + findMostExpensive(cart));
        // Count items over $30
        double threshold = 30.0;
        System.out.println("The count of items above " + threshold + " : " + countExpensiveItems(cart, threshold));
    }
}