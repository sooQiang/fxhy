package pattern.singleton.hungry;

/**
 * @Author: 星海
 * @Description: 饿汉式单例写法 优点：执行效率高，性能高，没有任何锁
 *                            缺点：某些情况下，会造成内存浪费
 * @DateTime: 2021/5/20 2:09 下午
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
