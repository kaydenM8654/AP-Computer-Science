package Q1;
import java.util.*;
public class LP5_9 {
    public static void main(String[] args) {
        var pow1 = 0;
        var pow2 = 0;
        var pow3 = 0;
        var pow4 = 0;
        var pow5 = 0;
        System.out.println("x^1 x^2 x^3 x^4 x^5");
        for (int lcv = 1; lcv < 7; lcv++) {
            pow1 = (int) Math.pow(lcv, 1);
            pow2 = (int) Math.pow(lcv, 2);
            pow3 = (int) Math.pow(lcv, 3);
            pow4 = (int) Math.pow(lcv, 4);
            pow5 = (int) Math.pow(lcv, 5);
            System.out.print(pow1 + "   ");
            System.out.print(pow2 + "   ");
            System.out.print(pow3 + "   ");
            System.out.print(pow4 + "   ");
            System.out.print(pow5);
            System.out.println();

        }
    }
}
/*
x^1 x^2 x^3 x^4 x^5
1   1   1   1   1
2   4   8   16   32
3   9   27   81   243
4   16   64   256   1024
5   25   125   625   3125
6   36   216   1296   7776
 */