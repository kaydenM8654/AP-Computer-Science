package Q4.Prog700L;

public class LRTest {
    public static void main(String[] args) {
        double[][] x_train = {
                {2.45, 1},
                {2.87, 1},
                {4.56, 1},
                {3.65, 1},
                {1.56, 1},
                {14.54, 1},
                {3.54, 1},
        };
        double[] y_train = {147.1, 167.3, 132.6, 164.4, 113.4, 154.6, 176.9};
        var lr = new LinearRegression(5, 100, 0.01, 0.001);
        lr.fit(x_train, y_train, 100);
        System.out.println(lr);
        double newInput = 6.75;
        System.out.println("Predicted output for" + newInput + ": " + lr.predict(newInput));
        System.out.println("Compared to " + x_train[7][0] + ": " + y_train[7]);
        System.out.println("Compared to " + x_train[8][0] + ": " + y_train[8]);
    }
}
