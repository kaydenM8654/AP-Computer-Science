package Q1.Prog209aCl;

import Q1.Prog209aCl.Cl209a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));
            while (input.hasNext()) {
                Cl209a wowsa = new Cl209a();
                wowsa.calc();
                System.out.println(wowsa);

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }


}
