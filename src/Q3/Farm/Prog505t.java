package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal1> animals = new ArrayList<Animal1>();
            List<Horse1> horse = new ArrayList<Horse1>();
            List<Cow1> cow = new ArrayList<Cow1>();
            int cweight = 0;
            int hweight = 0;
            int foodeaten = 0;
            double cowRev = 0;
            double horseRev = 0;


            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cows = input.nextInt();
            for(int r = 0; r < cows; r++){
                int weight = input.nextInt();
                int milk = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                Cow1 wowza = new Cow1(weight, milk, hayEaten, cornEaten);
                cow.add(wowza);
                animals.add(wowza);
                foodeaten += cornEaten;
                foodeaten += hayEaten;
                hay = hayEaten;
                corn = cornEaten;
                cweight += weight;
                cowRev += (milk * 0.20);
            }

            int horses = input.nextInt();
            for(int r = 0; r < horses; r++){
                int weight = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                int rides = input.nextInt();
                double rideCost = input.nextDouble();
                Horse1 wow = new Horse1(weight, cornEaten, hayEaten, rides, rideCost);
                horse.add(wow);
                animals.add(wow);
                foodeaten += cornEaten;
                foodeaten += hayEaten;
                hay -= hayEaten;
                corn -= cornEaten;
                hweight += weight;
                horseRev += (rides * rideCost);
            }
            double totalRev = (horseRev + cowRev) - (cornCost + hayCost);
            int cumlativeweight = cweight + hweight;
            System.out.println("Cumlative weight of all animals: " + cumlativeweight + "lbs");
            System.out.println("Total income for the day: " + totalRev);




            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Horse1){
                    Horse1 horse1 = (Horse1)animals.get(lcv);
                    double hvalue = horse1.value(cornCost, hayCost);
                    if(hvalue < minHorseValue){
                        minHorseValue = hvalue;
                        minHorseIndex = lcv;
                    }
                }
            }
            System.out.println(hay + corn);
            double maxCowValue = Double.MAX_VALUE;
            int maxCowIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Cow1){
                    Cow1 cow1 = (Cow1)animals.get(lcv);
                    double cvalue = cow1.value(cornCost, hayCost);
                    if(cvalue > maxCowValue){
                        maxCowValue = cvalue;
                        maxCowIndex = lcv;
                    }
                }
            }
            if (hay + corn - foodeaten > 0){
                System.out.println("There is enough food to feed all animals");
            }else{
                System.out.println("There is not enough food to feed all animals");
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());
            System.out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
