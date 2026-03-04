import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: totalBill service% gst% numberOfPeople
        System.out.print("Enter total bill amount: ");
        double totalBill = sc.nextDouble();

        System.out.print("Enter service charge percentage: ");
        double servicePercent = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double gstPercent = sc.nextDouble();

        System.out.print("Enter number of people: ");
        int numberOfPeople = sc.nextInt();

        // Apply service charge
        double serviceCharge = totalBill * servicePercent / 100;
        double afterService = totalBill + serviceCharge;

        // Apply GST
        double gstAmount = afterService * gstPercent / 100;
        double finalBill = afterService + gstAmount;

        // Split equally
        double amountPerPerson = finalBill / numberOfPeople;

        System.out.printf("Amount Per Person = %.2f%n", amountPerPerson);

        sc.close();
    }
}