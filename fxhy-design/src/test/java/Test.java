import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/5/21 3:49 下午
 */
public class Test {
    public static void main(String[] args) {
        String json = "{\"name\":1,\"records\":[{\"a\":\"1\",\"b\":\"2\",\"c\":\"3\"}]}";

        try{
            Integer a = 1/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("成功");
        }
        System.out.println("结束");

    }
}
