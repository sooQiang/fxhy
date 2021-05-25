package pattern.builder.chain;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:30 下午
 */

/**
 * 链式编程
 */
public class CourseBuilderImpl implements CourseBuilder {
    Course course = new Course();

    public CourseBuilderImpl addName(String name){course.setName(name);
    return this;
    }

    public CourseBuilderImpl addPpt(String ppt){course.setPpt(ppt);
        return this;
    }

    public CourseBuilderImpl addVideo(String video){course.setVideo(video);
        return this;
    }

    public CourseBuilderImpl addNote(String note){course.setNote(note);
        return this;
    }

    public CourseBuilderImpl addHomeWork(String homeWork){course.setHomeWork(homeWork);
        return this;
    }

    @Override
    public Course builder() {
        return course;
    }
}
