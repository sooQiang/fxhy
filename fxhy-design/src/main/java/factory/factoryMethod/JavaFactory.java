package factory.factoryMethod;

public class JavaFactory implements ICouseFactory{
    @Override
    public ICouse create() {
        return new JavaCouse();
    }
}
