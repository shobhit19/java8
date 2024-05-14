package morelambdaexpressions.MethodAcceptsTwoParam;

public class TestRunner {

    public static void main(String[] args) {

        IPrintable obj = (a,b)->{System.out.println(a+" "+b);};
        obj.print("abc","xyz");
    }
}
