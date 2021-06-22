package pattern.proxy.general;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:10 上午
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);

        proxy.request();
    }



}
