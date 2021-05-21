package pattern.singleton.lazy;

/**
 * @Author: 星海
 * @Description:
 * @DateTime: 2021/5/20 2:17 下午
 */

/**
 * 优点：节省内存
 * 缺点：性能低
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton() {}

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
