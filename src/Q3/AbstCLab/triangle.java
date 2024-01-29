package Q3.AbstCLab;

public class triangle extends NotCircle{
    private double base;
    public triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double h) { height = h; }
    public void setBase(double w) { base = w; }
    public double getHeight() { return height; }
    public double getBase() { return base; }

    public void calculateArea() {
        System.out.println("Area: " + ( 0.5 * base * height));
    }

    public void calculateCircumference() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}
