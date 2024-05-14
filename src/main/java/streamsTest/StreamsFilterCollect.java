package streamsTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

    public static void main(String []args){


        List<String> productList = Arrays.asList("Macbook","iPhone","Battery Charger","Bat");

        System.out.println(productList);
        productList.forEach((e)->System.out.println("Output without stream "+e));

        List<String> result=productList
                .stream()
                .filter(ele -> ele.equals("Macbook"))
                .collect(Collectors.toList());
        result.forEach(e->System.out.println("Output with stream "+e));
    }
}
