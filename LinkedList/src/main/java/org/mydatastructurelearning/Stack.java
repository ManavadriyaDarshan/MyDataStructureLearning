package org.mydatastructurelearning;

public class Stack {
    static final int max = 50;
    private final int[] array = new int[max];
    private int top=-1;


    public boolean push(int d){
        if(top > max-1){
            System.out.println("Stack is overflow");
            return false;
        }
        array[top+1] = d;
        top++;
        return true;
    }

    public int pop(){
        int temp = array[top];
        top--;
        return temp;
    }

    public int getTop(){
        return array[top];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.push(1));
        System.out.println(st.push(2));
        System.out.println(st.getTop());
        System.out.println(st.pop());

    }
}
