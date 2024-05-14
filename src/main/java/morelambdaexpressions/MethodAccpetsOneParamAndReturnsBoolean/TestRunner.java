package morelambdaexpressions.MethodAccpetsOneParamAndReturnsBoolean;

public class TestRunner {

    public static void main(String []args){

        IPrintable obj = (a)->{return a.length()>0;};

        System.out.println(obj.print("dlb2di2ubf42f"));

    }
}
