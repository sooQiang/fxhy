package pattern.factory.task;

public class PosPayAlipay implements Alibaba {
    @Override
    public void alipay() {
        System.out.println("阿里云pos支付");
    }
}
