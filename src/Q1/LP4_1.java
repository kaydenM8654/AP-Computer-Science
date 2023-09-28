package Q1;
import java.util.*;
public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of copies: ");
        int num = input.nextInt();
        System.out.println();
        double ans = 0;

        if (num > 0 && num < 99) {
            ans = 0.30;

            
        }else if (num >= 100 && num < 500) {
            ans = 0.28;
        }else if (num >= 500 && num < 750) {
            ans = 0.27;
        }else if (num >= 750 && num < 1000) {
            ans = 0.26;
        }else if (num > 1000) {
            ans = 0.25;
        }else {
            System.out.println("Please enter valid number");
        }
        double equation = num * ans;
        System.out.println("Number of copies: " + num);
        System.out.println("Price per copy: $" + ans);
        System.out.println("Total cost: $" + equation);
    }
}
/*
Number of copies: 1001
Price per copy: $0.25
Total cost: $250.25

 */