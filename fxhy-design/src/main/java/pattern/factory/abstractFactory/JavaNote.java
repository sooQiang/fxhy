package pattern.factory.abstractFactory;

public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("书写java笔记");
    }
}
