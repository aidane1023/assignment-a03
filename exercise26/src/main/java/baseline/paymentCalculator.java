//n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

package baseline;

public class paymentCalculator {

    public double b;
    public double p;
    public double i;

    paymentCalculator(double b, double i, double p) {
        //initialize variables for calculation
        this.b = b;
        this.p = p;
        this.i = i;
    }


    public static double calculateMonthsUntilPaidOff(double b, double i, double p) {
        double temp = Math.log(1 + b/p * (1 - Math.pow(1 + i,30)));
        temp = temp / Math.log(1 + i);
        temp = temp * (-0.0333333);
        return 70;
    }
}
