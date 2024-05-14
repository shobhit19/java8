package praditicateInterface;

import org.testng.annotations.Test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Runner {

    Predicate<Integer> isEven = (i)->i%2==0;
    Predicate<Integer> isOdd = i->i%2==1;
    Predicate<String> isSWA = s->s.startsWith("a");
    Predicate<String> isSWB = s->s.startsWith("b");
    Predicate<String> isSWAorSWB = isSWA.or(isSWB);
    BiPredicate<String,String> isLengthMatching = (a,b)->a.length()==b.length();
    BiPredicate<Integer,Integer> isSumDivBy10 = (a,b) -> (a+b)%10==0;

    @Test
    public void predicateTest(){
        System.out.println("isEven.test() "+isEven.test(9));
        System.out.println("isOdd.test() "+isOdd.test(9));
        System.out.println("isOdd.test() "+isEven.negate().test(10));
        System.out.println(isSWAorSWB.test("amamama"));
        System.out.println(isSWAorSWB.test("bncdo"));
        System.out.println(isLengthMatching.test("sky","flu"));
        System.out.println(isSumDivBy10.test(3,7));
    }
}
