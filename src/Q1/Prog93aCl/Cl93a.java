package Q1.Prog93aCl;

public class Cl93a {
    private int kilo;
    private double base;
    private double surcharge;
    private double citytax;
    private double total;
    private double latetotal;
    private double latetotal1;

    public Cl93a(int kw) {
        kilo = kw;
        base = 0;
        surcharge = 0;
        citytax = 0;
        total = 0;
        latetotal = 0;
        latetotal1 = 0;


    }

    public void calc() {
        base = kilo * 4.75;
        surcharge = 4.72;
        citytax = 1.42;
        total = base + surcharge + citytax;
        latetotal = total * 0.04;
        latetotal1 = total - latetotal;

    }

    public double getBase() { return base; }
    public double getSurcharge() { return surcharge; }

}
