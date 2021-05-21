package pattern.prototype.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 9:55 上午
 */
public class ConcretePrototype implements Cloneable{
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

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", Hobbies=" + Hobbies +
                '}';
    }
}
