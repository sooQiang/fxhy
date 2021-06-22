package pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import pattern.proxy.dynamicproxy.jdkproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:25 上午
 */
public class CglibMeipo implements MethodInterceptor {


    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();

        Object invokeSuper = methodProxy.invokeSuper(o, objects);

        after();
        return invokeSuper;
    }
}
