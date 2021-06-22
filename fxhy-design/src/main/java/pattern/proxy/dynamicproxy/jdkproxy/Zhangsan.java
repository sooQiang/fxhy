package pattern.proxy.dynamicproxy.jdkproxy;

import pattern.proxy.dynamicproxy.jdkproxy.IPerson;

import javax.jws.soap.SOAPBinding;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:15 上午
 */
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三:高山流水");
    }

    @Override
    public void buyInsure() {
        System.out.println("50W");
    }
}
