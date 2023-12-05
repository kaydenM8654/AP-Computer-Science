package Q2.LP3_10Class;
import java.util.*;
public class LP3_10Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of burgers: ");
        double b = input.nextDouble();
        System.out.println("Enter number of fries: ");
        double f = input.nextDouble();
        System.out.println("Enter number of sodas: ");
        double s = input.nextDouble();
        System.out.println();

        ClLP3_10 wow = new ClLP3_10(b, f, s);
        wow.calc();

        double total = wow.getTotal();
        double ttotal = wow.getTtotal();
        double tax = wow.getTax();
        double mathtotal = wow.getMathtotal();

        System.out.println("Your total before tax is: $" + String.format("%.2f", total));
        System.out.println("Tax: $" + String.format("%.2f", mathtotal));
        System.out.println("Your total after tax is: $" + String.format("%.2f", ttotal));
    }
}
/*
Enter number of burgers:
2
Enter number of fries:
5
Enter number of sodas:
5

Your total before tax is: $13.78
Tax: $0.90
Your total after tax is: $14.68

 */
