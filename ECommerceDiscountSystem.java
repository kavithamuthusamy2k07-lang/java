import java.util.Scanner;

public class ECommerceDiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String loyaltyTier = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine(); // consume newline
        String productCategory = sc.nextLine();
        String membershipStatus = sc.nextLine();

        int baseDiscount = 0;
        int additionalDiscount = 0;

        // Base Discount based on loyalty tier
        if (loyaltyTier.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else if (loyaltyTier.equalsIgnoreCase("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyTier.equalsIgnoreCase("Gold")) {
            baseDiscount = 12;
        } else if (loyaltyTier.equalsIgnoreCase("Platinum")) {
            baseDiscount = 15;
        }

        // Additional Discount based on membership and product category
        if (membershipStatus.equalsIgnoreCase("Prime")) {
            if (productCategory.equalsIgnoreCase("Electronics")) {
                additionalDiscount = 10;
            } else if (productCategory.equalsIgnoreCase("Fashion")) {
                additionalDiscount = 8;
            } else if (productCategory.equalsIgnoreCase("Groceries")) {
                additionalDiscount = 5;
            } else if (productCategory.equalsIgnoreCase("Books")) {
                additionalDiscount = 7;
            }
        } else { // Regular membership
            if (productCategory.equalsIgnoreCase("Electronics")) {
                additionalDiscount = 5;
            } else if (productCategory.equalsIgnoreCase("Fashion")) {
                additionalDiscount = 3;
            } else if (productCategory.equalsIgnoreCase("Groceries")) {
                additionalDiscount = 2;
            } else if (productCategory.equalsIgnoreCase("Books")) {
                additionalDiscount = 3;
            }
        }

        int totalDiscount = baseDiscount + additionalDiscount;
        double finalPrice = cartValue * (1 - totalDiscount / 100.0);
        double savings = cartValue - finalPrice;

        // Output
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        sc.close();
    }
}