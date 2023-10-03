package Q1.Prog52aCl;
import java.util.*;
public class prog52aCl {
    public static void main(String[] args) {
        // Input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        // Calculation section
        Cl52a wow = new Cl52a(l, w);
        wow.calc();

        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle area: " + perim);
    }
}
