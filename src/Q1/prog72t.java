package Q1;
import java.util.*;
public class prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1st time: ");
        int time1 = input.nextInt();
        System.out.println();

        System.out.print("2nd time: ");
        int time2 = input.nextInt();
        System.out.println();





        int math1 = (time1 - time2);
        int math2 = 0;



        if (math1 < 0) {
            math2 = 2400 - Math.abs(math1);
        }
        int math2 = 2400 - math1;

        int math3 = math2 /60;

        int math4 = math2 - (math3 * 60);



        System.out.println(math3 + " Hours " + math4 + " Minutes");
        System.out.println(math3);
        System.out.println(math1);
        System.out.println(math2);
        System.out.println(math4);
    }
}
