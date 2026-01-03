package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer>numbers=Arrays.asList(1,2,3,4,5);

        List<Integer> list=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);
        /*
            Explanation: The filter method is used to apply a condition that keeps only even numbers.
            The collect method gathers the results into a new list.
         */

        Optional<Integer>max=numbers.stream().max(Integer::compare);
        System.out.println(max.get());
        /*
            Explanation: The max method takes a comparator and returns the maximum element
            wrapped in an Optional.
         */

        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum:"+sum);
        /*
        Sum of Elements in a list of array
         */

        List<String>names=Arrays.asList("Charlie","alice","bob");
        List<String>upperCase= names.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);
        /*
        Explanation: The map function applies String::toUpperCase to each element,
        transforming them to uppercase.
         */
        
    }
}
