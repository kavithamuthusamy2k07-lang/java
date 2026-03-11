import java.util.*;

public class CorporateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePrice = 0;

        // Base price per sq ft
        if(locationTier.equals("Prime")){
            basePrice = 400;
        }
        else if(locationTier.equals("Urban")){
            basePrice = 300;
        }
        else if(locationTier.equals("Suburban")){
            basePrice = 180;
        }
        else if(locationTier.equals("Rural")){
            basePrice = 100;
        }

        double baseValue = squareFootage * basePrice;

        // Age adjustment
        int ageAdjustment = 0;

        if(propertyAge <= 5){
            ageAdjustment = 0;
        }
        else if(propertyAge <= 10){
            ageAdjustment = -5;
        }
        else if(propertyAge <= 15){
            ageAdjustment = -10;
        }
        else if(propertyAge <= 30){
            ageAdjustment = -15;
        }
        else{
            ageAdjustment = -25;
        }

        double adjustedValue = baseValue * (1 + ageAdjustment / 100.0);

        // Amenity bonus
        double amenityBonus = 0;

        if(amenityScore >= 80){
            amenityBonus = baseValue * 0.10;
        }
        else if(amenityScore >= 60){
            amenityBonus = baseValue * 0.05;
        }
        else if(amenityScore >= 40){
            amenityBonus = baseValue * 0.02;
        }
        else{
            amenityBonus = 0;
        }

        double finalValue = adjustedValue + amenityBonus;

        // Market category
        String marketCategory;

        if((locationTier.equals("Prime") || locationTier.equals("Urban")) && propertyAge < 15){
            marketCategory = "Hot";
        }
        else if(locationTier.equals("Suburban")){
            marketCategory = "Stable";
        }
        else{
            marketCategory = "Slow";
        }

        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePrice);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);
    }
}
