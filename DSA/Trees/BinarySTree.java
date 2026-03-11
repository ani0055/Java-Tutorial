package DSA.Trees;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }

}

public class BinarySTree {

    Node root;
    
    public void insert(int data){

        root = insertRec(root, data);
       
    }

    public Node insertRec(Node root , int data){

         if(root == null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertRec(root.left, data);;
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void print(){
        inOrder(root);
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

            // for preOrder just changhe the order like:
            // System.out.print(root.data + " ");
            // preOrder(root.left);
            // preOrder(root.right);

            // for postOrder just changhe the order like:
            // System.out.print(root.data + " ");
            // preOrder(root.left);
            // preOrder(root.right);
        }
    }
}
