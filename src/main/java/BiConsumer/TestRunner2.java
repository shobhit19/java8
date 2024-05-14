package BiConsumer;

import java.util.HashMap;
import java.util.Map;

public class TestRunner2 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Testing mini bytes");
        map.put(2,"sdwjbfd");
        map.put(3,"febf33");
        map.put(4,"d322");

        for(Map.Entry<Integer,String > e : map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

        for (Integer key:map.keySet()){
            System.out.println(key +" : "+map.get(key));
        }
        map.forEach((a,b)->System.out.println(a+" : "+b));
        map.keySet().forEach(k->System.out.println(map.get(k)));
    }
}
