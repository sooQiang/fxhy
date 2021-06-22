package pattern.proxy.dynamicproxy.jdkproxy;

import pattern.proxy.dynamicproxy.jdkproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:25 上午
 */
public class JdkMeipo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target){
        this.target = target;

        Class<?> clazz = target.getClass();

        return (IPerson) Proxy.newProxyInstance(target.getClass().getClassLoader(), clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}
