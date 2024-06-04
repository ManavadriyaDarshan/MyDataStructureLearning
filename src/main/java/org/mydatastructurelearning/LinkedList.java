package org.mydatastructurelearning;

public class LinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void add(int d){

        Node new_node = new Node(d);
        //check linkedlist is empty or not
        if(head == null){
            head = new_node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void addAll(int []arr){
        int size = arr.length;
        /*//check linkedlist is empty or not
        if(head == null){
            head = new_node0;
        }else{

        }*/
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        for(int i = 0; i < size; i++) {
            Node current = new Node(arr[i]);
            temp.next = current;
            temp = current;
        }

    }

    public void addAt(int index,int d){
        Node new_node = new Node(d);
        int count = 0;

        if (index == 0) {  // Inserting at the head
            new_node.next = head;
            head = new_node;
            return;
        }

        if(head == null){   //check linkedlist is empty or not
            head = new_node;
        }
        else{
            Node temp = head;
            while(temp.next != null && count < index-1){
                temp = temp.next;
                count++;
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }
    }

    public void addAtLast(int index,int d){
        Node new_node = new Node(d);
        Node fast = head;
        //move fast variable n time
        for(int i = 1; i < index; i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //add the node
        new_node.next = slow.next;
        slow.next = new_node;
    }

    public void get(int index){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }

        int count = 0;
        while (current != null && count < index-1){
            current = current.next;
            count++;
        }
        System.out.println(" ");
        System.out.println("Node at "+index+" is "+ current.data);
    }

    public void getFromLast(int index){
        Node fast = head;
        //move fast variable n time
        for(int i = 1; i < index; i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //print the node
        System.out.println(" ");
        System.out.println("Node at "+index+" from last is "+ slow.data);
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }else{
            System.out.println(" ");
            System.out.print("Nodes: ");
            while (current != null){
                System.out.print(current.data +" -> ");
                current = current.next;
            }
        }
    }

    public void update(int index, int d){
        Node new_node = new Node(d);
        int count = 0;
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while(temp.next != null && count < index-1){
                temp = temp.next;
                count++;
            }
            temp.data = d;
        }

    }

    public void deleteAll(){
        head = null;
    }

    public void delete(int index){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }

        int count = 0;
        while (current != null && count < index-1){
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public void deleteFromLast(int index){
        Node fast = head;
        //move fast variable n time
        for(int i = 1; i < index; i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //delete the node
        slow.next = slow.next.next;
    }

}
