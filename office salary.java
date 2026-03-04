import java.util.Scanner;

public class SalaryProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        int hra = sc.nextInt();
        int bonus = sc.nextInt();
        int tax = sc.nextInt();
        int pf = sc.nextInt();
        int takeHomeSalary = basic + hra + bonus - tax - pf;
        System.out.println("Take Home Salary = " + takeHomeSalary);

        sc.close();
    }
}