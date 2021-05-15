package Bean;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer age;
    private String height;
    private Integer sex;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", sex=" + sex +
                '}';
    }
}
