package pattern.builder;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:05 下午
 */
public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
