package pattern.proxy.dynamicproxy.cglibproxy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 4:13 下午
 */
public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan) new CglibMeipo().getInstance(new Zhangsan().getClass());
        zhangsan.findLove();
    }
}
