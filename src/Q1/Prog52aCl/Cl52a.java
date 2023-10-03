package Q1.Prog52aCl;

public class Cl52a {
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input section
    public Cl52a(int len, int wid) {
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;

    }

    // Calculation section
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    // output section
    public int getArea() { return myArea; }
    public int getPerim() {return myPerim; }

}
