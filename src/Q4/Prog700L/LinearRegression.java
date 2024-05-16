package Q4.Prog700L;
import java.util.*;
public class LinearRegression {
    private double theta0; // y-intercept
    private double theta1; // slope
    private double aplha; // Learning Rate
    private double tolerance;// cost threshold
    private double[] objective;

    public LinearRegression(double thetaOne, double thetaZero, double LearningRate, double tol){
        theta0 = thetaZero;
        theta1 = thetaOne;
        aplha = LearningRate;
        tolerance = tol;
    }
    public void fit(double[][] x_train, double [] y_train, int epochs){
        int m = x_train.length;
        objective = new double[epochs];
        double[] e = new double[m];

        for(int epoch = 0; epoch < epochs; epoch++){
            if (epoch > 0){
                double temp0 = 0, temp1 = 0;
                for(int i = 0; i < m; i++){
                    double temp = theta1 * x_train[i][0] + theta0 - y_train[i];
                    temp0 += temp;
                    temp1 += temp * x_train[i][0]
                }
                theta0 -= (1.0/m) * aplha * temp0;
                theta1 -= (1.0/m) * aplha * temp1;
            }
        }
    }

    public String toString() {
        return "Regression line: y = " + theta1 + " * x + " + theta0 + "\nObjective: " + Arrays.toString(objective) + "\nMin objective: " + (double)Arrays.stream(objective).min().getAsDouble();
    }

    public double getIntercept() { return theta0; }
    public double getSlope() { return theta1; }
    public double predict(double x) { return theta1 * x + theta0;}
}
