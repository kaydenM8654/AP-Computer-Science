package Q1.Prog82aCl;

public class Cl82a {
    private int speed;
    private int speedLimit;
    private int math;
    private double ticket;


    public Cl82a(int s, int sl) {
        // Set up private data
        speed = s;
        speedLimit = sl;
        math = 0;
        ticket = 0;
    }

    public void calc() {
        math = speed - speedLimit;
        ticket = 20.00 + (math * 5.00);
    }


    public int getMath() { return math; }
    public double getTicket() { return ticket; }
}
/*
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vehicle speed: ");
        int speed = input.nextInt();
        System.out.println();

        System.out.print("Speed limit: ");
        int speed_l = input.nextInt();
        System.out.println();

        int math = speed - speed_l;
        double ticket = 20.00 + (math * 5.00);

        System.out.println("Fine = " + ticket);


    }
 */