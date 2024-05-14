package morelambdaexpressions.MethodDoesNotAcceptButReturns;

public class TestRunner {

    public static void main(String[] args) {

        IPrintable obj = ()->{return "hello";};
        System.out.println(obj.print());

        // or
        IPrintable obj1 = ()->"hello";
        System.out.println(obj1.print());
    }
}
