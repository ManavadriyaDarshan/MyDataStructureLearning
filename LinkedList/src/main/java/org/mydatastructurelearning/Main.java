package org.mydatastructurelearning;


import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
       /* list1.addAt(1,-1);
        list1.display();

        list1.get(3);

        list1.update(3,10);

        list1.display();

        list1.delete(3);
        list1.display();

        list1.deleteAll();
        list1.display();

        list1.deleteFromLast(2);
        list1.display();

        list1.getFromLast(2);

        list1.addAtLast(2,10);
        list1.display(); */

        int []a = {15,20,30};
        list1.addAll(a);
        list1.display();
    }
}