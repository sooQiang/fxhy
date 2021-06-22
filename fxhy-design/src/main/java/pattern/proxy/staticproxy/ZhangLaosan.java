package pattern.proxy.staticproxy;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/6/4 11:17 上午
 */
public class ZhangLaosan implements IPerson{

    private Zhangsan zhangsan;

    public ZhangLaosan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findLove() {
        System.out.println("开始物色");
        zhangsan.findLove();
        System.out.println("ok");
    }
}
