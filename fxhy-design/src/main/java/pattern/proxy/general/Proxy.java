package pattern.proxy.general;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:06 上午
 */
public class Proxy implements ISubject{

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("top");
    }

    private void after() {
        System.out.println("tail");
    }


}
