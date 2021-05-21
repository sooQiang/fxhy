package pattern.singleton.threadLocal;

/**
 * @Author: 星海
 * @Description: 线程独占式单例
 * @DateTime: 2021/5/21 9:16 上午
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){};

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
