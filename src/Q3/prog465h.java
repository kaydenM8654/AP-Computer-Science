package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            int[][] mat = new int[5][6];
            int temp = 0;
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();


                }

            }
            for (int row = 0; row < mat.length; row++){
                for (int col = 0; col < mat[0].length; col++){
                    if (mat)
                }
            }
        }catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
