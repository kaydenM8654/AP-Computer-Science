package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));
            int haybales = input.nextInt();
            double hayCost = input.nextDouble();
            int corncob = input.nextInt();
            double cornCost = input.nextDouble();
            int cowsCount = input.nextInt();
            for(int i = 0;)
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
