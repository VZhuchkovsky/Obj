package com.hillel.com.hillel.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by VZhuchkovsky on 23.07.2015.
 */
public class MainStream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        Function<Apple, String> appleToString = apple -> apple.getColor();

        List<String> appleColors = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                        //.limit(1)
                .map(Apple::getColor)
                        //.limit(0)
                .sorted()
                        //.limit(1)
                .collect(Collectors.toList());

        System.out.println(appleColors);

        Optional<String> maxColor
                = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .map(appleToString)
                .limit(2)
                .sorted()
                .max(Comparator.naturalOrder());

        Random random = new Random();
        int result = Stream.generate(random::nextInt)
                .limit(10)
                .mapToInt(value -> value)
                        //.sum();
                .min().orElse(0);
        System.out.println(result);


        System.out.println(maxColor.orElse("none"));

        System.out.println("Contains all green apples " +
                        apples.stream()
                                .allMatch(apple -> apple.getColor().equals("Green"))
        );
        System.out.println("Contains at least one green apple " +
                        apples.stream()
                                .anyMatch(apple -> apple.getColor().equals("Green"))
        );
        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isYellow = apple -> apple.getColor().equals("Yellow");
        Predicate<Apple> isYellowOrGreen = isGreen.or(isYellow);
        System.out.println("Contains only green or yellow apples " +
                        apples.stream()
                                .allMatch(isYellowOrGreen)
        );
        //apples.stream().forEach(apple -> System.out.println(apple));
        apples.stream().forEach(System.out::println);
    }
//book Martin ?Fauler? "Refactoring"
    //book "Sovershenniy Kod"
//book Horstman
    //book "Philosophy of Java" ("Thiking in Java")
    //book Robert ?Sedjvik? "Algoritmy i structury dannyh"
    //Study Frameworks
    /**
     * @param val input value
     * @return always false
     */
    public static boolean someMethod(int val) {

        Class classObject = Object.class.getClassLoader().loadClass("");
        Apple apple = (Apple) classObject.newInstance();
        apple.getClass().getMethods()
        return false;
    }

}
