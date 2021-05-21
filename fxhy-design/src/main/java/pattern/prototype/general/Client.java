package pattern.prototype.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 10:06 上午
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName("星海");
        concretePrototype.setAge("18");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("足球");
        hobbies.add("篮球");
        concretePrototype.setHobbies(hobbies);



        ConcretePrototype clone = concretePrototype.clone();
        clone.getHobbies().add("羽毛球");

        //给克隆对象赋值会改变原对象属性  浅克隆
        System.out.println("克隆对象:"+clone);
        System.out.println("原型对象"+concretePrototype);

        System.out.println(concretePrototype.getAge() == clone.getAge());
    }
}
