package streamsTest;

import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialStreams {

    public static void main(String []args){

        //1.
        Stream stream = Stream.of("Naveeen","Tom","Selvein","Peter");
        stream.forEach((e)->System.out.println(e));

        System.out.println("--------");

        //2.
        Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent((e)->System.out.println(e));

        System.out.println("-----");

        //3.
        Arrays.stream(new int[]{1,2,3,4})
                .map(n->2*n+1)
                .average()
                .ifPresent(e->System.out.println(e));
    }
}
