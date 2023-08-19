package org.example.arrays;

import java.util.ArrayList;

public class LambdaArrays {

    interface StringFunction {
        String run(String str);
    }


     public static void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.println(result);
        }



    public static void forEach(ArrayList<Integer> numbers) {
          numbers.forEach( (n) -> { System.out.println(n); } );

    }



        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(5);
            numbers.add(9);
            numbers.add(8);
            numbers.add(1);

            forEach(numbers);

            StringFunction exclaim = (s) -> s + "!";
            StringFunction ask = (s) -> s + "?";
            printFormatted("Hello", exclaim);
            printFormatted("Hello", ask);

        }

}
