package com.day13problem;

public class Generic1
package com.day13problem;
//
public class Generic {
//
////    public void Integer(Integer a, Integer b, Integer c) {
////        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
////            System.out.println("a is greater " + a);
////        } else if (b.compareTo(c) > 0) {
////
////            System.out.println("b is greater " + b);
////        } else {
////            System.out.println("c is greater ");
////
////        }
////    }
////
////    public void Float(Float a, Float b, Float c) {
////        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
////            System.out.println("a is greater " + a);
////        } else if (b.compareTo(c) > 0) {
//
////            System.out.println("b is greater " + b);
////        } else {
////            System.out.println("c is greater ");
////
////        }
////
////
////    }
////
////    public void String(String a, String b, String c) {
////        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
////            System.out.println("a is greater " + a);
////        } else if (b.compareTo(c) > 0) {
////
////            System.out.println("b is greater " + b);
////        } else {
////            System.out.println("c is greater ");
////
////        }

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



