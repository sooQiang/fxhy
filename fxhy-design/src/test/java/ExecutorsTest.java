import pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 2:26 下午
 */
public class ExecutorsTest implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}
