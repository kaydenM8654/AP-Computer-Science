package Q1;
import java.util.*;
public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length: ");
        double l = input.nextDouble();


        System.out.print("Please enter width: ");
        double w = input.nextDouble();


        System.out.print("Please enter height: ");
        double h = input.nextDouble();


        double v = l * w * h;
        System.out.print("Volume = " + v);
        System.out.println();
        System.out.println();

        System.out.print("Please enter radius: ");
        double r = input.nextDouble();

        double d = r * 2;
        double v1 = (Math.pow(d, 3) * 3.14) / 6;

        System.out.print("Volume = " + v1);
        System.out.println();
        System.out.println();

        System.out.print("Please enter length of each side: ");
        double s = input.nextDouble();

        double v2 = s * s * s;
        System.out.println("Volume = " + v2);






    }
}
/*
Please enter length: 3
Please enter width: 4
Please enter height: 5
Volume = 60.0

Please enter radius: 3
Volume = 113.04

Please enter length of each side: 4
Volume = 64.0

 */