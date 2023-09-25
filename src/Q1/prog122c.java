package Q1;
import java.util.*;
public class prog122c {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 10; lcv++) {
            int num = lcv + 1;
            if (num%2 == 0) {
                int add = num + 1;
                int doub = num * 2;
                int sqared = num * num;
                System.out.println("Number: " + num + " Pattern1: " + add + " Pattern2: " + doub + " Pattern3: " + sqared);
            }

        }
    }
}
/*
Number: 2 Pattern1: 3 Pattern2: 4 Pattern3: 4
Number: 4 Pattern1: 5 Pattern2: 8 Pattern3: 16
Number: 6 Pattern1: 7 Pattern2: 12 Pattern3: 36
Number: 8 Pattern1: 9 Pattern2: 16 Pattern3: 64
Number: 10 Pattern1: 11 Pattern2: 20 Pattern3: 100
 */