package anonymousclass;

public class Runner {

    public static void main(String []args){

        IPrintable obj = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Printing from anonymous inner class");
            }
        };

        obj.print();
    }
}
