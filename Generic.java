package com.day13problem;

public class Generic{
    public static <E extends Comparable> void printArray(E a, E b, E c) {
        E max = a;

        if (b.compareTo(max) > 0) {
            max = b;

        }
       if (c.compareTo(max) > 0) {
           max = c;
       }
       System.out.println(max);
   }





    public static void main(String[] args) {
        Generic gen = new Generic();
        gen.printArray(100, 500, 700);
        gen.printArray(3.5f, 6.8f, 2.5f);
        gen.printArray("Apple", "Peach", "Banana");




    }
}

