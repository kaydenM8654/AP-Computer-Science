package Q1;
import java.util.*;
public class prog122i {
    public static void main(String[] args) {
        for (int lcv = -26; lcv < 25; lcv++) {
            int num = lcv+1;
            int cubed = num * num * num;
            double cbrt = Math.cbrt(num);
            System.out.println("Number: " + num);
            System.out.printf("Cubed root: %.5f\n", cbrt);
            System.out.println("Cubed: " + cubed);
            System.out.println("");
            System.out.println("");
        }
    }
}
/*
Number: -25
Cubed root: -2.92402
Cubed: -15625


Number: -24
Cubed root: -2.88450
Cubed: -13824


Number: -23
Cubed root: -2.84387
Cubed: -12167


Number: -22
Cubed root: -2.80204
Cubed: -10648


Number: -21
Cubed root: -2.75892
Cubed: -9261


Number: -20
Cubed root: -2.71442
Cubed: -8000


Number: -19
Cubed root: -2.66840
Cubed: -6859


Number: -18
Cubed root: -2.62074
Cubed: -5832


Number: -17
Cubed root: -2.57128
Cubed: -4913


Number: -16
Cubed root: -2.51984
Cubed: -4096


Number: -15
Cubed root: -2.46621
Cubed: -3375


Number: -14
Cubed root: -2.41014
Cubed: -2744


Number: -13
Cubed root: -2.35133
Cubed: -2197


Number: -12
Cubed root: -2.28943
Cubed: -1728


Number: -11
Cubed root: -2.22398
Cubed: -1331


Number: -10
Cubed root: -2.15443
Cubed: -1000


Number: -9
Cubed root: -2.08008
Cubed: -729


Number: -8
Cubed root: -2.00000
Cubed: -512


Number: -7
Cubed root: -1.91293
Cubed: -343


Number: -6
Cubed root: -1.81712
Cubed: -216


Number: -5
Cubed root: -1.70998
Cubed: -125


Number: -4
Cubed root: -1.58740
Cubed: -64


Number: -3
Cubed root: -1.44225
Cubed: -27


Number: -2
Cubed root: -1.25992
Cubed: -8


Number: -1
Cubed root: -1.00000
Cubed: -1


Number: 0
Cubed root: 0.00000
Cubed: 0


Number: 1
Cubed root: 1.00000
Cubed: 1


Number: 2
Cubed root: 1.25992
Cubed: 8


Number: 3
Cubed root: 1.44225
Cubed: 27


Number: 4
Cubed root: 1.58740
Cubed: 64


Number: 5
Cubed root: 1.70998
Cubed: 125


Number: 6
Cubed root: 1.81712
Cubed: 216


Number: 7
Cubed root: 1.91293
Cubed: 343


Number: 8
Cubed root: 2.00000
Cubed: 512


Number: 9
Cubed root: 2.08008
Cubed: 729


Number: 10
Cubed root: 2.15443
Cubed: 1000


Number: 11
Cubed root: 2.22398
Cubed: 1331


Number: 12
Cubed root: 2.28943
Cubed: 1728


Number: 13
Cubed root: 2.35133
Cubed: 2197


Number: 14
Cubed root: 2.41014
Cubed: 2744


Number: 15
Cubed root: 2.46621
Cubed: 3375


Number: 16
Cubed root: 2.51984
Cubed: 4096


Number: 17
Cubed root: 2.57128
Cubed: 4913


Number: 18
Cubed root: 2.62074
Cubed: 5832


Number: 19
Cubed root: 2.66840
Cubed: 6859


Number: 20
Cubed root: 2.71442
Cubed: 8000


Number: 21
Cubed root: 2.75892
Cubed: 9261


Number: 22
Cubed root: 2.80204
Cubed: 10648


Number: 23
Cubed root: 2.84387
Cubed: 12167


Number: 24
Cubed root: 2.88450
Cubed: 13824


Number: 25
Cubed root: 2.92402
Cubed: 15625

 */