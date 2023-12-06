package Q2.LP314Class;
import java.util.*;
public class LP314Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Election results for New york:");
        System.out.println("Aubrey: ");
        int ay = input.nextInt();
        System.out.println("Martinez: ");
        int my = input.nextInt();
        System.out.println();
        System.out.println("Election results for New Jersey:");
        System.out.println("Aubrey: ");
        int aj = input.nextInt();
        System.out.println("Martinez: ");
        int mj = input.nextInt();
        System.out.println();System.out.println("Election results for Connecticut:");
        System.out.println("Aubrey: ");
        int ac = input.nextInt();
        System.out.println("Martinez: ");
        int mc = input.nextInt();
        System.out.println();


        ClLP314 wow = new ClLP314(ay, my, aj, mj, ac, mc);
        wow.calc();

        int totalvote = wow.getTotalVote();
        int aubreytotal = wow.getAubreyTotal();
        int martineztotal = wow.getMartinezTotal();
        double aubreypercentage = wow.getAubreyPercentage();
        double martinezpercentage = wow.getMartinezPercentage();


        System.out.println("Candidate" + "             " + "Votes" + "  " + "Percentage");
        System.out.println("Aubrey" + "                " + aubreytotal + "      " + aubreypercentage);
        System.out.println("Martinez" + "              " + martineztotal + "    " + martinezpercentage);
        System.out.println("TOTAL VOTES:" + "          " + totalvote);

    }
}
