import pattern.singleton.register.EnumSingleton;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 5:10 下午
 */


public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
    }
}
