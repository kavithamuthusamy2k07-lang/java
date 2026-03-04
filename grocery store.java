import java.util.Scanner;

public class GroceryStoreSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: sales discount% gst%
        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double gstPercent = sc.nextDouble();

        // Apply discount
        double discountedSales = sales - (sales * discountPercent / 100);

        // Apply GST
        double gstAmount = discountedSales * gstPercent / 100;
        double finalRevenue = discountedSales + gstAmount;

        System.out.printf("Final Revenue = %.2f%n", finalRevenue);

        sc.close();
    }
}