import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.sf.json.JSON;



public class GsonUtil {
    public static String GsonFormatToString(JSON Object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(Object);
    }
}
