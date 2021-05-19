package factory.simpleFactory;

public class CouseFactory {
    ICouse create(Class<? extends ICouse> clazz){
        try {
            return clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
