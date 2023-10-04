package Q1;
import java.util.*;
public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter weight in kg: ");
        String str = String.valueOf(input.nextInt());
        System.out.println();

        String first = str.substring(0,1);
        System.out.println(first);

        for (int lcv = Integer.parseInt(first);;) {
            int next = Integer.parseInt(first + 1);
            System.out.println(next);
        }




    }
}
