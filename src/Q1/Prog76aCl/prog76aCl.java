package Q1.Prog76aCl;

import Q1.Prog54cCl.Cl54c;

import java.util.Scanner;

public class prog76aCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1-9: ");
        int a = input.nextInt();


        // Calculation section
        Cl76a wow = new Cl76a((int) a);
        wow.calc();

        int Math1 = wow.getMath1();
        int math2 = wow.getMath2();
        System.out.println(a);
        System.out.println("X " + "9");
        System.out.println("---------------------------------");
        System.out.println(Math1);
        System.out.println("x " + "12345679");
        System.out.println("---------------------------------");
        System.out.println(math2 + " Surprise!");
    }
}
/*
Enter Number 1-9: 7
7
X 9
---------------------------------
63
x 12345679
---------------------------------
777777777 Surprise!

 */