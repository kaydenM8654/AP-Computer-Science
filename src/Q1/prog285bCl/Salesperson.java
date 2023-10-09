package Q1.prog285bCl;

public class Salesperson {
    private int myid;
    private int mycode;
    private double mySales;
    private double myComm;

    private void calc() {
        if(mycode == 5 || mycode == 0) {
            if (mySales <= 5000)
                myComm = getSales() * 0.075;
            else
                myComm = 5000 * 0.075 + (mySales - 5000) * 0.085;



        }else if(mycode == 17) {
            if (mySales <= 3500)
                myComm = mySales * 0.095;
            else
                myComm = 3500 * 0.095 + (getSales() - 3500) * 0.12;
        }
    }

    public Salesperson(int id, int code, double sales) {
        myid = id;
        mycode = code;
        mySales = sales;
        myComm = 0;
    }

    public void setComm() { calc(); }

    public int getid() { return myid; }

    public double getcomm() { return myComm; }
    public double getSales() { return mySales; }

    public String toString() {
        return myid + "\t" + mycode + "\t" + mySales + "\t" + myComm;

    }

}

