package Q1.Prog209aCl;

public class Cl209a {
    private int qnt;
    private int numGreat;
    private int numLess;
    private int totalnum;

    public Cl209a(int num) {
        qnt = num;
        numGreat = 0;
        numLess = 0;
        totalnum = 0;
    }

    public void calc() {
        if (qnt < 500) numLess += 1;
        else numGreat += 1;
        totalnum = numGreat + numLess;
    }

    public int getNumGreat() { return numGreat;}
    public int getNumLess() { return numLess;}
    public int getTotalnum() {return totalnum;}
}
