package Q3.AbstCLab;
import java.util.*;
public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Circle
        System.out.print("Enter circle radius: ");
        double r = kbd.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter height: ");
        double rh = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rw = kbd.nextDouble();
        Shape sh2 = new rectangle(rh, rw);
        // triangle
        System.out.print("enter triangle base: ");
        double tb =kbd.nextDouble();
        System.out.print("Enter triangle height");
        double th = kbd.nextDouble();
        Shape sh3 = new triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();

        ((triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();
    }
}
