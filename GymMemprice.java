import java.util.Scanner;
public class GymMemprice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String membership=sc.nextLine();
        int contractMonths=sc.nextInt();
        sc.nextLine();
        String addsOn=sc.nextLine();

        int discountedBase=0;
        int baseFee=0;
        int contractDiscount=0;
        int monthlyTotal=0;
        sc.nextLine();
        String access="";
        int accessFee=0;
        sc.nextLine();
        String addOn="";
        int addOnFee=0;
        int ContractMonths=0;
        int contractTotal=0;
        int savings=0;
        String membershipCategory="";
        //discount base
        if(membership.equals("Basic")){
           baseFee=40;
           membershipCategory="Budjet";
        }
        else if(membership.equals("Premium")){
           baseFee=80;
           membershipCategory="Standard";
        }
        else if(membership.equals("Elite")){
           baseFee=120;
           membershipCategory="Premium";
        }
        else if(membership.equals("VIP")){
           baseFee=150;
           membershipCategory="Luxury";
        }

        //contract month
        if(contractMonths<=1){
            contractMonths=1;
            contractDiscount=0;
        }
        else if(contractMonths>1&&contractMonths<=6){
            contractMonths=6;
            contractDiscount=10;
        }
         else if(contractMonths>6&&contractMonths<=12){
           contractMonths=12; 
          contractDiscount=15;
         }
         else if(contractMonths>12&&contractMonths<=24){
            contractMonths=24;
            contractDiscount=25;
         }
         //access fee
         if(access.equals("Single-location")){
           accessFee=0;
         }
         else if(access.equals("Regional")){
           accessFee=20;
         }
         else if(access.equals("Nationwide")){
            accessFee=50;
        }
        //addOnFee
         if(addOn.equals("None")){
             addOnFee=0;
        }
         else  if(addOn.equals("Personal-training")){
             addOnFee=100;
        }
         else  if(addOn.equals("Classes")){
             addOnFee=50;
        }
        else  if(addOn.equals("Full-package")){
             addOnFee=200;
        }

        //discounted Base
        discountedBase=baseFee*(1-(contractDiscount)/100);
        monthlyTotal=(discountedBase+accessFee+addOnFee);
        contractTotal=monthlyTotal*contractMonths;
        savings=(baseFee+accessFee+addOnFee)*contractMonths-contractTotal;
       
        System.out.println("Membership Tier: "+membership);
         System.out.println("Contract Length: "+contractMonths);
         System.out.println("Access Level"+access);
         System.out.println("Adds-On: "+addOn);
         System.out.println("Base Monthly Fee:$" +baseFee);
         System.out.println("Contract Discount: "+contractDiscount+"%");
         System.out.println("Access Fee:$"+accessFee);
         System.out.println("Adds-On Fee:$ "+addOnFee);
         System.out.println("Monthly Total:$ "+monthlyTotal);
         System.out.println("Contract Total:$"+contractTotal);
         System.out.println("Savings vs Month-Month:$"+savings);
         System.out.println("Membership Category: "+membershipCategory);
         sc.close(); 

    }
}

