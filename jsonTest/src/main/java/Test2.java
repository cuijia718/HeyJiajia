import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * json对象转化成字符串（无格式化操作）
 */
public class Test2 {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws IOException {

        /**
         * json转化单个对象
         */

        JSONObject jsonObj = new JSONObject();
        User user = new User();
        user.setUserName("李四");
        user.setUserSex("女");
        user.setUserAge(33);

        JSONObject jsonStr = jsonObj.fromObject(user);
        String str = jsonStr.toString();


        long startTime = (System.currentTimeMillis());
        logger.info(str);
        //   System.out.println("start:" + startTime);
        long endTime = (System.currentTimeMillis());
       // System.out.println("end:" + endTime);
        logger.info("普通转化成字符串的json对象日志打印时间为："+(endTime-startTime)+"");
       // System.out.println("普通转化成字符串的json对象日志打印时间为：" + time);



        /**
         * list转化成json字符串（无格式化）
         */

/*        List<User> list = new ArrayList<User>();

        User user1 = new User();
        user1.setUserName("王五");
        user1.setUserSex("男");
        user1.setUserAge(55);

        User user2 = new User();
        user2.setUserName("赵六");
        user2.setUserSex("女");
        user2.setUserAge(66);

        list.add(user1);
        list.add(user2);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(list);
        //计算日志的输出时间（无格式化后的json字符串）
        long startTime = (System.currentTimeMillis());
        logger.info(jsonArray.toString());
        System.out.println("start:"+startTime);
        long endTime = (System.currentTimeMillis());
        System.out.println("end:"+endTime);
        long time = endTime-startTime;
        System.out.println("格式化后的json对象日志打印时间为："+time);

    }*/
    }
}