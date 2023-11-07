package Q2.Prog213fArray;

public class Cl213fArray {
    private double mykwh;
    private double myCost;

    public Cl213fArray(double kwh) {
        mykwh = kwh;
        myCost = 0;
    }


    public void calc() {
        if(mykwh > 0 && mykwh < 2001) {
            myCost = 0.07 * mykwh;
        }else if(mykwh > 2000 && mykwh < 10001) {
            int math = (int) (mykwh - 2000);
            myCost = math * 0.05;
        }else if(mykwh > 10000) {
            int math1 = (int) (mykwh - 10000);
            myCost = math1 * 0.04;
        }

    }

    public String toString() {

        return String.format("The number of kwh =  %.2f\tAmount per kilowatt hour = $%.2f\t", mykwh, myCost);
    }
}
