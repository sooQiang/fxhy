package pattern.builder;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:10 下午
 */
public class Director {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        System.out.println(builder.builder());
    }
}
