package Q2.LP3_10Class;

public class ClLP3_10 {
    private double burgers;
    private double fries;
    private double sodas;
    private double total;
    private double tax;
    private double ttotal;
    private double mathtotal;


    public ClLP3_10(double b, double f, double s) {
        burgers = b;
        fries = f;
        sodas = s;
        total = 0;
        tax = 0;
        ttotal = 0;
        mathtotal = 0;
    }

    public void calc() {
        total = burgers * 1.69 + fries * 1.09 + sodas * 0.99;
        tax = total * 0.065;
        mathtotal = 1 - tax - 0.1 + tax;
        ttotal = total + mathtotal;
    }

    public double getTotal() { return total; }
    public double getTtotal() { return ttotal; }
    public double getTax() { return tax; }
    public double getMathtotal() { return mathtotal; }
}
