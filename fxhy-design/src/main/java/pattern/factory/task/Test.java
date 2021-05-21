package pattern.factory.task;

public class Test {
    public static void main(String[] args) {
        CloudFactory cloudFactory = new CloudFactory();
        cloudFactory.createCloudPay().alipay();
        cloudFactory.createPosPay().bankPay();

        PosFactory posFactory = new PosFactory();
        posFactory.createCloudPay().alipay();
        posFactory.createPosPay().bankPay();
    }
}
