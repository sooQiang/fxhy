package pattern.proxy.staticproxy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:19 上午
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new Zhangsan());
        zhangLaosan.findLove();
    }
}
