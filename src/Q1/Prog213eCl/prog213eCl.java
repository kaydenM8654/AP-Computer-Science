package Q1.Prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213eCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));
            int num = 0;
            while (input.hasNext()) {
                num = input.nextInt();
                Cl213e wowsa = new Cl213e(num);
                wowsa.calc();
                int Dis = wowsa.getDis();
                double per = wowsa.getPer();
                String group = wowsa.getGroup();
                System.out.println("\nAge: " + num);
                System.out.println("Group: " + group);
                System.out.println("Distrubution: " + Dis);
                System.out.println("Percent: " + per);

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
