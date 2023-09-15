package Q1;
import java.util.*;
import java.util.Scanner;

public class prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter A: ");
        double A = input.nextDouble();
        System.out.println();

        System.out.print("Please enter B: ");
        double B = input.nextDouble();
        System.out.println();

        System.out.print("Please enter C: ");
        double C = input.nextDouble();
        System.out.println();

        double r = (-B + Math.sqrt(B*B - 4*A*C))/ 2 * A;
        double r2 = (-B - Math.sqrt(B*B - 4*A*C))/ 2 * A;

        System.out.println("Roots: " + r +"," + r2);





    }
}
/*
Please enter A: 1

Please enter B: 5

Please enter C: 6

Roots: -2.0,-3.0

 */