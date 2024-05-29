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

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
    }
}
