package Q1.Prog82aCl;

import Q1.Prog82aCl.Cl82a;

import java.util.Scanner;

public class prog82aCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int s = input.nextInt();
        System.out.print("Enter speed limit: ");
        int sl = input.nextInt();


        // Calculation section
        Cl82a wow = new Cl82a(s, sl);
        wow.calc();

        int Math1 = wow.getMath();
        double ticket = wow.getTicket();

        System.out.println("Speed: " + s);
        System.out.println("Speed limit: " + sl);
        System.out.printf("Fine: $ %.2f\n", ticket);

    }
}
/*
Enter speed: 42
Enter speed limit: 30
Speed: 42
Speed limit: 30
Fine: $ 80.00

 */