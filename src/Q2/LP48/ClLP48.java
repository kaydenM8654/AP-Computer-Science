package Q2.LP48;

public class ClLP48 {
    private final int mya;
    private final int myc;
    private final int myM;
    private int myXn;
    private int temp;

    public ClLP48(int a, int c, int m, int x0) {
        mya = a;
        myc = c;
        myM = m;
        myXn = x0;
        temp = 0;
    }

    public int nextInt() {
        myXn = (mya * myXn + myc) % myM;
        return myXn;
    }

    public String toString() {
        return String.format("(%d * %d + %d) % d = %d", mya, myXn, myc, myM, this.nextInt());
    }
}
