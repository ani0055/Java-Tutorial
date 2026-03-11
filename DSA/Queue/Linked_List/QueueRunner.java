package DSA.Queue.Linked_List;

class Node{
    int data;
    Node next; 

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue{
    private Node Head = null;
    private Node Tail = null;
    
    public void enqueue(int data){
        Node n = new Node(data);
        n.data = data;
        n.next = null;

        if(Head == null){
            Head = n;
            Tail = n;
        }
        else{
            Tail.next = n;
            Tail = n;
        }
    }

    public int dequeue(){
        if(Head == null){
            System.out.println("Error Queue is Empty");
            return -1;
        }
        int data = Head.data;
        Head = Head.next;
        
        if(Head == null){
            Tail = null;
        }

        return data;
    }

    public void show(){
        if(Head == null){
            System.out.println("Queue is Empty");
        }
        Node N = Head;
        while(N != null){
            System.out.print(N.data + " -> ");
            N = N.next;
        }
    }

    public boolean isEmpty(){
        return Head == null;
    }
}

public class QueueRunner {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enqueue(16);
        Q.enqueue(29);
        Q.enqueue(37);
        Q.enqueue(42);
        Q.enqueue(56);
        Q.show();

        int d = Q.dequeue();
        System.err.println("Dequeud Element : "+ d);
        Q.show();
    }
}
