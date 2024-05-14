package morelambdaexpressions.MethodAcceptsOneParam;

public class LambdaWithParam {

    // Method accepts one param and does not return anything
    public static void main(String[] args) {
        IPrintable obj = (b)->{System.out.println(b);};
        obj.print(6);

    }
}
