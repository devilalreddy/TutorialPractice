package algorithms;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static Object getMethod(int x) {

        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        } else if (x % 3 == 0) {
            return "Fizz";
        } else if (x % 5 == 0) {
            return "Buzz";
        } else
            return x;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //  System.out.println(s.hasNextInt());
        System.out.println("Enter how many  Numbers you need :");
        IntStream.rangeClosed(1, s.nextInt()).
                mapToObj(FizzBuzz::getMethod).
                forEach(System.out::println);


    }

}