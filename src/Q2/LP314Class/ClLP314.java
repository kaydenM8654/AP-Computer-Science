package Q2.LP314Class;

public class ClLP314 {
    public int aubreyNewYork;
    public int aubreyNewJersey;
    public int aubreyConnecticut;
    public double aubreyTotal;
    public int martinezNewYork;
    public int martinezNewJersey;
    public int martinezConnecticut;
    public double martinezTotal;
    public double totalVote;
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

    public double getMartinezTotal() { return martinezTotal; }
    public double getAubreyTotal() { return aubreyTotal; }
    public double getTotalVote() { return totalVote; }
    public double getAubreyPercentage() { return aubreyPercentage; }
    public double getMartinezPercentage() { return martinezPercentage; }
}
