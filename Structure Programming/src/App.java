public class App {
    public static void main(String[] args) {
        displayCard("Zero", 2050, "Gold");
        System.out.println("****************");
        displayCard("Peter", 2500, "Silver");
        System.out.println("****************");
        displayCard("Marcus", 3500, "Diamond");
        System.out.println("****************");
        displayCard("Anna", 2000, "Platinum");
    }

    public static void displayCard(String name, double purchaseAmount, String type) {
        double discount = calculateDiscount(type, purchaseAmount);
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + (purchaseAmount - discount));
    }

    public static double calculateDiscount(String type, double purchaseAmount) {
        switch (type) {
            case "Gold":
                return purchaseAmount * 0.20;
            case "Silver":
                return purchaseAmount * 0.05;
            case "Platinum":
                return purchaseAmount * 0.25;
            case "Diamond":
                return purchaseAmount * 0.30;
            default:
                return 0;
        }
    }
}