package funtionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

      // case 1 only
        Function<Integer, Double> half = a ->a/2.0;

        // case 2 then
        //half = half.andThen(a-> a*3);

        // case 3 e null pointer exception
        try {
            half = half.andThen(null);
        }catch ( Exception e) {
            System.out.println("Exception thrown while passing null "+ e);
        }
        System.out.println("identify:"+ Function.identity());
        System.out.println(half.apply(10));

        //class loader test
        System.out.println("Classs Loader value :"+ FunctionalInterfaceTest.class.getClassLoader());
    }
}
