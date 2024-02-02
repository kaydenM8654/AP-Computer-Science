package Q3;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat"));
            int fcount = 0;
            int mcount = 0;
            int fA = 0;
            int fB = 0;
            int fC = 0;
            int fD = 0;
            int fF = 0;
            int mA = 0;
            int mB = 0;
            int mC = 0;
            int mD = 0;
            int mF = 0;


            int num  = input.nextInt();
            int grade = input.nextInt();
            for (int i = 0; i < 33 + 1; i ++) {
                if(num == 1 && grade == 1){
                    mA += 1;
                }
            }
            mcount = mA + mB + mC + mD + mF;
            fcount = fA + fB + fC + fD + fF;
            System.out.println(mcount);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
