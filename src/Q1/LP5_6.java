package Q1;
import java.util.*;
public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter Number: ");
        int num = input.nextInt();
        System.out.println();

        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num/ 10;

        }
        System.out.println("Sum: " + sum);

    }
}
/*
Please enter Number: 829

Sum: 19

 */