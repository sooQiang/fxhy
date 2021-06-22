package pattern.proxy.general;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:03 上午
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("一枝春风叩柴门\n" +
                "\n" +
                "一声鹊啼我自珍");
    }
}
