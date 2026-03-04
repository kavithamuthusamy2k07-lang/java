import java.util.Scanner;

public class MobileDataBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: baseCost extraGB ratePerGB tax%
        System.out.print("Enter base cost: ");
        double baseCost = sc.nextDouble();

        System.out.print("Enter extra GB used: ");
        int extraGB = sc.nextInt();

        System.out.print("Enter rate per GB: ");
        double ratePerGB = sc.nextDouble();

        System.out.print("Enter tax percentage: ");
        double taxPercent = sc.nextDouble();

        // Calculate extra charges
        double extraCharges = extraGB * ratePerGB;

        // Subtotal before tax
        double subtotal = baseCost + extraCharges;

        // Tax amount
        double tax = subtotal * taxPercent / 100;

        // Final total bill
        double totalBill = subtotal + tax;

        System.out.printf("Total Bill = %.2f%n", totalBill);

        sc.close();
    }
}