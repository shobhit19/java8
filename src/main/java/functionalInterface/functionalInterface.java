package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class functionalInterface {

    private static Function<Integer,Integer> add5 = (i)->i+5;
    private static UnaryOperator<Integer> add5UsingUnary = (i)->i+5;
    private static Function<Integer,Integer> mul5 = (i)->i*5;
    private static Function<Integer,Integer> add5Mult5 = (i)->(i+5)*5;
    private static Function<Integer,Integer> mult5Add5 = (i)->(i*5)+5;
    private static Function<Integer,Integer> same = Function.identity(); // similar to i->i

    private static Function<String,Integer> length = s->s.length();

    private static BiFunction<Integer,Integer,Integer> sumUsingBiFunction = (a,b)->a+b;
    private static BinaryOperator<Integer> sumUsingBinaryOperator = (a,b)->a+b;

    // Output type of first function is input type for second one for method chaining
    public static void main(String []atghs){

        System.out.println(add5.apply(5));
        System.out.println(mul5.apply(5));
        System.out.println(add5Mult5.apply(5));
        System.out.println(mult5Add5.apply(5));


        System.out.println(add5.andThen(mul5).andThen(add5Mult5).andThen(mult5Add5).apply(5));

        System.out.println(same.apply(5));

        System.out.println(length.apply("Testing"));
        System.out.println(length.andThen(add5).apply("Testing mini bytes"));

        System.out.println(add5UsingUnary.apply(5));
        System.out.println(sumUsingBiFunction.apply(1,1));
        System.out.println(sumUsingBinaryOperator.apply(9,8));
    }
}
