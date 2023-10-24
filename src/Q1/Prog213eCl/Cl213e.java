package Q1.Prog213eCl;

public class Cl213e {
    private int num;
    private int Dis;
    private double per;
    private String group;


    public Cl213e(int num) {
        this.num = 0;
        Dis = 0;
        per = 0;
        group = "0";
    }

    public void calc() {
        if (num < 20) {
            group = "< 20";
            per = 17.65;
            Dis = 3;

        }else if (num > 19 && num < 40) {
            group = "20-39";
            per = 29.41;
            Dis = 5;
        }else if (num > 39 && num < 60) {
            group = "40-59";
            per = 23.53;
            Dis = 4;
        }else if (num > 59 && num < 80) {
            group = "60-79";
            per = 17.65;
            Dis = 3;
        }else {
            group = ">79";
            per = 11.76;
            Dis =  2;
        }
    }

    public int getDis() { return Dis; }
    public double getPer() { return per; }
    public String getGroup() { return group; }
}
