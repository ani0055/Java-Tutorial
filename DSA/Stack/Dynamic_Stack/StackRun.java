package DSA.Stack.Dynamic_Stack;

class DStack{
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int Data){
        if(size() == capacity) expand();
        stack[top] = Data;
        top++;
    }

    public void pop(){
        if(isEmpty()) System.out.println("Stack is Empty");
        else{
            top--;
            System.out.println("Poping Element " + stack[top]);
            stack[top] = 0;
            shrink();
        }
        
        
    }

    private void expand(){
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity = capacity*2;
    }

    private void shrink(){
        int length = size();
        if(length<=(capacity/2)/2) capacity = capacity/2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
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
public class StackRun {
    public static void main(String[] args) {
        DStack nums = new DStack();

        nums.push(6);
         nums.push(16);
         nums.Show();
          nums.push(24);
           nums.push(32);
            nums.push(48);
             nums.push(52);
              nums.Show();
               nums.push(66);
                nums.Show();
                 nums.pop();
                  nums.pop();
                   nums.Show();
                    nums.pop();
                     nums.pop();
                      nums.pop();
                       nums.Show();
    }
}
