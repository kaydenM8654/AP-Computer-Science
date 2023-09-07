package Q1;
import java.util.*;
public class prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius: ");
        double rad = input.nextDouble();
        System.out.println();

        double pi = 3.14159;

        double area = pi * rad * rad;
        double circ = 2 * pi * rad;

        System.out.println("area of circle = " + area);
        System.out.println("circumference = " + circ);
    }
}
