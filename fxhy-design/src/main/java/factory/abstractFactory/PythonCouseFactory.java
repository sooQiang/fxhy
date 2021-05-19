package factory.abstractFactory;

public class PythonCouseFactory extends CouseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
