package cs271.hw.liststackqueue.driver;

import cs271.hw.liststackqueue.SinglyLinkedList;

public class Tester{

   public static void main(String arg[]){

      cs271.hw.liststackqueue.SinglyLinkedList<String> x;
      x = new cs271.hw.liststackqueue.SinglyLinkedList<String>();
      System.out.println(x.isEmpty());
      x.add("A");
      System.out.println(x.isEmpty());

   }

}
