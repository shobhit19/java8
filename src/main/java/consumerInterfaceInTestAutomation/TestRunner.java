package consumerInterfaceInTestAutomation;

import morelambdaexpressions.MethodAcceptOneParamAndAlsoReturns.IPrintable;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestRunner {

    public static void main(String []args){

        List<String> list = Arrays.asList("abc","def","ghi");

        // Without Java8
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(String temp: list){
//            System.out.println(temp);
//        }

        // With Java 8

        Consumer<String> consumer = (s)->{System.out.println(s);};
        Consumer<String> consumer1 = (s)->System.out.println(s.toUpperCase());

//        list.forEach(consumer);
//        list.forEach(consumer1);

        // OR
        list.forEach((s)->System.out.println(s));
        /**
         * abc
         * def
         * ghi
         */
        list.forEach(consumer.andThen(consumer1));
        /**
         * abc
         * ABC
         * def
         * DEF
         * ghi
         * GHI
         */
    }
}
