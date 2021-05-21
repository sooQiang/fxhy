package pattern.factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
        CouseFactory factory = new CouseFactory();
        JavaCouse javaCouse = (JavaCouse) factory.create(JavaCouse.class);
        javaCouse.record();
    }


}
