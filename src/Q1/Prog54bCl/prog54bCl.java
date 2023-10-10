package Q1.Prog54bCl;
import Q1.Prog54bCl.Cl54b;

import java.util.*;
public class prog54bCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();
        System.out.print("Enter 4th number: ");
        int num4 = input.nextInt();

        // Calculation section
        Cl54b wow = new Cl54b(num1, num2, num3, num4);
        wow.calc();

        int Sum = (int) wow.getSum();
        double Average = wow.getAve();

        System.out.println("Sum: " + Sum);
        System.out.println("Average: " + Average);
    }
}
/*
Enter 1st number: 475
Enter 2nd number: 821
Enter 3rd number: 369
Enter 4th number: 562
Sum: 2227
Average: 556.75
 */