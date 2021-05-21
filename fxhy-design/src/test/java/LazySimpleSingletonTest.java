import java.util.concurrent.Executors;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 2:25 下午
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorsTest());
        Thread thread2 = new Thread(new ExecutorsTest());

        thread1.start();
        thread2.start();
    }
}
