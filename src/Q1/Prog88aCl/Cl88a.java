package Q1.Prog88aCl;
import java.util.*;
public class Cl88a {
    private int num1;
    private int num2;
    private int sum;
    private int diff;
    private int prod;
    private double ave;
    private int dis;
    private int max;

    private int min;

    public Cl88a(int n1, int n2) {
        // Set up private data
        num1 = n1;
        num2 = n2;
        sum = 0;
        diff = 0;
        prod = 0;
        ave = 0;
        dis= 0;
        max = 0;
        min = 0;

    }

    public void calc() {
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        ave = sum / 2;
        dis = Math.abs(diff);
        if (num1 > num2) {
            max = num1;

        } else {
            max = num2;
        }

        if (max == num1) {
            min = num2;

        } else {
            min = num1;
        }

    }

    public int getSum() { return sum; }
    public int getDiff() { return diff; }
    public int getProd() { return prod; }
    public double getAve() { return ave; }
    public int getDis() { return dis; }
    public int getMax() { return max; }
    public int getMin() { return min; }
}
