package Q1;
import java.util.*;
public class prog122d {
    public static void main(String[] args) {
        for (int lcv = -13; lcv < 16; lcv++) {
            int num = lcv + 1;
            int ans = (int) (Math.pow(num, 6) - (3 * Math.pow(num, 5)) - (93 * Math.pow(num, 4)) + (87 * Math.pow(num, 3)) + (1596 * Math.pow(num, 2)) - (1380 * num) - 2800);
            System.out.println("X = " + num + " Y = " + ans);
        }
    }
}
/*
X = -12 Y = 1897280
X = -11 Y = 982800
X = -10 Y = 453600
X = -9 Y = 173888
X = -8 Y = 45360
X = -7 Y = 0
X = -6 Y = -6400
X = -5 Y = 0
X = -4 Y = 6048
X = -3 Y = 7280
X = -2 Y = 4320
X = -1 Y = 0
X = 0 Y = -2800
X = 1 Y = -2592
X = 2 Y = 0
X = 3 Y = 2240
X = 4 Y = 0
X = 5 Y = -10800
X = 6 Y = -32032
X = 7 Y = -60480
X = 8 Y = -84240
X = 9 Y = -78400
X = 10 Y = 0
X = 11 Y = 217728
X = 12 Y = 671840
X = 13 Y = 1496880
X = 14 Y = 2872800
X = 15 Y = 5033600
X = 16 Y = 8276688
 */