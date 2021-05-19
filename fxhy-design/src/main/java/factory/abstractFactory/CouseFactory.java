package factory.abstractFactory;

public abstract class CouseFactory {

    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
