package funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        List<String> myUsedNames = Arrays.asList("Devilal", "Reddy", "Police", "Simpu","Dev", "Babiku","DevilalPolice","DevilalReddy");
        Predicate<String> values = (separable) ->separable.startsWith("D");

        for (String storage : myUsedNames) {
            if (values.test(storage))
                System.out.println(storage);
        }
    }
}
