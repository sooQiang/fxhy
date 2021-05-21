package pattern.factory.task;

public class CloudPayAlipay implements Alibaba {
    @Override
    public void alipay() {
        System.out.println("阿里云线上支付");
    }
}
