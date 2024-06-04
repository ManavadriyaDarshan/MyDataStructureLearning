package org.mydatastructurelearning;

public class Queue implements LinearDSA {
    static final int max = 50;
    private int array[] = new int[max];
    private int front = -1;
    private int rear = -1;

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public boolean push(int data){
        if(rear == max-1){
            System.out.println("queue is over flow");
            return false;
        }

        if (front == -1) {
            front++;
        }
        rear++;
        array[rear] = data;

        return true;
    }

    public int pop(){
        int temp = -1;
        if (isEmpty()){
            System.out.println("Queue is underflow");
            return -1;
        }
        temp = array[front];
        if (front == rear) {
            front = -1;
            rear = -1;
            return temp;
        }
        front++;
        return temp;
    }

    public int peek(){
        if (front == -1){
            System.out.println("Queue is underflow");
            return -1;
        }
        return array[front];
    }

    public static void main(String[] args) {
        Queue queue1 = new Queue();
        System.out.println(queue1.isEmpty());
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        queue1.push(5);
        queue1.push(6);
        System.out.println(queue1.pop());
        System.out.println(queue1.peek());
    }

}
