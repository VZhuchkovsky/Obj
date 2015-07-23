package com.hillel.com.hillel.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by MFarsikov on 20.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

      /*  UnaryOperator<Apple> appleReplacer = new UnaryOperator<Apple>() {
            @Override
            public Apple apply(Apple apple) {
                return new Apple(apple.getWeight() / 2, apple.getColor());
            }
        }; */
        //UnaryOperator<Apple> appleReplacer = apple -> new Apple(apple.getWeight() / 2, apple.getColor());

       // apples.replaceAll(appleReplacer);

       // java8StyleSort(apples);

        Function<String, String> addHeader = s -> "Hello, " + s;
        UnaryOperator<String> addFooter = s -> s + ". Vlad.";
        Function<String, String> replaceMissprints = s -> s.replace("javav", "java");

        Function<String, String> textProcessor = addHeader.andThen(addFooter).andThen(replaceMissprints);//standard order
        System.out.println(textProcessor.apply("I'm learining javav8"));

        textProcessor = addHeader.compose(addFooter).compose(replaceMissprints); //reverse order
    }

    private static void composingPredicates(List<Apple> apples) {
        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 120;
        Predicate<Apple> isHeavyAndGreen = isGreen.negate().and(isHeavy);
        List<Apple> greenAndHeavyApples = filter(apples, isHeavyAndGreen);

        greenAndHeavyApples.forEach(System.out::println);
    }

    private static void replacingConsumerByMethodRef(List<Apple> apples) {
        for (Apple apple : apples){
            System.out.println(apple);
        }

        apples.forEach(apple -> System.out.println(apple));
        apples.forEach(System.out::println);
    }

    private static void comparingUsingLambdas(List<Apple> apples) {
        Comparator<Apple> appleComparator = Main::compareApplesByWeight;

        appleComparator = (Apple o1, Apple o2) ->  Integer.compare(o1.getWeight(), o2.getWeight());

        apples.sort(appleComparator);

        System.out.println(apples);
    }

    public static int compareApplesByWeight(Apple o1, Apple o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }

    private static void filterNumbersExample() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        Predicate<Integer> evenFilter = i -> i % 2 == 0;
        List<Integer> evenNumbers = filter(integers, evenFilter);

        System.out.println(evenNumbers);
    }

    private static void appleExample() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        List<Apple> greenApples = filter(apples, new ColorFilter());


        Predicate<Apple> weightFilter = new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 120;
            }
        };
        List<Apple> heavyApples = filter(apples, weightFilter);

        heavyApples = filter(apples, a -> a.getWeight() > 120);
        greenApples = filter(apples, a -> a.getColor().equals("Green"));
        List<Apple> heavyAndGreen = filter(apples, Main::isHeavyAndGreen);


        System.out.println(greenApples);
        System.out.println(heavyApples);
    }

    public static boolean isHeavyAndGreen(Apple apple){
        return apple.getWeight() > 120 && apple.getColor().equals("Green");
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredItems;
        filteredItems = new ArrayList<>();
        for (T apple : list) {
            if (predicate.test(apple)) {
                filteredItems.add(apple);
            }
        }
        return filteredItems;
    }

    private static List<Apple>  filterGreenApples(List<Apple> apples) {
        List<Apple> greenApples;
        greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if ("Green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static List<Apple>  filterHeavyApples(List<Apple> apples) {
        List<Apple> greenApples;
        greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (120 < apple.getWeight()) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static void java8StyleSort(List<Apple> apples) {
        Comparator<Apple> weightComparator = (Apple o1, Apple o2) ->  Integer.compare(o1.getWeight(), o2.getWeight());
        weightComparator = Main::compareApplesByWeight;

        Function<Apple, String> extractColor = apple -> apple.getColor();
        extractColor = Apple::getColor;

        Comparator<Apple> colorComparator = Comparator.comparing(apple -> apple.getColor());
        colorComparator = Comparator.comparing(Apple::getColor);

        Comparator<Apple> compareByWeightThenByColor = weightComparator.thenComparing(colorComparator);

        apples.sort(Comparator.comparingInt(Apple::getWeight));

        apples.sort(compareByWeightThenByColor);

        apples.forEach(System.out::println);
    }

    private static void oldStyleSort(List<Apple> apples) {
        Comparator<Apple> comparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        };

        Collections.sort(apples, comparator);
    }
}