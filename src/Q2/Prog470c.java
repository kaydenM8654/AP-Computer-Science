package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][6]; // 6 rows, 6 coloums
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length - 1; c++)
                    mat[r][c] = input.nextInt();
            }

            for (int r = 0; r < mat.length-1;r++) {
                for (int c = 0; c < mat[0].length-1;c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }
            System.out.println();

            for (int row = 0; row < mat.length-1; row++) {
                for (int col = 0; col < mat[0].length-1;col++) {

                    mat[5][col] += mat[row][col]; // sum of column

                }
            }

            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
