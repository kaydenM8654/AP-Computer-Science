package Q1;
import java.util.*;
public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter weight in kg: ");
        int kilo = input.nextInt();
        System.out.println();

        System.out.print("Please enter length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Please enter wid: ");
        int wid = input.nextInt();
        System.out.println();

        System.out.print("Please enter height: ");
        int high = input.nextInt();
        System.out.println();
        int ans = len * wid * high;




        if (kilo < 28 && ans < 100001) {
            System.out.println();
        }else if (kilo > 27 && ans < 100001) {
            System.out.println("Too heavy");
        }else if (kilo < 28 && ans > 100000) {
            System.out.println("Too Large");
        }else {
            System.out.println("Too large and too heavy");
        }



    }
}
/*
Please enter weight in kg: 32

Please enter length: 10

Please enter wid: 25

Please enter height: 38

Too heavy
 */