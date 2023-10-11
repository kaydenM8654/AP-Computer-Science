package Q1.Prog88aCl;

import Q1.Prog88aCl.Cl88a;

import java.util.*;

public class prog88aCl {
    public static void main(String[] args) {
        // Input section
        int n1 = (int)(Math.random() * (13 - 1))+ 1;
        int n2 = (int)(Math.random() * (20 - 2))+ 2;


        // Calculation section
        Cl88a wow = new Cl88a(n1, n2);
        wow.calc();

        int Sum = wow.getSum();
        int diff = wow.getDiff();
        int prod = wow.getProd();
        int dis = wow.getDis();
        int Max = wow.getMax();
        int Min = wow.getMin();
        double ave = wow.getAve();

        System.out.println("1st number: " + n1);
        System.out.println("2nd number: " + n2);
        System.out.println("Sum: " + Sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Average: " + ave);
        System.out.println("Distance: " + dis);
        System.out.println("Maximum: " + Max);
        System.out.println("Minimum: " + Min);


    }
}
/*
1st number: 1
2nd number: 15
Sum: 16
Difference: -14
Product: 15
Average: 8.0
Distance: 14
Maximum: 15
Minimum: 1
 */