package org.example.simpleexamples;

import java.util.stream.Stream;

public class Main {

    public static void streamClassOne(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));
    }

    public static void main(String[] args) {
      streamClassOne();
    }
}


