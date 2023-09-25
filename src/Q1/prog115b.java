package Q1;
import java.util.*;
public class prog115b {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 36; lcv++) {
            int num = lcv + 1;
            if (num%2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
