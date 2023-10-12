package Q1.Prog93aCl;

import Q1.Prog93aCl.Cl93a;

import java.util.Scanner;

public class prog93aCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Kilowatts used: ");
        int kw = input.nextInt();


        // Calculation section
        Cl93a wow = new Cl93a((int) kw);
        wow.calc();

        double base = wow.getBase();
        double surcharge = wow.getSurcharge();
        double citytax = wow.getCitytax();
        double total = wow.getTotal();
        double latetotal = wow.getLatetotal();
        double latetotal1 = wow.getLatetotal1();
        System.out.println("Kilowatts used: " + kw);
        System.out.printf("Base Rate: $%.2f\n", base);
        System.out.println("Surcharge: $" + surcharge);
        System.out.println("CityTax: $" + citytax);
        System.out.printf("Pay this amount: $%.2f\n", total);
        System.out.printf("After May 20th Pay: $%.2f\n", latetotal1);

    }
}
/*

Enter Kilowatts used: 993
Kilowatts used: 993
Base Rate: $47.17
Surcharge: $4.72
CityTax: $1.42
Pay this amount: $53.31
After May 20th Pay: $55.44
 */