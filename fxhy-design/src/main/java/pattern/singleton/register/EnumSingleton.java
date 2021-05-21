package pattern.singleton.register;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/20 5:07 下午
 */

/**
 * 枚举类不能通过反射创建对象
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}
