package Q1.Prog54cCl;
import Q1.Prog54cCl.Cl54c;

import java.util.*;

public class prog54cCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = input.nextDouble();


        // Calculation section
        Cl54c wow = new Cl54c(r);
        wow.calc();

        double area = wow.getArea();
        double circ = wow.getCirc();
        System.out.println("Radius: " + r);
        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumference: %.3f\n", circ);
    }
}
/*
Enter Radius: 3.712
Radius: 3.712
Area: 43.288
Circumference: 23.323

 */