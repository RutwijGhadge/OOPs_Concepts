package org.example.Streams;

import java.util.*;
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


        List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        double Average=nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average:"+ Average);

        List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String>Upper=colors.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("UpperCase:"+ Upper);

        List<String>Lower=colors.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println(Lower);

        List < Integer > number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int even_sum=number.stream()
                .filter(s->s%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum:"+even_sum);

        int odd_sum=number.stream()
                .filter(s->s%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum:"+odd_sum);

        List < Integer > num = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        List<Integer>distinct=num.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        List < String > color = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startingChar='B';
        long count=color.stream()
                .filter(s->s.startsWith(String.valueOf(startingChar)))
                .count();
        System.out.println("Number of String Starting with given Starting character:"+count);

        List<String>ascendingOrder=color.stream()
                .sorted()
                .toList();
        System.out.println("Ascending order Sorting:"+ascendingOrder);

        List<String>descendingOrder=color.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Descending Order Sorting:"+descendingOrder);

        List < Integer > numb = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        Integer max_value=numb.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println("Maximum Value:"+max_value);

        Integer min_value=numb.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println("Minimum Value:"+min_value);

        Integer second_smallest=numb.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Smallest:"+second_smallest);
//********************************************************************************************************************************************
        Employee e1=new Employee(1,"xyz",20000,25,"Aman");
        Employee e2=new Employee(2,"abc",25000,25,"Ajay");
        Employee e3=new Employee(3,"pqr",24000,25,"vinod");
        Employee e4=new Employee(4,"xyz",19000,25,"sid");
        Employee e5=new Employee(5,"abc",89000,25,"shyam");

        List<Employee>emp=List.of(e1,e2,e3,e4,e5);
        Map<String,Employee>result=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.maxBy(
                        Comparator.comparingDouble(Employee::getSalary)
                ),Optional::get)));
        result.forEach((dept,emps)->System.out.println(emps.getDepartment()+" : "+emps.getSalary()));
    }
}
