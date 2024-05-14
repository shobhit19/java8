package anonymousclass;

public class ConsolePrinterImpl implements IPrintable{

    @Override
    public void print() {
        System.out.println("Printing from console");
    }
}
