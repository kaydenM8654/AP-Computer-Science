package Q1;
import java.util.*;
public class prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Please enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Please enter 3rd number: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Please enter 4th number: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num1 + num2 + num3 + num4;
        double average = sum / 4.0;



        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);


    }
}
/*
Please enter 2nd number: 821

Please enter 3rd number: 369

Please enter 4th number: 562

Sum = 2227
Average = 556.75
 */