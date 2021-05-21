package pattern.prototype.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 10:06 上午
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = ConcretePrototype.getInstance();
        concretePrototype.setName("星海");
        concretePrototype.setAge("18");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("足球");
        hobbies.add("篮球");
        concretePrototype.setHobbies(hobbies);


        ConcretePrototype clone = concretePrototype.clone();
        clone.getHobbies().add("羽毛求");
        System.out.println("原型对象:"+concretePrototype);
        System.out.println("克隆对象:"+clone);
        System.out.println(clone == concretePrototype);

    }
}
