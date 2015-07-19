/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * <p/>
 * JDK 8 MOOC Lesson 1 homework
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class Lesson1 {


    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */

    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * Exercise 1
     * <p/>
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    private String exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

//        final StringBuilder result = new StringBuilder("");

        return list.stream()
                //.forEach(s -> result.append(s.charAt(0)));
                .reduce("", (a, b) -> a += b.charAt(0));
//        list.parallelStream().forEach(s -> result.append(s.toCharArray()[0]));

//        return result.toString();
    }

    /**
     * Exercise 2
     * <p/>
     * Remove the words that have odd lengths from the list.
     */
    private List<String> exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.removeIf(s -> s.length() % 2 == 1);

        return list;
    }

    /**
     * Exercise 3
     * <p/>
     * Replace every word in the list with its upper case equivalent.
     */
    private List<String> exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.replaceAll(String::toUpperCase);

        return list;
    }


    /**
     * Exercise 4
     * <p/>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private String exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);

        StringBuilder result = new StringBuilder();

        map.forEach((key, value)-> result.append(key + value));
//        map.forEach((key, value)-> result.append(key + value));

        return result.toString();
    }


    /**
     * Exercise 5
     * <p/>
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> System.out.println(list)).start();
    }
}
