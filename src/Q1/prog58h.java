package Q1;

import java.util.Scanner;

public class prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Amount: ");
        double Amount = input.nextDouble();
        System.out.println();
        // This is P
        System.out.print("Please enter rate of interest: ");
        double interest = input.nextDouble();
        System.out.println();
        // This is R
        System.out.print("Please enter number of days compounded per year: ");
        double per_year = input.nextDouble();
        System.out.println();
        // This is N
        System.out.print("Please enter the amount of days that the money has been in the savings account: ");
        double total_days = input.nextDouble();
        System.out.println();
        // This is t
        double interest_conversion = interest / 100;

        double interest_a = Amount * interest_conversion;
        double interest_earned = Amount * (1 + (Math.pow(.01 * interest_conversion/ per_year, per_year * total_days)/ 365));
        double Total_amount = Amount + interest_earned;

        System.out.println("Money originally put in savings = " + Amount);
        System.out.println("Rate of interest = " + interest+ "%");
        System.out.println("number of days compounded per year = " + per_year);
        System.out.println("Number of days money has been in savings account = " + total_days);
        System.out.println();
        System.out.println("the amount of interest earned is " + interest_earned);
        System.out.println("The amount currently in the account is " + Total_amount);
        System.out.println(interest_conversion);
        System.out.println(interest_a);
        System.out.println(interest_earned);
        System.out.println(Amount);


    }
}
