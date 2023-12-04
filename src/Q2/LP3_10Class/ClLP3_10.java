package Q2.LP3_10Class;

public class ClLP3_10 {
    private double burgers;
    private double fries;
    private double sodas;
    private double total;
    private int tax;
    private double ttotal;


    public ClLP3_10(int b, int f, int s) {
        burgers = b;
        fries = f;
        sodas = s;
        total = 0;
        tax = 0;
        ttotal = 0;
    }

    public void calc() {
        total = burgers * 1.69 + fries * 1.09 + sodas * 0.99;
        tax = (1 - total);
        ttotal = total + tax;
    }
}
