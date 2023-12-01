package Q2.LP3_9Class;

public class Cl3_9 {
    private int year;
    private int month;
    private int day;
    private int year1;
    private int month1;
    private int day1;
    private int alive;
    private int slept;
    private int currenttotaldays;
    private int birthtotaldays;


    public Cl3_9(int y1, int m1, int d1, int y2, int m2, int d2) {
        slept = 0;
        year = y1;
        month = m1;
        day = d1;
        year1 = y2;
        month1 = m2;
        day1 = d2;
        alive = 0;
        birthtotaldays = 0;
        currenttotaldays = 0;
    }

    public void calc() {
        currenttotaldays = (year1 * 365) + (month1 * 30) + day1;
        birthtotaldays = (year * 365) + (month * 30) + day;
        alive = Math.abs(currenttotaldays - birthtotaldays);
        slept = alive * 8 / 24;

    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear1() { return year1; }
    public int getMonth1() { return month1; }
    public int getDay1() { return day1; }
    public int getAlive() { return alive; }
    public int getSlept() { return slept; }

}
