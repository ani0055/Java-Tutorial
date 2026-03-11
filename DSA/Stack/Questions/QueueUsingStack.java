package DSA.Stack.Questions;

import java.util.*;

class MyQueue {
    private Stack<Integer> input;   // For push operations
    private Stack<Integer> output;  // For pop/peek operations

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        // Transfer elements only when output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        // Transfer elements only when output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

// Test class
public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        
        // Test operations
        queue.push(1);
        queue.push(2);
        queue.push(3);
        
        System.out.println("Peek: " + queue.peek()); // Should be 1
        System.out.println("Pop: " + queue.pop());   // Should be 1
        System.out.println("Pop: " + queue.pop());   // Should be 2
        
        queue.push(4);
        
        System.out.println("Pop: " + queue.pop());   // Should be 3
        System.out.println("Pop: " + queue.pop());   // Should be 4
        System.out.println("Empty: " + queue.empty()); // Should be true
    }
}