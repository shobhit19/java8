package supplierInterface;

import java.util.function.Supplier;

public class TestRunner2 {


    /**
     *  Lazy evaluation -> here if the number is odd and isEven() method returns false
     *  then isDivisbleBy10() method would not be called which means which we have skip one
     *  method call.
     *
     *  But if we have not used Supplier interface then both method would have been called.
     */

    public static void main(String []args){
        System.out.println(compute(()->isEven(5),()->isDivisibleBy10(10)));

    }
    public static boolean compute(Supplier<Boolean> even, Supplier<Boolean> divisibleBy10){
        return even.get() && divisibleBy10.get();
    }
    public static boolean isDivisibleBy10(int i){
        System.out.println("in div by 10 method");
        return i%10==0;
    }
    public static boolean isEven(int i){
        System.out.println("in div by 2 method");
        return i%2==0;
    }
}
