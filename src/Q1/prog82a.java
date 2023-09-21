package Q1;
import java.util.*;
public class prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vehicle speed: ");
        int speed = input.nextInt();
        System.out.println();

        System.out.print("Speed limit: ");
        int speed_l = input.nextInt();
        System.out.println();

        int math = speed - speed_l;
        double ticket = 20.00 + (math * 5.00);

        System.out.println("Fine = " + ticket);


    }
}
/*
Vehicle speed: 42

Speed limit: 30

Fine = 80.0
 */