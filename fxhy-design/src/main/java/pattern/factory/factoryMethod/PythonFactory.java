package pattern.factory.factoryMethod;

public class PythonFactory implements ICouseFactory {
    @Override
    public ICouse create() {
        return new PythonCouse();
    }
}
