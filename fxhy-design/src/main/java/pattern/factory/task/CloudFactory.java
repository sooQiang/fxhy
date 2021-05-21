package pattern.factory.task;

public class CloudFactory implements PaymentPlatform {
    @Override
    public Alibaba createCloudPay() {
        return new CloudPayAlipay();
    }

    @Override
    public Bank createPosPay() {
        return new CloudPayICBC();
    }
}
