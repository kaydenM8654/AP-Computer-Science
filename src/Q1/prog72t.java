package Q1;
import java.util.*;
public class prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1st time: ");
        int time1 = input.nextInt();
        System.out.println();

        System.out.print("Please enter 2nd time: ");
        int time2 = input.nextInt();
        System.out.println();
        int time37 = time1 / 100;
        int time38 = time2 / 100;
        int time39 = time2 - time38;
        int time40 = time1 - time37;
        int time35 = Math.max(time37, time38);
        int time36 = Math.min(time37, time38);
        int time3 = Math.abs(time35 - time36);
        int hours = (int) (24.00 - time3);
        int mins = (int) (24.00);
        System.out.println(hours);



    }
}
