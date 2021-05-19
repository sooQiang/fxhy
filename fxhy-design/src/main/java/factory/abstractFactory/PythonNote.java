package factory.abstractFactory;

public class PythonNote implements INote{
    @Override
    public void edit() {
        System.out.println("书写python笔记");
    }
}
