package Q1.prog285bCl;
import java.util.*;

import java.io.*;
public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));
            System.out.println("id\tcode\tSales\tComm");
            while (input.hasNext()) {
                int id = input.nextInt();
                int code = input.nextInt();
                double s = input.nextDouble();

                Salesperson fred = new Salesperson(id, code, s);
                fred.setComm();
                System.out.println(fred.toString());

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
