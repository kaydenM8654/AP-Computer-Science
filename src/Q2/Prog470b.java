package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
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

                    mat[5][col] += mat[row][col]; // sum of row

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
/*
45	67	89	12	-3	0
-3	-6	-7	-4	-9	0
96	81	-8	52	12	0
14	-7	72	29	-1	0
19	43	28	63	87	0
171	178	174	152	86	0

 */
