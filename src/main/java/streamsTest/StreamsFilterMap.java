package streamsTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(new Customer("x",21)
                ,new Customer("y",22)
                ,new Customer("z",23));

        // 1. Print name from the list
        String name = customerList.stream()
                .filter(e->e.getName().equalsIgnoreCase("x"))
                .map(e->e.getName())
                .findAny()
                .orElse(null);

        System.out.println(name);

        System.out.println("------");

        //2. print all names from the list

        List<String> custList=customerList.stream()
                .map(customer->customer.getName())
                .collect(Collectors.toList());

        custList.forEach(e->System.out.println(e));

    }
}
