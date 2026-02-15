package org.example.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

//        List<Integer>numbers=Arrays.asList(1,2,3,4,5);
//
//        List<Integer> list=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(list);
//        /*
//            Explanation: The filter method is used to apply a condition that keeps only even numbers.
//            The collect method gathers the results into a new list.
//         */
//
//        Optional<Integer>max=numbers.stream().max(Integer::compare);
//        System.out.println(max.get());
//        /*
//            Explanation: The max method takes a comparator and returns the maximum element
//            wrapped in an Optional.
//         */
//
//        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Sum:"+sum);
//        /*
//        Sum of Elements in a list of array
//         */
//
//        List<String>names=Arrays.asList("Charlie","alice","bob");
//        List<String>upperCase= names.stream().map(String::toUpperCase).toList();
//        System.out.println(upperCase);
//        /*
//        Explanation: The map function applies String::toUpperCase to each element,
//        transforming them to uppercase.
//         */
//
//
//        List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
//        double Average=nums.stream()
//                .mapToDouble(Integer::doubleValue)
//                .average()
//                .orElse(0.0);
//        System.out.println("Average:"+ Average);
//
//        List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
//        List<String>Upper=colors.stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println("UpperCase:"+ Upper);
//
//        List<String>Lower=colors.stream()
//                .map(String::toLowerCase)
//                .toList();
//        System.out.println(Lower);
//
//        List < Integer > number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int even_sum=number.stream()
//                .filter(s->s%2==0)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println("Sum:"+even_sum);
//
//        int odd_sum=number.stream()
//                .filter(s->s%2!=0)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println("Sum:"+odd_sum);
//
//        List < Integer > num = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
//        List<Integer>distinct=num.stream()
//                .distinct()
//                .toList();
//        System.out.println(distinct);
//
//        List < String > color = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
//        char startingChar='B';
//        long count=color.stream()
//                .filter(s->s.startsWith(String.valueOf(startingChar)))
//                .count();
//        System.out.println("Number of colors Starting with given Starting character:"+count);
//
//        List<String>ascendingOrder=color.stream()
//                .sorted()
//                .toList();
//        System.out.println("Ascending order Sorting:"+ascendingOrder);
//
//        List<String>descendingOrder=color.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//        System.out.println("Descending Order Sorting:"+descendingOrder);
//
//        List < Integer > numb = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//        Integer max_value=numb.stream()
//                .max(Integer::compare)
//                .orElse(null);
//        System.out.println("Maximum Value:"+max_value);
//
//        Integer min_value=numb.stream()
//                .min(Integer::compare)
//                .orElse(null);
//        System.out.println("Minimum Value:"+min_value);
//
//        Integer second_smallest=numb.stream()
//                .distinct()
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        System.out.println("Second Smallest:"+second_smallest);
////*******************************************************************************************************************************************
//
//        Employee e1  = new Employee(1,  "Aman",   20000, 25, "IT");
//        Employee e2  = new Employee(2,  "Ravi",   45000, 32, "HR");
//        Employee e3  = new Employee(3,  "Neha",   55000, 28, "Finance");
//        Employee e4  = new Employee(4,  "Pooja",  30000, 22, "IT");
//        Employee e5  = new Employee(5,  "Rahul",  70000, 35, "Finance");
//        Employee e6  = new Employee(6,  "Ankit",  18000, 19, "Support");
//        Employee e7  = new Employee(7,  "Sneha",  62000, 30, "HR");
//        Employee e8  = new Employee(8,  "Vikas",  80000, 40, "IT");
//        Employee e9  = new Employee(9,  "Kiran",  27000, 24, "Support");
//        Employee e10 = new Employee(10, "Priya",  52000, 29, "Finance");
//
//        Employee e11 = new Employee(11, "Rohit",  90000, 45, "IT");
//        Employee e12 = new Employee(12, "Meena",  33000, 26, "HR");
//        Employee e13 = new Employee(13, "Suresh", 48000, 31, "Support");
//        Employee e14 = new Employee(14, "Nisha",  76000, 38, "Finance");
//        Employee e15 = new Employee(15, "Arjun",  15000, 18, "Support");
//
//        Employee e16 = new Employee(16, "Kavya",  58000, 27, "IT");
//        Employee e17 = new Employee(17, "Deepak", 67000, 34, "HR");
//        Employee e18 = new Employee(18, "Swati",  42000, 23, "Finance");
//        Employee e19 = new Employee(19, "Manoj",  88000, 41, "IT");
//        Employee e20 = new Employee(20, "Rina",   36000, 28, "Support");
//
//        Employee e21 = new Employee(21, "Aakash", 51000, 29, "Finance");
//        Employee e22 = new Employee(22, "Divya",  61000, 33, "HR");
//        Employee e23 = new Employee(23, "Nitin",  47000, 27, "IT");
//        Employee e24 = new Employee(24, "Shreya", 69000, 36, "Finance");
//        Employee e25 = new Employee(25, "Varun",  25000, 21, "Support");
//
//        List<Employee> emp = List.of(
//                e1, e2, e3, e4, e5,
//                e6, e7, e8, e9, e10,
//                e11, e12, e13, e14, e15,
//                e16, e17, e18, e19, e20,
//                e21, e22, e23, e24, e25
//        );
//        System.out.println("***********************");
//        //Employees Age > 30
//        emp.stream().filter(e-> e.getAge() > 30).forEach(System.out::println);
//
//        System.out.println("***********************");
//        //Names of all Employees
//        emp.stream().map(Employee::getName).forEach(System.out::println);
//
//        System.out.println("***********************");
//        //Count Employees in each department
//        Map<String,Long>result=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(result);
//
//        double average_salary=emp.stream().mapToDouble(Employee::getSalary).average().orElse(0);
//        System.out.println("Average Salary:"+average_salary);
//
//        System.out.println("***********************");
//        Employee employee=emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
//        System.out.println("Employee with Maximum Salary:"+employee);
//
//        System.out.println("***********************");
//        Employee employee1=emp.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
//        System.out.println("Minimum Salary :"+employee1);
//
//        System.out.println("***********************");
//        //Department wise Grouping of Employees
//        Map<String,List<Employee>>emp_dept=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(emp_dept);
//
//        System.out.println("***********************");
//        Map<String,Double>dept_salary=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
//        System.out.println("Department wise salary sum:"+dept_salary);
//
//        System.out.println("***********************");
//        //Employees sorted by salary
//        emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
//
//        System.out.println("***********************");
//        //Employees whose Name starts with A
//        emp.stream().filter(a->a.getName().startsWith("A")).forEach(System.out::println);
//
//        System.out.println("***********************");
//        String namings=emp.stream().map(Employee::getName).collect(Collectors.joining(", "));
//        System.out.println(namings);
//
//        //Check if any Employee earns more than 1 Lakh
//        boolean exists=emp.stream().anyMatch(e->e.getSalary()> 100000);
//        System.out.println(exists);
//
//        boolean adults=emp.stream().allMatch(e->e.getAge()>=18);
//        System.out.println(adults);
//
//        //Grouping By Senior or Junior
//        System.out.println("***********************");
//        Map<String,List<Employee>>results=emp.stream().collect(Collectors.groupingBy(e->e.getAge()>30 ? "Senior" : "Junior"));
//        System.out.println(results);

        //Even Numbers
        List<Integer>nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(nums.stream().filter(a-> a%2==0).count());
        List<Integer>list=nums.stream().filter(a->a%2==0).toList();
        System.out.println(list);

         System.out.println("************************************************************");
        //Square all Numbers
         List<Integer>nums1 = List.of(1,2,3,4,5);
         List<Integer>integers= nums1.stream().map(a-> a*a).toList();
         System.out.println(integers);

         System.out.println("************************************************************");
         //Convert to UpperCase
         List<String>lower = List.of("java","spring","boot");
         List<String> upper = lower.stream().map(String::toUpperCase).toList();
         System.out.println(upper);

         System.out.println("************************************************************");
         //Maximum Length
         List<Integer>length = lower.stream().map(String::length).toList();
         System.out.println(length);

         String lengthMaximum = lower.stream().max(Comparator.comparingInt(String::length)).orElse(null);
         System.out.println("Maximum Length String in UpperCase:"+ lengthMaximum.toUpperCase());

         System.out.println("************************************************************");
         List<String>srtng=List.of("Amit","Rahul","Ankit","John","Aman");
         System.out.println("String Starting with A : " +srtng.stream().filter(a-> a.startsWith("A")).count());
         System.out.println("String with Length 5 :"+srtng.stream().filter(a->a.length()==5).toList());

         System.out.println("************************************************************");
         List<Integer>arr=List.of(10,25,3,90,45);
         System.out.println("Maximum Number from List of Array:"+ arr.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0));
         System.out.println("Maximum Number from List of Array:"+ arr.stream().max(Integer::compareTo).orElse(0));

         System.out.println("************************************************************");
         List<Integer>arrs=List.of(1,2,2,3,4,4,5);
         System.out.println("Distinct Numbers:"+ arrs.stream().distinct().toList());

         System.out.println("************************************************************");
         Person p1 = new Person(1,"Aman",23330);
         Person p2 = new Person(2,"Anand",32444);
         Person p3 = new Person(3,"Asif",20000);
         Person p4 = new Person(4,"Alok",26700);
         Person p5 = new Person(5,"Babooo",22330);

         List<Person>people = List.of(p1,p2,p3,p4,p5);
         List<Person> personList= people.stream().filter(a-> a.getSalary()>20000).toList();
         personList.forEach(System.out::println);

         System.out.println("************************************************************");
         System.out.println("Ascending Order Salary: "+people.stream().sorted(Comparator.comparingDouble(Person::getSalary)).toList());
         System.out.println("Descending Order Salary: "+ people.stream().sorted(Comparator.comparingDouble(Person::getSalary).reversed()).toList());

         System.out.println("Second Highest Salary: "+ people.stream()
                         .sorted(Comparator.comparingDouble(Person::getSalary).reversed())
                         .skip(1)
                 .findFirst().orElse(null));

         System.out.println("Second Lowest Salary: "+ people.stream().sorted(Comparator.comparingDouble(Person::getSalary))
                 .skip(1)
                 .findFirst()
                 .orElse(null));

         System.out.println("Third Lowest Salary: "+ people.stream().sorted(Comparator.comparingDouble(Person::getSalary))
                .skip(2)
                .findFirst()
                .orElse(null));

         System.out.println("************************************************************");
         List<Integer>array = List.of(10,5,20,8,25,25,3);
         System.out.println("Second Highest Number:"+
                 array.stream()
                         .distinct()
                         .sorted(Comparator.reverseOrder())
                         .skip(1)
                         .findFirst()
                         .stream().toList());

         System.out.println("************************************************************");
         List<String>arrays=List.of("apple","banana","mango");
         System.out.println("Join String with Commas :"+arrays.stream().collect(Collectors.joining(",")));

         System.out.println("************************************************************");
         List<Integer>integers1 = List.of(1,2,3,4,5);
         System.out.println("Sum of all Numbers :"+ integers1.stream().reduce(Integer::sum).get());
         System.out.println("Average of all Numbers :"+ integers1.stream().mapToInt(Integer::intValue).average().orElse(0.0));
         System.out.println("Minimum of all Numbers :"+ integers1.stream().sorted().findFirst().get());
         System.out.println("Maximum of all Numbers :"+ integers1.stream().reduce(Integer::max).get());
         System.out.println("************************************************************");

        List<Employee> emp = getEmployees();

        Map<String , List<Employee>>dptEmp= emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Grouping Employees DepartmentWise: "+dptEmp);

        System.out.println("************************************************************");
        Map<String, Optional<Employee>>salaryEmp= emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Department Wise Maximum Salary: "+salaryEmp);

        System.out.println("************************************************************");
        Map<String,Double>salarySum= emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Department Wise Salary Sum: "+salarySum);

        System.out.println("************************************************************");
        Map<String,Optional<Employee>>highestPaid= emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Highest Paid Employees DepartmentWise:"+ highestPaid);

        System.out.println("************************************************************");
        System.out.println("Partition Even and Odd:"+ array.stream().collect(Collectors.partitioningBy(a-> a%2==0)));

        System.out.println("************************************************************");
        Set<Integer>duplicates=arrs.stream()
                .filter(n->Collections.frequency(arrs,n)>1)
                .collect(Collectors.toSet());
        System.out.println("Duplicate Elements: "+duplicates);

        System.out.println("************************************************************");
        Map<Integer,Long>map=arrs.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("Frequency of Each Element :"+map);

        System.out.println("************************************************************");
        Map<Integer,Long>maps= arrs.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream()
                .filter(n-> n.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("Only Duplicate Elements with Frequency: "+maps);

        System.out.println("************************************************************");
    }

    private static List<Employee> getEmployees() {
        Employee e1  = new Employee(1,  "Aman",   20000, 25, "IT");
        Employee e2  = new Employee(2,  "Ravi",   45000, 32, "HR");
        Employee e3  = new Employee(3,  "Neha",   55000, 28, "Finance");
        Employee e4  = new Employee(4,  "Pooja",  30000, 22, "IT");
        Employee e5  = new Employee(5,  "Rahul",  70000, 35, "Finance");
        Employee e6  = new Employee(6,  "Ankit",  18000, 19, "Support");
        Employee e7  = new Employee(7,  "Sneha",  62000, 30, "HR");
        Employee e8  = new Employee(8,  "Vikas",  80000, 40, "IT");
        Employee e9  = new Employee(9,  "Kiran",  27000, 24, "Support");
        Employee e10 = new Employee(10, "Priya",  52000, 29, "Finance");

        Employee e11 = new Employee(11, "Rohit",  90000, 45, "IT");
        Employee e12 = new Employee(12, "Meena",  33000, 26, "HR");
        Employee e13 = new Employee(13, "Suresh", 48000, 31, "Support");
        Employee e14 = new Employee(14, "Nisha",  76000, 38, "Finance");
        Employee e15 = new Employee(15, "Arjun",  15000, 18, "Support");

        Employee e16 = new Employee(16, "Kavya",  58000, 27, "IT");
        Employee e17 = new Employee(17, "Deepak", 67000, 34, "HR");
        Employee e18 = new Employee(18, "Swati",  42000, 23, "Finance");
        Employee e19 = new Employee(19, "Manoj",  88000, 41, "IT");
        Employee e20 = new Employee(20, "Rina",   36000, 28, "Support");

        Employee e21 = new Employee(21, "Aakash", 51000, 29, "Finance");
        Employee e22 = new Employee(22, "Divya",  61000, 33, "HR");
        Employee e23 = new Employee(23, "Nitin",  47000, 27, "IT");
        Employee e24 = new Employee(24, "Shreya", 69000, 36, "Finance");
        Employee e25 = new Employee(25, "Varun",  25000, 21, "Support");

        List<Employee> emp = List.of(
                e1, e2, e3, e4, e5,
                e6, e7, e8, e9, e10,
                e11, e12, e13, e14, e15,
                e16, e17, e18, e19, e20,
                e21, e22, e23, e24, e25
        );
        return emp;
    }
}
