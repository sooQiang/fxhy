package pattern.proxy.dynamicproxy.jdkproxy;

import pattern.proxy.dynamicproxy.jdkproxy.IPerson;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:23 上午
 */
public class Wangwu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("王五:肤白貌美");
    }

    @Override
    public void buyInsure() {
        System.out.println("30W");
    }
}
