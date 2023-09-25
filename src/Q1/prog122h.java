package Q1;
import java.util.*;
public class prog122h {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 20; lcv++) {
            int num = lcv + 1;
            int sq = num * num;
            double sqrt = Math.sqrt(num);
            int cube = num * num * num;
            double fourth = Math.pow(num, 0.25);
            System.out.println("Number: " + num);
            System.out.println("Squared: " + sq);
            System.out.printf("square root: %.4f\n", sqrt);
            System.out.println("Cubed: " + cube);
            System.out.printf("4th root: %.4f\n", fourth);
            System.out.println("");
            System.out.println("");
        }
    }
}
/*
Number: 1
Squared: 1
square root: 1.0000
Cubed: 1
4th root: 1.0000


Number: 2
Squared: 4
square root: 1.4142
Cubed: 8
4th root: 1.1892


Number: 3
Squared: 9
square root: 1.7321
Cubed: 27
4th root: 1.3161


Number: 4
Squared: 16
square root: 2.0000
Cubed: 64
4th root: 1.4142


Number: 5
Squared: 25
square root: 2.2361
Cubed: 125
4th root: 1.4953


Number: 6
Squared: 36
square root: 2.4495
Cubed: 216
4th root: 1.5651


Number: 7
Squared: 49
square root: 2.6458
Cubed: 343
4th root: 1.6266


Number: 8
Squared: 64
square root: 2.8284
Cubed: 512
4th root: 1.6818


Number: 9
Squared: 81
square root: 3.0000
Cubed: 729
4th root: 1.7321


Number: 10
Squared: 100
square root: 3.1623
Cubed: 1000
4th root: 1.7783


Number: 11
Squared: 121
square root: 3.3166
Cubed: 1331
4th root: 1.8212


Number: 12
Squared: 144
square root: 3.4641
Cubed: 1728
4th root: 1.8612


Number: 13
Squared: 169
square root: 3.6056
Cubed: 2197
4th root: 1.8988


Number: 14
Squared: 196
square root: 3.7417
Cubed: 2744
4th root: 1.9343


Number: 15
Squared: 225
square root: 3.8730
Cubed: 3375
4th root: 1.9680


Number: 16
Squared: 256
square root: 4.0000
Cubed: 4096
4th root: 2.0000


Number: 17
Squared: 289
square root: 4.1231
Cubed: 4913
4th root: 2.0305


Number: 18
Squared: 324
square root: 4.2426
Cubed: 5832
4th root: 2.0598


Number: 19
Squared: 361
square root: 4.3589
Cubed: 6859
4th root: 2.0878


Number: 20
Squared: 400
square root: 4.4721
Cubed: 8000
4th root: 2.1147

 */