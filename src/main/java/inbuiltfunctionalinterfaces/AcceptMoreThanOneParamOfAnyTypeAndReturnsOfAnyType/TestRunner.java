package inbuiltfunctionalinterfaces.AcceptMoreThanOneParamOfAnyTypeAndReturnsOfAnyType;

public class TestRunner {

    public static void main(String[] args) {

        MyInterface<String,String,String> obj = (a,b)->{return a+""+b;};

        System.out.println(obj.someName("abj","cedfwe"));
    }
}
