package org.example.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.example.Streams.Demo.getEmployees;

public class PractiseStreams {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,4,5,6);
//        List<Integer>result = numbers.stream().filter(a->a%2==0).toList();
//        System.out.println(result);
//
//
//        List<Integer>lists = Arrays.asList(1, 2, 3, 2, 4, 5, 3);
//        HashSet<Integer>seen = new HashSet<>();
//        Set<Integer>duplicates = lists.stream().filter(n-> !seen.add(n)).collect(Collectors.toSet());
//        System.out.println(duplicates);
//
//        String input="banana";
//        Map<Character,Long> frequency = input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(frequency);
//
//        List<String>strings= List.of("Rutwij","Ankush","Ghadge");
//        String results= strings.stream().collect(Collectors.joining(", "));
//        System.out.println(results);
//
//        List<Employee>employees=List.of(new Employee("Amen","maths"),
//                new Employee("Yash","science"),
//                new Employee("Hari","maths"));
//
//        Map<String,List<Employee>>map= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(map);
//
//        Map<String,Long>map1=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(map1);

//        List<Integer> number = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
//        List<Integer>ans = number.stream().filter(a->a%2==0).toList();
//        System.out.println(ans);
//
//        List<String> names = Arrays.asList(
//                "Java",
//                null,
//                "",
//                "Spring",
//                "   ",
//                "Kafka",
//                null,
//                "Docker"
//        );
//        List<String>answer = names.stream().filter(Objects::nonNull).filter(s->!s.isBlank()).toList();
//        System.out.println(answer);
//
//        List<String> technologies = Arrays.asList(
//                "java",
//                "spring boot",
//                "kafka",
//                "docker",
//                "kubernetes"
//        );
//        List<String>upperCase = technologies.stream().map(String::toUpperCase).toList();
//        System.out.println(upperCase);
//
//        List<Employee> employees = Arrays.asList(
//                new Employee("Rahul", "science"),
//                new Employee("Amit", "xyz"),
//                new Employee("Sneha", "pqr"),
//                new Employee("Priya","abc")
//        );
//
//        List<String>name = employees.stream().map(Employee::getName).toList();
//        System.out.println(name);
//
//        List<Employee> employees1 = Arrays.asList(
//                new Employee("Rahul", 25, 50000),
//                new Employee("Amit", 30, 75000),
//                new Employee("Sneha", 28, 65000),
//                new Employee("Priya", 32, 90000)
//        );
//
//        List<Integer>salaries = employees1.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
//        System.out.println(salaries);
//
//        //Remove Duplicate Objects While Keeping the Latest Version
//        List<Employee>employees2 = Arrays.asList(
//                new Employee( "Alice", 1,3),
//                new Employee("Bob",2,5),
//                new Employee("Alice",1,4),
//                new Employee("John",3,2),
//                new Employee("Bob",2,6)
//        );
//
//        // Map<Integer,Employee>
//        Map<Integer,Employee>employeeMap = employees2.stream().collect(Collectors.toMap(
//                Employee::getId,
//                Function.identity(),
//                (existing,replacement) -> existing.getSalary()>=replacement.getSalary() ? existing : replacement));
//
//        System.out.println(employeeMap);
//
//        //Sort the words by their character frequency Pattern
//        List<String>words = Arrays.asList("abb", "foo", "egg", "aab", "xyz");
//        List<List<String>>frequencyMatching = words.stream().collect(Collectors.groupingBy(
//                word-> word.chars().boxed().collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                )).values().stream().sorted().toList()
//        )).values().stream().toList();
//
//        System.out.println(frequencyMatching);


        List<Integer> arr = Arrays.asList(10, 15, 20, 25, 30, 35);
        List<Integer> ans = arr.stream().filter(a -> a % 2 == 0).toList();
        System.out.println(ans);

        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> upper = names.stream().map(String::toUpperCase).toList();
        System.out.println(upper);

        List<String> naes =
                Arrays.asList("Bob", "Charlie", "Alice", "Andrew", "David");
        List<String> startsWith = naes.stream().filter(a -> a.startsWith("A")).toList();
        System.out.println(startsWith);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        List<Integer> numbrs = Arrays.asList(10, 45, 23, 89, 12, 67);
        int maxNumber = numbrs.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(maxNumber);

        int secondHighest = numbrs.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(secondHighest);

        List<String> students =
                Arrays.asList("Rahul", "Amit", "Jonathan", "Priya", "Christopher");
        List<String> largest = students.stream().filter(s -> s.length() > 5).toList();
        System.out.println(largest);

        List<Employee> employees1 = Arrays.asList(
                new Employee("Rahul", 25, 50000),
                new Employee("Amit", 30, 75000),
                new Employee("Sneha", 28, 65000),
                new Employee("Priya", 32, 90000)
        );

        Optional<Integer> salary = employees1.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList().stream().skip(1).findFirst();
        System.out.println("Second highest: " + salary.get());

        List<Employee> emp = getEmployees();
        Map<String, Optional<Employee>> hm = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(hm);

        //sort employees Using Comparator & Streams
        List<Employee> sortedEmployee = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println("Sorted Employee on the basis of reversed salary :" + sortedEmployee);

        List<Employee> sortByDepartmentAndSalary = emp.stream().sorted(
                Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)
        ).toList();
        System.out.println("Sorted Employee on the basis of Department first then salary :" + sortByDepartmentAndSalary);


        //Filter the Duplicates
        int[] nbrs = {1, 2, 3, 4, 2, 5, 1, 6, 3};
        HashSet<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(nbrs).boxed().filter(a -> !seen.add(a)).collect(Collectors.toSet());
        System.out.println(duplicates);

        //Find the first non repeating character in a String
        String str = "swiss";
        Character unique = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First Non Repeating Character:" + unique);

        //Reverse the String using the Streams
        String sting = "Palindrome";
        String reversed = IntStream.range(0, sting.length())
                .mapToObj(i -> sting.charAt(sting.length() - i - 1))
                .map(String::valueOf).collect(Collectors.joining());
        System.out.println(reversed);

        //find how many characters are there in a String
        String example = "Indians India";
        long length = example.chars().filter(c -> c != ' ').count();
        System.out.println("Characters except space:" + length);

        String pq = "fingegoengegeonwfwofnw";
        //count the frequency of Every Character
        Map<Character, Long> freq = pq.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(freq);

        List<Employee> sortUsingStreams = emp.stream().sorted(Comparator.comparing(Employee::getDepartment)
                .thenComparing(Employee::getSalary)).toList();
        System.out.println(sortUsingStreams);

        List<Employee> NthHighestSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(3).toList();

        //3rd Highest Salary
        List<Employee> thirdHighestSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().stream().toList();

        Integer thirdHighSalary = emp.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        System.out.println("Third Highest Salary:" + thirdHighSalary);
        System.out.println("------------------------------------------------------------------------------------------------");

        //Grouping of Employees by Department
        Map<String, List<Employee>> map = emp.stream().collect(
                Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Grouping of Employees by Department:" + map);
        System.out.println("------------------------------------------------------------------------------------------------");

        //Group Employee Names by Department
        Map<String, List<String>> map1 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Group Employee Names by Department" + map1);

        System.out.println("------------------------------------------------------------------------------------------------");
        //Group Employee Salaries by Department
        Map<String, List<Integer>> map2 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toList())));
        System.out.println("Group Employee Salaries by Department" + map2);
        System.out.println("------------------------------------------------------------------------------------------------");

        //Convert List of Employees to Map
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 80000, 12, "IT"),
                new Employee(2, "Bob", 60000, 43, "HR"),
                new Employee(3, "Alice", 90000, 25, "IT")
        );
        Map<Integer, String> map3 = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(map3);
        System.out.println("------------------------------------------------------------------------------------------------");

        // //Convert List of Employees to Map (Duplicate key)
        List<Employee> employs = Arrays.asList(
                new Employee(1, "Alice", 80000, 12, "IT"),
                new Employee(2, "Bob", 60000, 43, "HR"),
                new Employee(1, "Alice", 90000, 25, "IT")
        );

        Map<Integer, Employee> map4 = employs.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (OldVal, NewVal) -> NewVal));
        System.out.println(map4);
        System.out.println("------------------------------------------------------------------------------------------------");

        //Remove Duplicate Employees
        List<Employee> emplys = Arrays.asList(
                new Employee(1, "Alice", 80000, 12, "IT"),
                new Employee(2, "Bob", 60000, 43, "HR"),
                new Employee(1, "Alice", 90000, 25, "IT"),
                new Employee(2, "Bob", 70000, 43, "HRs"),
                new Employee(3, "Bob", 65000, 43, "ADM")
        );

        List<Employee> employee2 = emplys.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (old, newval) -> newval)).values().stream().toList();
        System.out.println(employee2);

        String strs = "hello world";
        long cnt = strs.chars().filter(c -> Character.isLetter(c) && "aeiou".indexOf(c) != -1).count();
        System.out.println(cnt);

        //Sum of Even Numbers

        int sums = numbers.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Even Numbers:" + sums);

        System.out.println("------------------------------------------------------------------------------------------------");
        List<Employee> empl = Arrays.asList(
                new Employee("Rahul", 25, 50000),
                new Employee("Amit", 30, 75000),
                new Employee("Sneha", 28, 65000),
                new Employee("Priya", 32, 90000)
        );

        Optional<Employee> result = empl.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employee with the Maximum salary:" + result);

        Double maxSalary = empl.stream().mapToDouble(Employee::getSalary).max().orElse(0);
        List<Employee> employees2 = empl.stream().filter(e -> e.getSalary() == maxSalary).toList();
        System.out.println("Employees with the max Salary:" + employees2);


        List<Integer> nbers = Arrays.asList(
                10, 25, 11, 13, 45, 17, 21, 31
        );
        List<Integer> results = nbers.stream().filter(n -> String.valueOf(n).startsWith("1")).toList();
        System.out.println(results);
    }
}
    