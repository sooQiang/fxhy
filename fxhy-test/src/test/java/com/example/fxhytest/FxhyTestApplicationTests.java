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
import java.util.regex.Pattern;

@SpringBootTest
class FxhyTestApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
       String str = "1.检查时间以叫号为准2.已经怀孕及可能怀孕的女性请在检查前告知检查医生";
       String str1 = "1 .检查前一天：吃白粥/清汤面/菜汤/果汁，不吃蔬菜/瓜果/豆浆/牛奶。术前需停用抗血小板及抗凝药物（通常需停用阿司匹林、氯吡格雷7天，华法令、利伐沙班、达比加群5天，具体请务必遵相关专科医生医嘱！！！）。高血压患者需照常服用降压药。2.检查当天：手术当日禁食   方案①：1盒复方硫酸钠聚乙二醇+温开水2升混匀，术前6小时开始服用，2小时内均匀喝完   方案②：2盒复方硫酸钠聚乙二醇+温开水4升混匀，术前7.5小时开始服用，3.5小时内均匀喝完。 3.如有西甲硅油，一瓶加入泻药一起服用！如有腹胀痛?心暂停服药，待排便、症状缓解后继续服用，术前禁食禁饮4小时。4.温馨提示：    就诊当日不化妆、不涂指甲油、不带贵重物品、穿宽松衣裤，备硬糖，全程需家属陪同，术后当天禁驾驶及高空作业。    胃镜肠镜同日检查者，术前准备请参考肠镜检查注意事项。5.请避开月经期！6.急性感染期间不能检查（如感冒）。 1.术前停抗凝药包括阿司匹林、华法林、氯吡格雷（泰嘉、波立维） 一周（需咨询开单及开药科室医生是否能停药及停药时间）。高血压患者照常服用降压药。2.检查前禁饮禁食十二小时，如同时做肠镜检查，请按肠镜注意事项。3.自备硬糖，饥饿时可含服4.胃切除术后患者，检查前三天需无渣半流质饮食。5.需家属陪同6.温馨提示：   就诊当日不化妆、不涂指甲油、不带贵重物品、穿宽松衣裤，备硬糖，全程需家属陪同，术后当天禁驾驶及高空作业。   胃镜肠镜同日检查者，术前准备请参考肠镜检查注意事项。7.急性感染期间不能检查（如感冒）。";
       String str2 = "1.请携带与病情相关的外院资料。2.禁食禁糖6小时，可正常饮水。3.糖尿病患者需血糖控制在11mmol/L以下。4.幼儿需提前配镇静剂及留好留置针。5.如有变动请提前1天致电0571-87236432（工作时间）。6.自带矿泉水1500毫升。";

       for(int i = 1;;i++){
           String s = i+".";
           if (!str1.contains(s)){
               break;
           }
           str1 = str1.replace(s,"\n"+s);

       }


        System.out.println(str1);


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
