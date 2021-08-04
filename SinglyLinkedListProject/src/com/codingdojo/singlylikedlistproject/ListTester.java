package com.codingdojo.singlylikedlistproject;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        System.out.println("before remove");
        sll.printValues();
        sll.remove();
        System.out.println("after 1st remove");
        sll.printValues();
        sll.remove();
        System.out.println("after 2nd remove");
        sll.printValues();
        System.out.println(sll.find(10));
        sll.removeAt(1);
        sll.printValues();
    }
}

