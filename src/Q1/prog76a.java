package Q1;
import java.util.*;
public class prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter any single digit number: ");
        int Amount = input.nextInt();
        System.out.println();

        int math1 = (int) (Amount * 9);
        int math2 = (int) (math1 * 12345679);

        System.out.println(Amount);
        System.out.println("X " + "9");
        System.out.println("---------------------------------");
        System.out.println(math1);
        System.out.println("x " + "12345679");
        System.out.println("---------------------------------");
        System.out.println(math2 + " Surprise!");

    }
}
/*
please enter any single digit number: 5

5
X 9
---------------------------------
45
x 12345679
---------------------------------
555555555 Surprise!

Process finished with exit code 0

 */