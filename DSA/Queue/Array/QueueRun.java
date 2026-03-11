package DSA.Queue.Array;

class Queue{

    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enqueue(int data){
        queue[rear] = data;
        rear = (rear+1)%5;
        size++;
    }

    public int dequeue(){
        int data = queue[front];
        front = (front+1)%5;
        size--;
        
        return data; 
    } 

    public void show(){
        for(int i =0 ; i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
    }

    public int getsize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size ==5;
    }
}

public class QueueRun {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enqueue(12);
        Q.enqueue(18);
        Q.enqueue(26);
        Q.enqueue(38);
        Q.enqueue(49);
        Q.dequeue();
        Q.enqueue(56);
        int Size = Q.getsize();
        System.out.println("Size of Queue : " + Size);
        System.out.println(Q.isFull());
       

        Q.show();
    }
}
