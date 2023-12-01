package Q2.LP3_9Class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LP3_9Cl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Birthdate: ");
        System.out.println("Day: ");
        int d1 = input.nextInt();
        System.out.println("Month: ");
        int m1 = input.nextInt();
        System.out.println("Year: ");
        int y1 = input.nextInt();
        System.out.println("Enter Todays date: ");
        System.out.println("Day: ");
        int d2 = input.nextInt();
        System.out.println("Month: ");
        int m2 = input.nextInt();
        System.out.println("Year: ");
        int y2 = input.nextInt();

        Cl3_9 wow = new Cl3_9(d1, m1, y1, d2, m2, y2);
        wow.calc();

        int slept = wow.getSlept();
        int alive = wow.getAlive();


        System.out.println("You have been alive for: " + alive + " days");
        System.out.println("You have slept for: " + slept + " days");





    }
}
