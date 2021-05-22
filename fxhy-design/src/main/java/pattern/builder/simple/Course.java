package pattern.builder.simple;

import lombok.Data;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:14 下午
 */

@Data
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homeWork;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homeWork='" + homeWork + '\'' +
                '}';
    }
}
