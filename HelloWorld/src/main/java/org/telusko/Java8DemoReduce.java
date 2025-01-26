package org.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8DemoReduce {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer *2;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer o, Integer o2) {
                return o + o2;
            }
        };

        Stream s = values.stream();
        Stream s1 = s.map(f);

        //2 4 6 8 10 12
        Integer result = (Integer) s1.reduce(0,b); //reduce takes 0 and 2 initially then adds them up.
        // Then it takes the 2 and 4 and adds them. Then 6 add 8 etc till all the numbers are added. Total is 42.
        // The reduce returned object is cast to Integer.

        System.out.println(result);

        // Can be rewritten as System.out.println(values.stream().map(integer -> integer *2).reduce(0,(c,e) -> c+e));
        // or use sum method of the Integer class.
        // System.out.println(values.stream().map(integer -> integer *2).reduce(0,(c,e) -> Integer.sum(c+e)));
        // or use method reference
        // System.out.println(values.stream().map(integer -> integer *2).reduce(0, Integer::sum));

    }

}
