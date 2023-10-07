package Q1;

import java.util.Random;

public class LP5_14 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int sum = 0;
        Random random = new Random();
        System.out.println("Dice1      Dice2      total");
        for (int lcv = 0; lcv < 5; lcv++) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.print(dice1);
            System.out.print("          ");
            System.out.print(dice2);
            System.out.print("             ");
            System.out.print(sum);
            System.out.println();
        }


    }
}
/*
Dice1      Dice2      total
2          6             8
1          3             4
6          1             7
2          3             5
2          5             7

 */