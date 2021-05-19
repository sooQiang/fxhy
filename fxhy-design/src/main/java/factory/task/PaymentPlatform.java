package factory.task;

public interface PaymentPlatform {

    Alibaba createCloudPay();

    Bank createPosPay();
}
