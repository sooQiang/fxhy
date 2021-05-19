package factory.task;

public class CloudPayICBC implements Bank{
    @Override
    public void bankPay() {
        System.out.println("工行云闪付");
    }
}
