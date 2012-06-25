package com.mycompany.app;

import com.mycompany.app.SinglyLinkedList;

public class Tester{

   public static void main(String arg[]){

      SinglyLinkedList<String> x;
      x = new SinglyLinkedList<String>();
      System.out.println(x.isEmpty());
      x.add("A");
      System.out.println(x.isEmpty());

   }

}
