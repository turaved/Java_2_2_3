public class Main {
    public static void main(String[] args) {
        //int monthes = 12;
        //double rate = 9.99;
        //double i = rate/monthes/100;//=1
        //double K = (i*Math.pow(1 + i,monthes))/(Math.pow(1 + i,monthes) - 1);
        //int sum = 1_000_000;
        //double monthpay = sum * K;

        CreditPaymentService service = new CreditPaymentService();
        double monthpay12 = service.calculate(12,9.99,1_000_000);
        System.out.println(monthpay12);

        double monthpay24 = service.calculate(24,9.99,1_000_000);
        System.out.println(monthpay24);

        double monthpay36 = service.calculate(36,9.99,1_000_000);
        System.out.println(monthpay36);
        }
}
