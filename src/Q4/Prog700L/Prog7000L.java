package Q4.Prog700L;
import java.util.*;
import java.io.*;
public class Prog7000L {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));
            ArrayList<Double[]> x = new ArrayList<>();
            ArrayList<Double> y = new ArrayList<>();
            input.nextLine();
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] data = line.split(",");
                Double[] row = {
                    Double.parseDouble(data[2]),
                    Double.parseDouble(data[0])
                };
                y.add(Double.parseDouble(data[1]));
                x.add(row);
            }
            Double[][] x_train = new Double[x.size()][2];
            for(int i = 0; i < x.size(); i++){
                x_train[i][0] = x.get(i)[0];
                x_train[i][1] = x.get(i)[1];
            }
            double[] y_train = new double[y.size()];
            for(int i = 0; i < y.size(); i++){
                y_train[i] = y.get(i);
            }
            var lr = new LinearRegression(60, 100, 0.0000001, 0.00001);
            lr.fit(x_train, y_train, 100);
            System.out.println(lr);

            double soFoot = 1897;
            double closestPoint = x_train[0][0];
            int closestIndex = 0;
            for(int i = 0; i < x_train.length; i++){
                if(Math.abs(x_train[i][0] -soFoot) < Math.abs(closestPoint - soFoot)){
                    closestPoint = x_train[i][0];
                    closestIndex = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
