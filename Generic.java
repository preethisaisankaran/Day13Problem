package com.day13problem;

public class Generic{

   public void Integer(Integer a, Integer b, Integer c) {
       if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
           System.out.println("a is greater " + a);
       } else if (b.compareTo(c) > 0) {

           System.out.println("b is greater " + b);
       } else {
           System.out.println("c is greater " +c);

      }
   }


    public static void main(String[] args) {
        Generic gen = new Generic();
        gen.Integer(30,67,200);



    }
}

