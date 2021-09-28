package ex26;

public class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(float balance, float APR, float payment)
    {
        double months = (-1.0/30.0) * (Math.log(1 + ((balance/payment)) * (1 - (Math.pow((1 + APR/36500), 30)))))
                /Math.log(1 + APR/36500);
        return months;
    }
}
