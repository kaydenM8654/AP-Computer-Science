package Q1;
import java.util.*;
import java.util.Scanner;

public class prog58t {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount received: ");
        double Amount_r = input.nextDouble();
        System.out.println();

        System.out.print("Enter purchase price: ");
        double Purchase_p = input.nextDouble();
        System.out.println();

        double change = Amount_r - Purchase_p;

        int dollars = (int) (change / 1);

        double change1 = (change - dollars);

        int quarters = (int) (change1 / 0.25);

        double change2 = (change1 - (quarters * 0.25));

        int dimes = (int) (change2 / 0.10);

        double change3 = (change2 - (dimes * 0.10));

        int nickels = (int) (change3 / 0.05);

        double change4 = (change3 - (nickels * 0.05));

        int pennies = (int) (change4 / 0.01);
        System.out.println("Change due: " + change);


        System.out.println(dollars);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);


    }
}