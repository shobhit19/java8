package streamsTest;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

        //1. use of parallel() method directly on stream

        Stream.of("A","B","C","D","E","F")
                .parallel()
                .forEach((e)->System.out.println(e));

        System.out.println("--------");

        // 2. use of parallelStream() method in case of Collection

        Arrays.asList(1,2,3,4,5,6,7)
                .parallelStream()
                .forEach((e)->System.out.println(e));
        System.out.println("--------");

    }
}
