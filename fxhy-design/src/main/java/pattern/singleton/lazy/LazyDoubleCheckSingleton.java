package pattern.singleton.lazy;

/**
 * @Author: 星海
 * @Description: 双重检查单例
 * @DateTime: 2021/5/20 2:48 下午
 */

/**
 * 优点：性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {}

    public LazyDoubleCheckSingleton getInstance() {
        //第一次检查是否需要阻塞
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //第二次检查是否需要创建实例
                if (lazyDoubleCheckSingleton == null) {

                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();//指令重排序问题
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
