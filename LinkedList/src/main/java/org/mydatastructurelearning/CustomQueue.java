package org.mydatastructurelearning;

public class CustomQueue {
    private Queue queue;

    //Constructor
    public CustomQueue(Queue queue1){
        this.queue = queue1;
    }

    public boolean addFromFront(int index,int data){
        Queue temp = new Queue();
        int  position = index;
        if (queue.isEmpty() && index != 0) {
            return false;
        } else {
            while (position != 0 && !queue.isEmpty()) {
                temp.push(queue.pop());
                position--;
            }
            if (position != 0) {
                return false; // Index out of bounds
            }
            temp.push(data);
            while (!queue.isEmpty()){
                temp.push(queue.pop());
            }
            while (!temp.isEmpty()) {
                queue.push(temp.pop());
            }
        }
        return true;
    }

    public boolean addAll(int []arr){
        for(int n : arr){
            queue.push(n);
        }
        return true;
    }

    public void display(){
        if(queue.isEmpty() == true){
            System.out.println("Queue is empty");
        }else {
            Queue temp = new Queue();
            System.out.print("Queue value is: ");
            while(queue.isEmpty() != true){
                temp.push(queue.pop());
            }
            while(temp.isEmpty() != true){
                System.out.print(temp.peek()+"  ");
                queue.push(temp.pop());
            }
            System.out.println(" ");
        }
    }

    public int getFromLast(int index){
        if(queue.isEmpty()){
            return -1;
        }  else {
            Queue temp = new Queue();
            int count = 0;
            int answer = 0;
            while (queue.isEmpty() != true) {
                count++;
                temp.push(queue.pop());

            }
            for(int i = 1; i <= count; i++){
                if( i == count-index){
                    answer = temp.pop();
                    queue.push(answer);
                }else{
                    queue.push(temp.pop());
                }
            }
            return answer;
        }
    }

    public int get(int index){
        if(queue.isEmpty()){
            return -1;
        }  else {
            Queue temp = new Queue();
            int count = 0;
            int answer = 0;
            while(queue.isEmpty() != true){
                temp.push(queue.pop());
                count++;
            }
            if(count < index){
                return -1;
            }else{
                for(int i = 0; i <= count; i++){
                    if(i == index){
                        answer = temp.pop();
                        queue.push(answer);
                    }else {
                        queue.push(temp.pop());
                    }
                }
                return answer;
            }
        }
    }

    public boolean update(int find,int value){
        Queue temp = new Queue();
        boolean found = false;

        while (!queue.isEmpty()) {
            int current = queue.pop(); // Using remove instead of poll
            if (current == find && !found) {
                temp.push(value); // Replace the first occurrence
                found = true;
            } else {
                temp.push(current);
            }
        }

        // Restore the original queue
        while (!temp.isEmpty()) {
            queue.push(temp.pop());
        }
        return found;
    }

    public boolean deleteAll(){
        while(queue.isEmpty() != true){
            queue.pop();
        }
        return true;
    }

    public boolean deleteAt(int index){
        if(queue.isEmpty()){
            return false;
        }
        int position = index;
        Queue temp = new Queue();
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        while(!temp.isEmpty()){
            if(position == 0){
                temp.pop();
            }
            queue.push(temp.pop());
            position--;
        }
        return true;
    }

    public boolean deleteLast(){
        if(queue.isEmpty()){
            return false;
        }  else {
            Queue temp = new Queue();
            int count = 0;
            while (queue.isEmpty() != true) {
                count++;
                temp.push(queue.pop());

            }
            for(int i = 1; i < count; i++){
                queue.push(temp.pop());
            }
            return true;
        }
    }

    public boolean deleteFromLast(int index){
        if(queue.isEmpty()){
            return false;
        }  else {
            Queue temp = new Queue();
            int count = 0;
            while (queue.isEmpty() != true) {
                count++;
                temp.push(queue.pop());

            }
            for(int i = 1; i <= count-index; i++){
                queue.push(temp.pop());
            }
            temp.pop();
            while(temp.isEmpty() != true){
                queue.push(temp.pop());
            }
            return true;
        }
    }


    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        queue1.push(5);
        queue1.push(6);
        CustomQueue customQueue1 = new CustomQueue(queue1);
        customQueue1.display();

        System.out.println(customQueue1.get(2));
        customQueue1.display();
    }
}
