public class CreditPaymentService {
    public double calculate(int monthes, double rate, int sum){
        double i = rate/monthes/100;
        double K = (i*Math.pow(1 + i,monthes))/(Math.pow(1 + i,monthes) - 1);
        double monthpay = sum * K;
        return monthpay;
    }
}
