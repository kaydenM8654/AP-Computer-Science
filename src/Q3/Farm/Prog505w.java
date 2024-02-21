package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();
            int cweight = 0;
            int hweight = 0;


            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();
            for(int r = 0; r < cowRows; r++){
                for(int p = 0; p < cowPens; p++){
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay = hayEaten;
                    corn = cornEaten;
                    cweight += weight;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();
            for(int r = 0; r < horseRows; r++){
                for(int p = 0; p < horsePens; p++){
                    String name = input.next ();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse wow = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                    hweight += weight;
                }
            }
            int cumlativeweight = cweight + hweight;
            System.out.println("Cumlative weight of all animals: " + cumlativeweight);

            //TODO: report income for the day,if theres enough food to feed all, cow that makes most money


            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Horse){
                    Horse horse = (Horse)animals.get(lcv);
                    double hvalue = horse.value(cornCost, hayCost);
                    if(hvalue < minHorseValue){
                        minHorseValue = hvalue;
                        minHorseIndex = lcv;
                    }
                }
            }

            double maxCowValue = Double.MIN_VALUE;
            int maxCowIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Horse){
                    Cow cow = (Cow)animals.get(lcv);
                    double cvalue = cow.value(cornCost, hayCost);
                    if(cvalue > maxCowValue){
                        maxCowValue = cvalue;
                        maxCowIndex = lcv;
                    }
                }
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());
            System.out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
