package pattern.builder.simple;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:30 下午
 */
public class CourseBuilderImpl implements CourseBuilder{
    Course course = new Course();

    public void addName(String name){course.setName(name);}

    public void addPpt(String ppt){course.setPpt(ppt);}

    public void addVideo(String video){course.setVideo(video);}

    public void addNote(String note){course.setNote(note);}

    public void addHomeWork(String homeWork){course.setHomeWork(homeWork);}

    @Override
    public Course builder() {
        return course;
    }
}
