package pattern.proxy.dynamicproxy.jdkproxy;

import pattern.proxy.dynamicproxy.jdkproxy.IPerson;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:42 上午
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        zhangsan.buyInsure();

        IPerson wangwu = jdkMeipo.getInstance(new Wangwu());
        wangwu.findLove();

    }
}
