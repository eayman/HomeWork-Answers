package Chapter04;


/**
 Science P4.13
 */
public class P4_13 {
    
    public final double a = 17.27;
    public final double b = 237.7;

    public void f(double T, double RH) {
        double f = ((a * T) / (b + T)) + Math.log(RH);
        double Td = (b * f) / (a - f);
        System.out.printf("The dew point temperature Td: %.4f°C.\n " , Td);
    }
    
}
