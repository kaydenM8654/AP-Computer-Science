package Q1;
import java.util.*;
public class prog88a {
    public static void main(String[] args) {
        // Math.random() * (max - min) + mn
        int num1 = (int)(Math.random() * (13 - 1))+ 1;
        int num2 = (int)(Math.random() * (20 - 2))+ 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int absdif = Math.abs(dif);
        int max, min;
        int prod = num1 * num2;
        int ave = num1 + num2 / 2;

        if (num1 > num2) {
            max = num1;

        } else {
            max = num2;
        }

        if (max == num1) {
            min = num2;

        } else {
            min = num1;
        }
        System.out.println("Original numbers are " + num1 + " and " + num2);

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("absolute value = " + absdif);
        System.out.println("Average = " + ave);
        System.out.println("Product = " + prod);


    }
}
/*
Maximum = 10
Minimum = 8
Sum = 18
Difference = 2
absolute value = 2
Average = 14
Product = 80
 */