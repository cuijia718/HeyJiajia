import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * json对象转化成字符串（格式化后好看的格式）
 */
public class Test{
    private static  Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) throws IOException{
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name","张三");
        jsonObj.put("age",28);
        jsonObj.put("sex","女");


        //计算日志的输出时间（格式化后的json对象）*/
        long startTime = (System.currentTimeMillis());

        logger.info(CreateUtil.JsonFormart(jsonObj.toString()));



        long endTime = (System.currentTimeMillis());

        logger.info("格式化后json对象日志打印时间为："+(endTime-startTime)+"毫秒");
        //没格式化后的json对象
        long startTime2 = (System.currentTimeMillis());

        logger.info(jsonObj+"");
        ;
        long endTime2 = (System.currentTimeMillis());
        logger.info("没格式化json对象日志打印时间为："+(endTime2-startTime2)+"毫秒");
    }
}
/**
 * 转化集合
 *
 */
       /* List<User> list = new ArrayList<User>();

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

        Test t = new Test();
        String str = t.jsonTest(list);
        //计算日志的输出时间（格式化后的json对象）
        long startTime = (System.currentTimeMillis());
        logger.info(str);
        System.out.println("start:"+startTime);
        long endTime = (System.currentTimeMillis());
        System.out.println("end:"+endTime);
        long time = endTime-startTime;
        System.out.println("格式化后的json对象日志打印时间为："+time);
*/



  /*  //单个对象
    public String jsonTest(Object object) throws JsonGenerationException, JsonMappingException, IOException{
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String str = objectMapper.writeValueAsString(object);

        return str;


    }*/

    /**
     * 集合（List转化成json字符串集合）
     */
   /* public String jsonTest(List list) throws JsonGenerationException, JsonMappingException, IOException{
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String jsonStr = objectMapper.writeValueAsString(list);

        return jsonStr;


    }*/








