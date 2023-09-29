package Q1;
import java.util.*;
public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter angle in degrees: ");
        int angle = input.nextInt();
        System.out.println();
        double rad = Math.toRadians(angle);

        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        double sin1 = Math.round(sin * 100.0)/ 100.0;


        System.out.println("Sine: " + sin1);
        System.out.printf("Cosine: %.3f\n", cos);
        System.out.printf("Tan: %.3f\n", tan);
    }
}
/*
Please enter angle in degrees: 30

Sine: 0.5
Cosine: 0.866
Tan: 0.577
 */