package org.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class ConsImpl implements Consumer<Integer> {
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
public class Java8Demo {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer *2;
            }
        };

        //Stream s = values.stream();
        //Stream s1 = s.map(f);

        //s1.forEach((Consumer) System.out::println);
        Consumer<Integer> consumer = new ConsImpl();
        values.forEach(consumer);
        //values.forEach(i -> System.out.println(i));

    }

}
