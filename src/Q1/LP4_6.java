package Q1;
import java.util.*;
public class LP4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);






        Random r = new Random();
        Random rand = new Random();

        int A = 10;
        int B = 1;
        char operator ='?';
        double value = 0;

        int rand_int1 = rand.nextInt(11);
        int rand_int2 = rand.nextInt(11);

        int max = Math.max(rand_int1, rand_int2);
        int min = Math.min(rand_int1, rand_int2);



        switch (r.nextInt(4)){
            case 0: operator = '+';
                value = max+min;
                break;
            case 1: operator = '-';
                value = max-min;;
                break;
            case 2: operator = '*';
                value = max*min;;
                break;
            case 3: operator = '/';
                value = max/min;;
                break;
            default: operator = '?';
        }

        System.out.print(max);
        System.out.print(" ");
        System.out.print(operator);
        System.out.print(" ");
        System.out.print(min);
        System.out.print(" = ");
        double ans = input.nextDouble();

        if (ans == value) {
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect. The answer was " + value);
        }





    }
}
/*
8 - 5 = 3
Correct

 */