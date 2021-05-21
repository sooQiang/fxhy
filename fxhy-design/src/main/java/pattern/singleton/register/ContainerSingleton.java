package pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 5:16 下午
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                Class<?> clazz = Class.forName(className);
                instance = clazz.newInstance();
                ioc.put(className,instance);
            }catch (Exception e){
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }

}
