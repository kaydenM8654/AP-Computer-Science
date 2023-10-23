package Q1.Prog209aCl;

public class Cl209a {
    private int num;
    private int great;
    private int less;
    private int total;

    public Cl209a() {
        num = 0;
        great = 0;
        less = 0;
        total = 0;
    }

    public void calc() {
        if (num >= 500) {
            great += 1;
        }else {
            less += 1;
        }
        total = less + great;
    }

    public int getGreat() {return great; }
    public int getLess() { return less;}
    public int getTotal() { return total;}
}
