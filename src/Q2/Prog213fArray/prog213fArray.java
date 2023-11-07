package Q2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));

            Cl213fArray[] list = new Cl213fArray[1000];
            int cnt = 0;
            while (input.hasNext()) {
                double kwh = input.nextDouble();

                if(kwh != -999) {
                    Cl213fArray yikes = new Cl213fArray(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }

            }
            for(int lcv = 0;lcv < cnt; lcv++)
                list[lcv].calc();
            for(int lcv = 0;lcv < cnt; lcv++)
                System.out.println(list[lcv]);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
/*
The number of kwh =  101.00	Amount per kilowatt hour = $7.07
The number of kwh =  17.00	Amount per kilowatt hour = $1.19
The number of kwh =  2250.00	Amount per kilowatt hour = $12.50
The number of kwh =  103.00	Amount per kilowatt hour = $7.21
The number of kwh =  5.00	Amount per kilowatt hour = $0.35
The number of kwh =  4000.00	Amount per kilowatt hour = $100.00
The number of kwh =  117.00	Amount per kilowatt hour = $8.19
The number of kwh =  3.00	Amount per kilowatt hour = $0.21
The number of kwh =  7350.00	Amount per kilowatt hour = $267.50
The number of kwh =  118.00	Amount per kilowatt hour = $8.26
The number of kwh =  8.00	Amount per kilowatt hour = $0.56
The number of kwh =  7350.00	Amount per kilowatt hour = $267.50
The number of kwh =  125.00	Amount per kilowatt hour = $8.75
The number of kwh =  5.00	Amount per kilowatt hour = $0.35
The number of kwh =  6500.00	Amount per kilowatt hour = $225.00
The number of kwh =  138.00	Amount per kilowatt hour = $9.66
The number of kwh =  17.00	Amount per kilowatt hour = $1.19
The number of kwh =  6375.00	Amount per kilowatt hour = $218.75
The number of kwh =  192.00	Amount per kilowatt hour = $13.44
The number of kwh =  8.00	Amount per kilowatt hour = $0.56
The number of kwh =  8125.00	Amount per kilowatt hour = $306.25
The number of kwh =  203.00	Amount per kilowatt hour = $14.21
The number of kwh =  8.00	Amount per kilowatt hour = $0.56
The number of kwh =  3250.00	Amount per kilowatt hour = $62.50
The number of kwh =  218.00	Amount per kilowatt hour = $15.26
The number of kwh =  5.00	Amount per kilowatt hour = $0.35
The number of kwh =  5000.00	Amount per kilowatt hour = $150.00
The number of kwh =  235.00	Amount per kilowatt hour = $16.45
The number of kwh =  5.00	Amount per kilowatt hour = $0.35
The number of kwh =  5250.00	Amount per kilowatt hour = $162.50
The number of kwh =  264.00	Amount per kilowatt hour = $18.48
The number of kwh =  17.00	Amount per kilowatt hour = $1.19
The number of kwh =  4150.00	Amount per kilowatt hour = $107.50
The number of kwh =  291.00	Amount per kilowatt hour = $20.37
The number of kwh =  17.00	Amount per kilowatt hour = $1.19
The number of kwh =  750.00	Amount per kilowatt hour = $52.50

 */