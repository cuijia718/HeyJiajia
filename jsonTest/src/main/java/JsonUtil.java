import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import net.sf.json.JSON;

import java.io.IOException;

public class JsonUtil {

        public static String JsonFormatToString(JSON Object)
                throws JsonGenerationException, JsonMappingException, IOException {
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                String str = objectMapper.writeValueAsString(Object);
                return str;

        }


}
