package morelambdaexpressions.MethodAcceptOneParamAndAlsoReturns;

public class TestRunner {

    public static void main(String[] args) {

        IPrintable obj = (a)->{a=a.toLowerCase();
            System.out.println(a);
             return a;
                };
//        System.out.println(obj.print("IGDYWIgdef"));
        obj.print("IGDYWIgdef");
    }
}
