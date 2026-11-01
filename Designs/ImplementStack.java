// 155. Implement Stack using Queue
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ImplementStack{
    public static void main(String[] args){
        QueueStack stack = new QueueStack();
        stack.push(4);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}

class QueueStack{
    Queue<Integer> queue;
    public QueueStack(){
        queue = new LinkedList<>();
    }
    public void push(int x){
        queue.add(x);
        int size = queue.size();
        for(int i = 0;i < size - 1; i++){
            queue.add(queue.poll());
        }
    }
    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
}