package pattern.factory.task;

public class PosFactory implements PaymentPlatform {
    @Override
    public Alibaba createCloudPay() {
        return new PosPayAlipay();
    }

    @Override
    public Bank createPosPay() {
        return new PosPayICBC();
    }
}
