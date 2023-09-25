package Q1;

public class mathtest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3);

        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int num4 = 5;
        int sum = num1 + num2 + num3 + num4;
        sum /= 4;
        int test = 3/4;
        System.out.println(test);

        double mywallet = 2395.543634636;
        double mywrounded = Math.round(mywallet * 100.0) / 100.0;

        System.out.println(mywrounded);
        System.out.printf("mywrounded = %.2f\n",  mywallet);
    }
}
