package org.example.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 7, 4, 5, 2, 3);
//        List<Integer> reversed = numbers.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println("Sorting in reverse Order:" + reversed);
//
//        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int product = number.stream().reduce((a, b) -> a * b).get();
//        System.out.println("Product of Numbers:" + product);
//
//        List<Integer> result = numbers.stream().filter(number::contains).toList();
//        System.out.println("Common Elements from both Lists:" + result);
//
//        //word length map
//        String strss = "Java Code Design by Naman Sarawat";
//        Map<String, Integer> map = Arrays.stream(strss.split(" ")).collect(Collectors.toMap(Function.identity(), String::length));
//        System.out.println("Words Length Map" + map);
//
//        //find K Length words in a sentence
//        List<String> strings = Arrays.stream(strss.split(" ")).filter(s -> s.length() == 5).toList();
//        System.out.println("K length words in a sentence:" + strings);
//
//        //find K Longest words in a sentence
//        int k = 5;
//        List<String> strings1 = Arrays.stream(strss.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).limit(k).toList();
//        System.out.println("K longest words in a sentence:" + strings1);
//
//        List<Integer> list = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println("Sorting odd Numbers from List:" + list);
//
//        int even = number.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
//        System.out.println("Even Sum:" + even);
//
//        System.out.println("*****************************************************************");
//        Optional<Integer> ans = numbers.stream().max(Integer::compare);
//        System.out.println("Maximum Number: " + ans.get());
//
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        System.out.println("Minimum from List: " + min.get());
//
//        OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
//        System.out.println(average.getAsDouble());
//
//
//        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Total Sum:" + sum);
//
//        System.out.println("*****************************************************************");
//        List<String> names = Arrays.asList("Charlie", "Bob", "Alice");
//        //Grouping of Words by first Letter
//        Map<Character, List<String>> group_by_letters = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
//        System.out.println("Grouping of words by first Letter:" + group_by_letters);
//
//        Map<Integer, List<String>> resultz = names.stream().collect(Collectors.groupingBy(s -> s.length()));
//        System.out.println("Length wise Grouping:" + resultz);
//
//        //Handle Null Case
//        Map<Character, List<String>> group_by_Letters_null_handle = names.stream().filter(s -> s != null && !s.isEmpty()).collect(Collectors.groupingBy(s -> s.charAt(0)));
//        System.out.println("Grouping by first Character:" + group_by_Letters_null_handle);
//
//        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
//        System.out.println("Upper Case:" + upperCase);
//
//        List<String> lowerCase = names.stream().map(String::toLowerCase).toList();
//        System.out.println("Lower Case:" + lowerCase);
//
//        List<Integer> length = names.stream().map(String::length).toList();
//        System.out.println("Length :" + length);
//
//        System.out.println("*****************************************************************");
//        List<String> color = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
//        List<String> startsWith = color.stream().filter(s -> s.startsWith("B")).toList();
//        System.out.println("Starts With B:" + startsWith);
//
//        List<String> sortASC = color.stream().sorted().toList();
//        System.out.println("Ascending Order Sorting :" + sortASC);
//
//        List<String> sortDSC = color.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println("Descending Order Sorting:" + sortDSC);
//        System.out.println("*****************************************************************");
//
//        List<Employee> employees = getEmployees();
//
//        List<String> employees1 = employees.stream().filter(e -> e.getAge() > 30).map(Employee::getName).toList();
//        System.out.println("Names of Employees with with age>30:" + employees1);
//
//        List<String> emp_name_all = employees.stream().map(Employee::getName).toList();
//        System.out.println("Names of all the Employees:" + emp_name_all);
//
//        Optional<Employee> max_salary_employee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
//        System.out.println("Max Salary:" + max_salary_employee.get());
//
//        //min salary
//        Optional<Employee> min_salary = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
//        System.out.println("Minimum Salary:" + min_salary.get());
//
//        System.out.println("Average salary of all Employees:" + employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
//
//        Map<String, List<Employee>> dept_wise = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println("Department wise Grouping of Employees:" + dept_wise);
//
//        //Comparator : min , max
//        //Collector : Grouping
//
//        Map<String, Double> emp_salary_dept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
//        System.out.println("Department wise Salary sum:" + emp_salary_dept);
//
//        //Department wise List of Employees Names
//        Map<String, List<String>> dept_wise_names = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println("Department wise List of Employees:" + dept_wise_names);
//
//        //Department wise Count of Employees
//        Map<String, Long> dept_wise_count = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println("Department Wise Count of Employees:" + dept_wise_count);
//
//        //Department wise Highest Salary Employees
//        Map<String, Optional<Employee>> dept_wise_max_salary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println("Department wise highest salaried Employee:" + dept_wise_max_salary);
//
//        //Department wise Total Salary
//        Map<String, Double> dept_wise_total = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
//        System.out.println("Department wise Sum of Salary:" + dept_wise_total);
//
//        //Department wise highest salary
//        Map<String, Optional<Employee>> dept_highest_salary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        System.out.println("Department wise highest Salary:" + dept_highest_salary);
//
//        System.out.println("*****************************************************************");
//        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
//        Map<Character, Long> frequency = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        System.out.println("Frequency of Characters:" + frequency);
//
//
//        Map<String, List<String>> anagrams = words.stream().collect(Collectors.groupingBy(
//                word -> {
//                    char[] chars = word.toCharArray();
//                    Arrays.sort(chars);
//                    return new String(chars);
//                }
//        ));
//        System.out.println("Anagram Strings:" + anagrams);
//
//        Map<Character, List<String>> maps = words.stream().collect(Collectors.groupingBy(c -> c.charAt(0)));
//        System.out.println("Grouping of words by 1st Letter:" + maps);
//
//        String str = "Java Stream APIs";
//        String results = Arrays.stream(str.split(" ")).map(word -> word.substring(0, 1)).collect(Collectors.joining());
//        System.out.println("First Character of String:" + results);
//
//        List<Integer> numsty = List.of(10, 5, 20, 30, 25);
//        System.out.println("Second Highest:" + numsty.stream().sorted().skip(1).findFirst().get());
//
//        Map<String, List<Employee>> group_By_Dept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(group_By_Dept);
//
        List<Integer> nums_freq = List.of(1, 3, 2, 3, 1, 3);
//        //Find Duplicate From List
//        List<Integer> arr = nums_freq.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1).map(v -> v.getKey()).toList();
//        System.out.println("Duplicate Values:" + arr);
//
//        HashSet<Integer> hs = new HashSet<>();
//        List<Integer> ls = nums_freq.stream().filter(v -> !hs.add(v)).collect(Collectors.toSet()).stream().toList();
//        System.out.println("Duplicate Numbers:" + ls);
//
//        Map<Integer, Long> mapss = nums_freq.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        System.out.println("Numbers Frequency:" + mapss);
//
//        List<String> starts_with = words.stream().filter(s -> s.startsWith("a")).toList();
//        System.out.println(starts_with);
//
//        String strs = "There is a beautiful girl in the park and it is raining in the park";
//        String[] chars = strs.split(" ");
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < chars.length; i++)
//            hm.put(chars[i], hm.getOrDefault(chars[i], 0) + 1);
//        System.out.println(hm);
//
//        Map<String, Long> map1 = Arrays.stream(strs.split(" ")).collect(Collectors.groupingBy(wo -> wo, Collectors.counting()));
//        System.out.println("Word wise Frequency:" + map1);
//
//        List<Integer> numb = List.of(1, 2, 3, 4, 5);
//        int sums = numb.stream().reduce((a, b) -> a * b).get();
//        System.out.println("Sum of Product:" + sums);

        HashSet<Integer> hst = new HashSet<>();
        List<Integer> answers = nums_freq.stream().filter(s -> !hst.add(s)).collect(Collectors.toSet()).stream().toList();
        System.out.println("Duplicate Numbers:" + answers);

        Map<Integer, String> map = getEmployees().stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println("Converted to Map:" + map);

        //Group Objects by Field Department
        Map<String, List<String>> map1 = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Group Objects by Department:" + map1);

        Map<String, List<Employee>> groupByDepartment = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        System.out.println("Group By Department:" + groupByDepartment);

        //Departmentwise Highest Salary
        Map<String, Optional<Employee>> departmentwise_Highest_Salary = getEmployees().stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        System.out.println("Department Wise Highest Salary:" + departmentwise_Highest_Salary);

        //Find Duplicate Employee by Name
        HashSet<String> hs = new HashSet<>();
        List<Employee> names = getEmployees().stream().filter(name -> !hs.add(name.getName())).toList();
        names.forEach(e -> System.out.println("Duplicate Names:" + e.getName()));

        //Group Employees by Age Range
        Map<String, List<Employee>> groupByAgeRange = getEmployees().stream().collect(
                Collectors.groupingBy(emp -> {
                    int age = emp.getAge();
                    int lower = (age / 10) * 10;
                    int upper = lower + 9;
                    return lower + "_" + upper;
                }));
        System.out.println("Grouping by Age:" + groupByAgeRange);

        //Find top N employees per department
        int N = 2;
        Map<String, List<Employee>> maps = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(N).toList())));
        System.out.println("Top N Employees Department Wise:" + maps);

    }


    private static List<Employee> getEmployees() {
        Employee e1 = new Employee(1, "Aman", 20000, 25, "IT");
        Employee e2 = new Employee(2, "Ravi", 45000, 32, "HR");
        Employee e3 = new Employee(3, "Neha", 55000, 28, "Finance");
        Employee e4 = new Employee(4, "Pooja", 30000, 22, "IT");
        Employee e5 = new Employee(5, "Rahul", 70000, 35, "Finance");
        Employee e6 = new Employee(6, "Ankit", 18000, 19, "Support");
        Employee e7 = new Employee(7, "Sneha", 62000, 30, "HR");
        Employee e8 = new Employee(8, "Vikas", 80000, 40, "IT");
        Employee e9 = new Employee(9, "Kiran", 27000, 24, "Support");
        Employee e10 = new Employee(10, "Priya", 52000, 29, "Finance");

        Employee e11 = new Employee(11, "Rohit", 90000, 45, "IT");
        Employee e12 = new Employee(12, "Meena", 33000, 26, "HR");
        Employee e13 = new Employee(13, "Suresh", 48000, 31, "Support");
        Employee e14 = new Employee(14, "Nisha", 76000, 38, "Finance");
        Employee e15 = new Employee(15, "Arjun", 15000, 18, "Support");

        Employee e16 = new Employee(16, "Kavya", 58000, 27, "IT");
        Employee e17 = new Employee(17, "Deepak", 67000, 34, "HR");
        Employee e18 = new Employee(18, "Swati", 42000, 23, "Finance");
        Employee e19 = new Employee(19, "Manoj", 88000, 41, "IT");
        Employee e20 = new Employee(20, "Rina", 36000, 28, "Support");

        Employee e21 = new Employee(21, "Aakash", 51000, 29, "Finance");
        Employee e22 = new Employee(22, "Divya", 61000, 33, "HR");
        Employee e23 = new Employee(23, "Nitin", 47000, 27, "IT");
        Employee e24 = new Employee(24, "Shreya", 69000, 36, "Finance");
        Employee e25 = new Employee(25, "Varun", 25000, 21, "Support");

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
