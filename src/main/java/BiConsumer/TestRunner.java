package BiConsumer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class TestRunner {

    public static void main(String []args) throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);


        for(Map.Entry<Object,Object> entry : prop.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // Bi-Consumer
        prop.forEach((k,v)->System.out.println(k+":"+v));
        prop.entrySet().forEach((e)->System.out.println(e.getKey()+":"+e.getValue()));

    }
}
