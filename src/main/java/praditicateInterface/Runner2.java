package praditicateInterface;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Runner2 {

    @Test
    public void predicateTest(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        sumUsingJava8(numbers,i->true);
        sumUsingJava8(numbers,i->i%2==0);
        sumUsingJava8(numbers,i->i%2!=0);

    }

    private void sumUsingJava8(List<Integer> numbers, Predicate<Integer> predicate){
        System.out.println(numbers
                .stream()
                .filter(predicate)
                .mapToInt(Integer::intValue)
                .sum());
    }
}
