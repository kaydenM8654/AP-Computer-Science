package Q2.LP3_9Class;

public class Cl3_9 {
    private int year;
    private int month;
    private int day;
    private int year1;
    private int month1;
    private int day1;
    private int years;
    private int months;
    private int days;
    private int al;
    private int sl;


    public Cl3_9(int y1, int m1, int d1, int y2, int m2, int d2) {
        year = y1;
        month = m1;
        day = d1;
        year1 = y2;
        month1 = m2;
        day1 = d2;
        years = 0;
        months = 0;
        days = 0;
        al = 0;
        sl = 0;
    }


    public void calc() {
        years = (year1 - year) * 365;
        months = Math.abs(month1 - month) * 30;
        days = Math.abs(day1 - day);
        al = years + months + days;
        sl = al * 8;

    }


    public int getAlive() { return al; }
    public int getSlept() { return sl; }

}
