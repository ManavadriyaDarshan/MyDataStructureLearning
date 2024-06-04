package org.mydatastructurelearning;

public class CustomStack {
    private Stack stack;

    //constructor
    public CustomStack(Stack st){
        this.stack=st;
    }

    public boolean deleteAll(){
        while(stack.isEmpty() != true){
            stack.pop();
        }
        return true;
    }

    public boolean deleteFromLast(int index){
        if(stack.isEmpty()){
            return false;
        }
        int n = index;
        Stack temp = new Stack();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            if(n == 0){
                temp.pop();
            }
            stack.push(temp.pop());
            n--;
        }
        return true;
    }

    public void display(){
        Stack temp = new Stack();
        System.out.print("Stack value is: ");
        while(stack.isEmpty() != true){
            temp.push(stack.pop());
        }
        while(temp.isEmpty() != true){
            System.out.print(temp.getTop()+"  ");
            stack.push(temp.pop());
        }
        System.out.println(" ");
    }

    public boolean addAt(int index,int data){
        Stack temp = new Stack();
        int  n = index;
        if (stack.isEmpty() && index != 0) {
            return false;
        } else {
            while (n != 0 && !stack.isEmpty()) {
                temp.push(stack.pop());
                n--;
            }
            if (n != 0) {
                return false; // Index out of bounds
            }
            stack.push(data);
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return true;
    }

    public boolean addAtLast(int index,int data){
        Stack temp = new Stack();
        int  n = index;
        if (stack.isEmpty() && index != 0) {
            return false;
        } else {
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            while (n != 0 && !temp.isEmpty()) {
                stack.push(temp.pop());
                n--;
            }
            stack.push(data);
            while ( !temp.isEmpty()){
                stack.push(temp.pop());
            }
        }
        return true;
    }

    public int getFromLast(int index){
        int answer = 0;
        int n = index;
        Stack temp = new Stack();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            if(n == 0){
                answer = temp.getTop();
            }
            stack.push(temp.pop());
            n--;
        }
        return answer;
    }

    public boolean addAll(int []arr){
        for(int n : arr){
            stack.push(n);
        }
        return true;
    }

    public boolean update(int find,int value){
        Stack temp = new Stack();
        if(stack.isEmpty()){
            return false;
        }
        int occuerence = 0;
        while(occuerence != find  && !stack.isEmpty()){
            occuerence = stack.pop();
            temp.push(occuerence);
        }
        temp.pop();
        stack.push(value);
        while( !temp.isEmpty()){
            stack.push(temp.pop());
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        CustomStack cst1 = new CustomStack(s1);
        int []array1 = {4,5,6,7,8,9};
        System.out.println(cst1.addAll(array1));
        cst1.display();
        System.out.println(cst1.deleteFromLast(2));
        cst1.display();
        System.out.println(cst1);
        //System.out.println(cst1.getFromLast(s1,2));
        // System.out.println(cst1.addAtLast(s1,2,100));
        // cst1.display(s1);
        //System.out.println(cst1.update(s1,5,50));
        //cst1.display(s1);
        // System.out.println(cst1.addAt(s1,1,10));
        //cst1.display(s1);
        // System.out.println(cst1.deleteAll(s1));
    }
}
