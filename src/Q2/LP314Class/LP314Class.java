package Q2.LP314Class;
import java.util.*;
import java.util.function.DoubleFunction;

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

        double totalvote = wow.getTotalVote();
        double aubreytotal = wow.getAubreyTotal();
        double martineztotal = wow.getMartinezTotal();
        double aubreypercentage = wow.getAubreyPercentage();
        double martinezpercentage = wow.getMartinezPercentage();


        System.out.println("Candidate        Votes     percentage");
        System.out.printf("Aubrey       ", aubreytotal, aubreypercentage);



    }
}
