package streamsTest;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

    public static void main(String[] args) {

        /**
         *  List of customer objects:
         */

        List<Customer> customerList = Arrays.asList(new Customer("x",21)
                                        ,new Customer("y",22)
                                        ,new Customer("z",23));


        // 1. filter - findAny
        Customer customer=customerList.stream().filter((e)->e.getName().equalsIgnoreCase("y"))
                .findAny()// if it finds then return
                        .orElse(null);

        System.out.println(customer.getName()+" : "+customer.getAge());

        System.out.println("------------------");

        // 2. filter - did not find any.. orElse
        Customer customer1=customerList.stream().filter((e)->e.getName().equalsIgnoreCase("a"))
                .findAny()// if it finds then return
                .orElse(null);
        System.out.println(customer1);

        System.out.println("------------------");

        // 3. filter with multiple conditions:

        Customer customer2=customerList.stream()
                .filter((x)->x.getName().equalsIgnoreCase("x")
                    && x.getAge() == 21)
                .findAny()
                .orElse(null);

        System.out.println(customer2.getName()+" : "+customer2.getAge());

    }
}
