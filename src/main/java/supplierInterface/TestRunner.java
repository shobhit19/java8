package supplierInterface;

import org.testng.annotations.Test;

import java.util.function.Supplier;

public class TestRunner {

    private static Supplier<Double> supplier = ()->Math.random();
    private static Supplier<String> stringSupplier = ()->"Hello world";
        @Test
        public void test(){
            System.out.println(supplier.get());
            System.out.println(stringSupplier.get());
        }

    }
