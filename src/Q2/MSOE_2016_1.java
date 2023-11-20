package Q2;
import java.util.*;
public class MSOE_2016_1 {
    public static void main(String[] args) {
        Scanner palin = new Scanner(System.in);
        System.out.println("Please enter lowercase word");
        String word = palin.nextLine();


        boolean same = true;
        for (int lcv = 0; lcv < word.length(); lcv ++) {
            if (lcv != word.length() - 1) {
                same = false;
            }
        }
        System.out.println("is the array palidromic? " + same);
    }

}
