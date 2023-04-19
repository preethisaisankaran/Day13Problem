package com.day13problem;

public class Generic{
    public void Float(Float a, Float b, Float c) {
      if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
          System.out.println("a is greater " + a);
        } else if (b.compareTo(c) > 0) {

          System.out.println("b is greater " + b);
      } else {
          System.out.println("c is greater ");

     }


    }



    public static void main(String[] args) {
        Generic gen = new Generic();
        gen.Float(4.5f,2.5f,3.8f);



    }
}

