package DSA.LinkedList.Doubly;


class Node{
    int Data;
    Node next;
    Node prev;
}

class DoublyLinkedList{
    Node Head;

    public void InsertAtStart(int data){
        Node node = new Node();
        node.Data = data;
        node.next = null;
        node.prev = null;

        if(Head == null){
            Head = node;
        }

        else{
            node.next = Head;
            Head.prev = node;
            Head = node;
        }
    }

    public void InsertAtEnd(int data){
        Node node = new Node();
        node.Data = data;
        node.next = null;
        node.prev = null;

        if(Head == null){
            Head = node;
        }
        else{
            Node n = Head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

   public void InsertAtAnyPosition(int data, int index) {
        if (index == 0) {
            InsertAtStart(data);
            return;
        }

        Node n = Head;
        for (int i = 0; i < index - 1 && n != null; i++) {
            n = n.next;
        }

        if (n == null) {
            System.out.println("Index out of range");
            return;
        }

        Node node = new Node();
        node.Data = data;

        node.next = n.next;
        node.prev = n;

        if (n.next != null) {
            n.next.prev = node;
        }

        n.next = node;
    }


    public void DeleteAt(int index){

        if (Head == null) return;
        
        if (index == 0) { // delete head
             Head = Head.next;
            if (Head != null) Head.prev = null;
            return;
        }

        else{
            Node n = Head;
            for (int i = 0; i < index && n != null; i++) {
            n = n.next;
            }
            if (n == null) return; // index out of range

            if (n.next != null) {
            n.next.prev = n.prev;
            }
            if (n.prev != null) {
            n.prev.next = n.next;
            }
        }
    }
    public void Print(){
        if (Head == null) {
        System.out.println("List is empty");
        return;
        }

        else{
            Node n = Head;
            while(n.next != null){
            System.out.print(n.Data + " <--> ");
            n = n.next;
            }
            System.out.print(n.Data);
        }
        
    }
}
public class DoublyCode {
    public static void main(String[] args) {
        DoublyLinkedList List = new DoublyLinkedList();
        List.InsertAtStart(56);
        List.InsertAtStart(25); 
        List.InsertAtStart(18);
        List.InsertAtStart(12);

        List.InsertAtEnd(64);
        List.InsertAtEnd(81);

        List.InsertAtAnyPosition(16, 1);

        List.DeleteAt(1);
        
        List.Print();
    }
}
