public class CreditPaymentService {
    public double calculate(int monthes, double rate, int sum){
        double i = rate/100/12;
        double K = (i*Math.pow(1 + i,monthes))/(Math.pow(1 + i,monthes) - 1);
        double monthPay = sum * K;
        return monthPay;
    }
}
