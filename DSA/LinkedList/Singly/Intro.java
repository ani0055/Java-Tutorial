package DSA.LinkedList.Singly;

class Node{
    int data;
    Node next;
}

class SinglyLinkedList{
    Node Head;

    public void InsertatEnd(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(Head == null){
            Head = node;
        }

        else{
            Node n = Head;
            while(n.next != null){
                n = n.next;
            }

            n.next = node;
        }
    }

    public void InsertatStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = Head;
        Head = node;
    }

    public void InsertatAnyPosition(int data, int index){

        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index == 0){
            InsertatStart(data);
        }
        else{
            Node n = Head;
            for(int i = 0 ; i<index-1 ; i++){
            n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }


    public void Show(){

        Node node = Head;

        while(node.next != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void DeleteAt(int index){
        if(index == 0){
            Head = Head.next;
        }
        else{
            Node n = Head;
            Node n1 = null;
            for(int i = 0 ; i<index-1 ; i++){
            n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;

            System.out.println(n1.data + " deleted");

            n1 = null;

        }
    }
}

public class Intro {
     public static void main(String[] args) {
        SinglyLinkedList List = new SinglyLinkedList();
        List.InsertatStart(1);
        List.InsertatEnd(5);
        List.InsertatEnd(15);
        List.InsertatEnd(12);
        List.InsertatAnyPosition(16, 3);
        List.InsertatEnd(21);
        List.InsertatEnd(13);

        List.DeleteAt(3);

        List.Show();
    }
}
