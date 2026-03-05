import java.util.Scanner;

public class DeliveryEarningsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deliveries = sc.nextInt();
        double payout = sc.nextDouble();
        double incentive = sc.nextDouble();
        double fuelCost = sc.nextDouble();

        double earnings = (deliveries * payout) + incentive - fuelCost;

        System.out.println("Driver Earnings = " + (int)earnings);
    }
}