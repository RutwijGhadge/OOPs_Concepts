package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class flatMap {
    //Map vs FlatMap
    //map :  one element -> one transformed element
    public static void main(String[] args) {
        List<String> words = List.of("java", "spring");
        System.out.println(words.stream().map(String::length).toList());

        //Example 1 : List of Lists
        List<List<String>> data = List.of(
                List.of("Java", "Spring"),
                List.of("Kafka", "Redis")
        );
        System.out.println(data.stream().map(List::stream));
        System.out.println(data.stream().flatMap(List::stream).toList());

        //Example 2 : Extract all characters from words
        List<String> word = List.of("cat", "dog", "elephant");
        List<Character> results = word.stream().flatMap(wor -> wor.chars().mapToObj(c -> (char) c)).toList();
        System.out.println(results);

        //Split the sentences in words (classic use of flatmap)
        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are useful"
        );
        List<String> wording = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList();
        System.out.println(wording);


        //Q2 — Employee → Department → Unique Skills
        List<Order> orders = List.of(

                new Order("Order1", List.of(
                        new OrderItem("Laptop", 2),
                        new OrderItem("Mouse", 5)
                )),

                new Order("Order2", List.of(
                        new OrderItem("Laptop", 4),
                        new OrderItem("Keyboard", 3)
                )),

                new Order("Order3", List.of(
                        new OrderItem("Mouse", 6)
                ))
        );
        String topProduct = orders.stream().flatMap(order -> order.getItems().stream())
                .collect(Collectors.groupingBy(OrderItem::getProduct,
                        Collectors.summingInt(OrderItem::getQuantity))
                ).entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);
        System.out.println(topProduct);
    }

    /*
    map()
     ↓
   1 element → 1 element

    flatMap()
        ↓
    1 element → multiple elements
        ↓
    Flatten into one Stream
-----------------------
    For your Streams interview questions, look for these keywords:
    List inside a List
    Collection inside an object
    Split a string
    Extract characters
    Nested collections
    One input producing multiple outputs
     */
}
//Ask - Does each element contain a collection, array, stream, or multiple values that I need to process individually? If Yes -> use flatMap