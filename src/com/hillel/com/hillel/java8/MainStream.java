package com.hillel.com.hillel.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
                .sorted()
                //.limit(1)
                .collect(Collectors.toList());

        System.out.println(appleColors);
    }
}
