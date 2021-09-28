package ex26;

public class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(float balance, float APR, float payment)
    {
        double n = -((1.0/30.0)*Math.log(1+balance/payment*(1-(1+APR/365.0))/Math.log(1+APR/365.0)));
        return n;
    }
}
