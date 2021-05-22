package pattern.builder;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 2:09 下午
 */
public class ConcreteBuilder implements IBuilder{
    private Product product = new Product();
    @Override
    public Product builder() {
        return product;
    }
}
