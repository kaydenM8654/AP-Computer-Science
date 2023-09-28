package Q1;

import java.util.Scanner;

public class prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Amount: ");
        double P = input.nextDouble();
        System.out.println();
        // This is P
        System.out.print("Please enter rate of interest: ");
        double R = input.nextDouble();
        System.out.println();
        // This is R
        System.out.print("Please enter number of days compounded per year: ");
        double N = input.nextDouble();
        System.out.println();
        // This is N
        System.out.print("Please enter the amount of days that the money has been in the savings account: ");
        double t = input.nextDouble();
        System.out.println();
        // This is t
        double interest_conversion = R / 100;
        double equat1 = .01 * R;


        double interest_a = P * interest_conversion;
        double interest_earned = 5000 * ((1 + (Math.pow((.01 * 11.5)/365,  (365 * 900) / 365))));
        double Total_amount = P + interest_earned;

        System.out.println("Money originally put in savings = " + P);
        System.out.println("Rate of interest = " + R + "%");
        System.out.println("number of days compounded per year = " + N);
        System.out.println("Number of days money has been in savings account = " + t);
        System.out.println();
        System.out.println("the amount of interest earned is " + interest_earned);
        System.out.println("The amount currently in the account is " + Total_amount);
        System.out.println(interest_conversion);
        System.out.println(interest_a);
        System.out.println(interest_earned);
        System.out.println(P);


    }
}
