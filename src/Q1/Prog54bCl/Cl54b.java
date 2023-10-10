package Q1.Prog54bCl;

public class Cl54b {
    private int Num1;
    private int Num2;
    private int Num3;
    private int Num4;
    private int sum;
    private double ave;

    public Cl54b(int num1, int num2, int num3, int num4) {
        // Set up private data
        Num1 = num1;
        Num2 = num2;
        Num3 = num3;
        Num4 = num4;
        sum = 0;
        ave = 0;
    }

    public void calc() {
        sum = Num1 + Num2 + Num3 + Num4;
        ave = sum / 4.0;
    }

    public int getSum() { return sum; }
    public double getAve() {return ave; }
}
