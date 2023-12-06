package Q2.LP314Class;

public class ClLP314 {
    public int aubreyNewYork;
    public int aubreyNewJersey;
    public int aubreyConnecticut;
    public int aubreyTotal;
    public int martinezNewYork;
    public int martinezNewJersey;
    public int martinezConnecticut;
    public int martinezTotal;
    public int totalVote;
    public double aubreyPercentage;
    public double martinezPercentage;



    public ClLP314(int ay, int my, int aj, int mj, int ac, int mc) {
        aubreyNewYork = ay;
        aubreyNewJersey = aj;
        aubreyConnecticut = ac;
        aubreyTotal = 0;
        martinezNewYork = my;
        martinezNewJersey = mj;
        martinezConnecticut = mc;
        martinezTotal = 0;
        totalVote = 0;
        aubreyPercentage = 0;
        martinezPercentage = 0;
    }


    public void calc() {
        martinezTotal = martinezConnecticut + martinezNewJersey + martinezNewYork;
        aubreyTotal = aubreyNewYork + aubreyNewJersey + aubreyConnecticut;
        totalVote = aubreyTotal + martinezTotal;
        martinezPercentage = martinezTotal / totalVote;
        aubreyPercentage = aubreyTotal / totalVote;
    }

    public int getMartinezTotal() { return martinezTotal; }
    public int getAubreyTotal() { return aubreyTotal; }
}
