import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: tuitionFees scholarship% examFee libraryFee
        System.out.print("Enter tuition fees: ");
        double tuitionFees = sc.nextDouble();

        System.out.print("Enter scholarship percentage: ");
        double scholarshipPercent = sc.nextDouble();

        System.out.print("Enter exam fee: ");
        double examFee = sc.nextDouble();

        System.out.print("Enter library fee: ");
        double libraryFee = sc.nextDouble();

        // Apply scholarship
        double discountedTuition = tuitionFees - (tuitionFees * scholarshipPercent / 100);

        // Add exam and library fees
        double finalPayableFee = discountedTuition + examFee + libraryFee;

        System.out.printf("Final Payable Fee = %.2f%n", finalPayableFee);

        sc.close();
    }
}