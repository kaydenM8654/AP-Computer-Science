package Q1;
import java.util.*;
public class  LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number 1 through 20: ");
        int ans = input.nextInt();
        System.out.println("");

        Random rand = new Random();



        int rand_int1 = rand.nextInt(21);
        System.out.println("Secret Number: " + rand_int1);
        System.out.println("Player number: " + ans);
        if (ans == rand_int1) {
            System.out.println("You Won!");
        }else {
            System.out.println("Better luck next time.");
        }
    }
}
/*
Please enter number 1 through 20: 17

Secret Number: 15
Player number: 17
Better luck next time.
 */