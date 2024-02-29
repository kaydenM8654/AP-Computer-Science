package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));
           int hay = input.nextInt();
           double hayCost = input.nextDouble();
           int corn = input.nextInt();
           double cornCost = input.nextDouble();
           int cowCount = input.nextInt();
           int[][] Cows = new int[4][cowCount];
           for(int r = 0; r < Cows.length; r++){
               for(int c = 0; c < Cows[0].length; c++){
                   Cows[r][c] = input.nextInt();
               }
           }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
