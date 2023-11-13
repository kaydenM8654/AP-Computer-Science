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
    private int yearmath;
    private int monthmath;


    public Cl3_9(int s) {
        slept = s;
        year = 0;
        month = 0;
        day = 0;
        year1 = 0;
        month1 = 0;
        day1 = 0;
        alive = 0;
        monthmath = 0;
        yearmath = 0;
    }

    public void calc() {
        yearmath = (year1 - year) * 365;
        monthmath = (Math.abs(month1 - month)) * 30;
        alive = (Math.abs(day1 - day)) + monthmath + yearmath;
        slept = alive * 8;

    }
}
