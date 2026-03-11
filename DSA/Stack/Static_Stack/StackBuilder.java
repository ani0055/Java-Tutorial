package DSA.Stack.Static_Stack;

class Stack{

    int stack[] = new int[5];
    int top = 0;

    public void push(int Data){

        if(top == 5) System.out.println("Stack is full");

        else{
            stack[top] = Data;
            top++;
        }
       
    }

    public void pop(){
        if(isEmpty()) System.out.println("Stack is Empty");
        else{
            top--;
            System.out.println("Poping Element " + stack[top]);
            stack[top] = 0;
        }
           
    }

    public void peek(){
        System.out.println("Peeking Element " + stack[top-1]);
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        }

        else return false;
    }

    public void Show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
public class StackBuilder {
    public static void main(String[] args) {
        Stack nums = new Stack();
        System.out.println( "Empty : " + nums.isEmpty());
        nums.push(12);
        nums.push(15);
        nums.push(20);
        nums.push(26);
        System.out.println( "Empty : " + nums.isEmpty());
        nums.Show();
        System.out.println("Size of Stack is : "+ nums.size());
        nums.pop();
        System.out.println("Size of Stack is : "+ nums.size());
        nums.peek();
        nums.Show();
        nums.push(61);
        nums.Show();
        nums.push(86);
        nums.Show();
        nums.push(95);
    }
}
