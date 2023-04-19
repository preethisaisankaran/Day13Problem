package com.day13problem;

public class Generic<T extends Comparable<T>> {

        T a;
        T b;
        T c;

        public Generic(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;

            T max = a;

            if (b.compareTo(max) > 0) {
                max = b;

            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            System.out.println(max);

        }


        public static void main(String[] args) {
            com.day13problem.GenericClass<Integer> intgen = new com.day13problem.GenericClass<Integer>(10,20,30);
            com.day13problem.GenericClass<Float> floatgen = new com.day13problem.GenericClass<Float>(3.5F,6.7F,8.9f);
            com.day13problem.GenericClass<String> stringgen = new com.day13problem.GenericClass<String>("Apple","Banana","Peach");





        }

    }








