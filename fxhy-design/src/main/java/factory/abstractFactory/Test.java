package factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        JavaCouseFactory javaCouseFactory = new JavaCouseFactory();
        javaCouseFactory.createNote().edit();
        javaCouseFactory.createVideo().record();


        PythonCouseFactory pythonCouseFactory = new PythonCouseFactory();
        pythonCouseFactory.createNote().edit();
        pythonCouseFactory.createVideo().record();
    }
}
