package DSA.Trees;
// The left node of A Binary Tree has value less than the root node 
// and the right node has value greater than root node

public class BinSearchTree {
    public static void main(String[] args) {
        BinarySTree Tree = new BinarySTree();

        Tree.insert(10);
        Tree.insert(12);
        Tree.insert(6);
        Tree.insert(16);
        Tree.insert(8);
        Tree.insert(9);

        Tree.print();

    }
}
