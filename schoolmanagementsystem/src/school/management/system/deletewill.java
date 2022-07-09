package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class deletewill {
    public static void main(String[] args) {

//        new type of object containing multiple numbers.
//        count of numbers in array => is defined.
//        automatically allocated as need => ArrayList -> is not defined -> can allocate memory dynamically

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);

        System.out.println(numbers);
    }
}
