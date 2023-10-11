package Q1.Prog76aCl;
import java.util.*;
public class Cl76a {
    private int amount;
    private int math1;
    private int math2;


    public Cl76a(int a) {
        // Set up private data
        amount = a;
        math1 = 0;
        math2 = 0;
    }

    public void calc() {
        math1 = amount * 9;
        math2 = math1 * 12345679;
    }

    public int getMath1() { return math1; }

    public int getMath2() { return math2; }
}
