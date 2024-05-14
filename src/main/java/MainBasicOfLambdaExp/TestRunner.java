package MainBasicOfLambdaExp;

public class TestRunner {

    public static void main(String[] args) {

        // conventional way
        IPrintable obj = new LogImpl();
        obj.print();

        // Anonymous inner class
//        IPrintable obj1 = new IPrintable() {
//            @Override
//            public void print() {
//                System.out.println("Anonymous inner class way");
//            }
//        };
//        obj1.print();
        // java 8 way
        /**
         *  Imp conditions without which lambda expression can't be used
         *  1. parameters should be same for the abstract method in the interface and lambda expression
         *  2. return type should also match
         *  3. Interface should only have one abstract and unimplemented method
         */
        IPrintable obj2= ()-> System.out.println("Lambda expression way");
        obj2.print();
    }
}
