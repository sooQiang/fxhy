package pattern.prototype.singleton;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 9:55 上午
 */

/**
 * 原型模式和单例模式是冲突的，设计了单例的对象不能去实现Cloneable接口
 */
public class ConcretePrototype implements Cloneable, Serializable {
    private String age;
    private String name;
    private List<String> Hobbies = new ArrayList<>();

    public List<String> getHobbies() {
        return Hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        Hobbies = hobbies;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ConcretePrototype() {}

    private static ConcretePrototype instance ;

    public static ConcretePrototype getInstance(){
     if(instance == null){
         synchronized (ConcretePrototype.class){
             if(instance == null){
                 instance = new ConcretePrototype();
             }
         }
     }
     return instance;
    }

    @Override
    public ConcretePrototype clone() {
        return instance;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", Hobbies=" + Hobbies +
                '}';
    }
}
