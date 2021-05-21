package pattern.factory.task;

public class PosPayICBC implements Bank {
    @Override
    public void bankPay() {
        System.out.println("工商银行pos支付");
    }
}
