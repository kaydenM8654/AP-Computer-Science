package Q1;
import java.util.*;
public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter number of eggs: ");
        int eggs = input.nextInt();
        System.out.println();
        double num = 0;
        int dozen = eggs / 12;

        if (dozen > 0 && dozen < 4) {
            num = 0.50;
        }else if (dozen >= 4 && dozen < 6) {
            num = 0.45;
        }else if (dozen >= 6 && dozen < 11) {
            num = 0.40;
        }else if (dozen >= 11) {
            num = 0.35;
        }else {
            System.out.println("Please enter valid number");
        }
        double equation2 = 0.83 * num;
        int extra = eggs - (dozen * 12);
        double equation = extra * (equation2);
        double ans = dozen * num + equation + equation2;
        System.out.println("The bill is to equal: $" + ans);
        System.out.println(equation);

    }
}
