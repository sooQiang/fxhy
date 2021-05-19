package factory.factoryMethod;

public class Test {
    public static void main(String[] args) {
        ICouseFactory javaFactory = new JavaFactory();
        javaFactory.create().record();

        ICouseFactory pythonFactory = new PythonFactory();
        pythonFactory.create().record();
    }


}
