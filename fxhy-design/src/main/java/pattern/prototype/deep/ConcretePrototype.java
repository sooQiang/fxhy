package pattern.prototype.deep;

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
 * 两种方式 序列号，json
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

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    //
    public ConcretePrototype deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //
    public ConcretePrototype jsonClone(){
        String jsonString = JSON.toJSONString(this);
        return JSON.parseObject(jsonString,ConcretePrototype.class);
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
