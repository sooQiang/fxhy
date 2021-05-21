package pattern.factory.abstractFactory;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.printf("录制java视频");
    }
}
