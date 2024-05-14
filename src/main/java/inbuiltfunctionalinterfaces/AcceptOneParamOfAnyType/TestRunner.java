package inbuiltfunctionalinterfaces.AcceptOneParamOfAnyType;

import inbuiltfunctionalinterfaces.AcceptOneParamOfAnyType.IPrintable;

public class TestRunner {

    public static void main(String[] args) {

        IPrintable obj = (a)->{System.out.println(a);};
        obj.print("i am there");

        IPrintable obj1 = (a)->{System.out.println(a);};
        obj1.print(10);
    }
}
