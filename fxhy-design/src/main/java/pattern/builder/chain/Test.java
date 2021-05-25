package pattern.builder.chain;

public class Test {
    public static void main(String[] args) {
        CourseBuilderImpl builder = new CourseBuilderImpl();
        Course course = builder.addName("java课程")
                .addVideo("录播视频").addNote("笔记").addPpt("ppt").addHomeWork("课后作业").builder();

        System.out.println(course);
    }
}
