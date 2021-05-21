import pattern.singleton.register.ContainerSingleton;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 5:25 下午
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance = ContainerSingleton.getInstance("ContainerSingletonTest");
        Object instance1 = ContainerSingleton.getInstance("ContainerSingletonTest");

        System.out.println(instance == instance1 ? "1" : "2");

    }
}
