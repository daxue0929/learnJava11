package test.java.utils.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author daxue0929
 * @date 2021/9/25
 */

public class AppleTest {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 15));
        List<Apple> resultApples = AppleTest.filterApples(apples, Apple::isGreen);
        System.out.println(resultApples.size());

    }

    public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> applePredicate) {
        ArrayList<Apple> result = new ArrayList<>();
        for (final Apple apple : list) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
