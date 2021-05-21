package pattern.singleton.lazy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 4:32 下午
 */

/**
 * 优点：代码优雅，利用java本身语法特点，性能高，避免了内存浪费
 * 缺点：
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        //防止被反射破坏
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    public static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
