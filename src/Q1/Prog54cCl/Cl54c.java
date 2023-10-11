package Q1.Prog54cCl;
import java.util.*;
public class Cl54c {
    private double Rad;
    private double area;
    private double circ;

    public Cl54c(double r) {
        // Set up private data
        Rad = r;
        area = 0;
        circ = 0;
    }

    public void calc() {
        area = (Rad * Rad) * 3.14159;
        circ = 2 * 3.14159 * Rad;
    }


    public double getArea() { return area; }
    public double getCirc() {return circ; }
}
