package com.example.fxhytest;

import Bean.User;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonbTester;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class FxhyTestApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
//            String str = "1|\\\\CT\\\\|P8000404133|王旭华|M|047Y|8000404133|健康查体|CT胸部轴位平扫(无胶片)|门内分泌科J|吴潇潇|医疗保险|20210318|115436|徐月|陆军|胸部CT平扫显示：两肺纹理清晰，右上肺前段（3-62）见斑点状密度增高影，边界清晰；右中肺内侧段及左上肺下舌段见条索状密度增高影，边界清晰，余肺内未见明显异常密度灶。主支气管通畅，肺门及纵隔结构显示欠清，纵隔内大血管和心外形无殊。所示两侧多根前肋见片状、结节状高密度影。\\n|    1. 右上肺增殖灶考虑，较前片（2018-03-07）相仿，建议随诊。\\n    2. 两肺纤维条索灶。\\n    3. 两侧多根肋骨良性骨改变考虑，建议随诊复查。\\n\\n";
//
//            String[] split = str.split("\\|");
//
//            Integer i = 0;
//        for (String s : split) {
//            System.out.println(i+++":"+s);
//        String rowDate = "330100D15600000547299847A6578FBB|3|AA1553750|341281198207074539|聂计振|1||||||05|DZPZMjEwNjE1MDgxMDk2MThmYzdi|";
//
//        String substring = rowDate.substring(0, rowDate.length() - 1);
//        String qrCode = substring.substring(substring.lastIndexOf("|")+1);
//
//        System.out.println(qrCode);

        String str = "null#YT#null#YT#57#YT#B10809188";
        System.out.println(ObjectUtil.equal(str.split("#YT#")[0],"null")?"1":"2");




    }

    private static String removeZero(String money){
        if(!money.contains(".")){return money;}
        if(money.endsWith("0")){
            money = removeZero(money.substring(0,money.length()-1));
        }else if(money.endsWith(".")){
            return money.substring(0,money.length()-1);
        }
        return money;
    }



    

}
