package Tress;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.List;
import java.util.ListIterator;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class BaisOfTress {

    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(4);
        Node c =new Node(3);
        Node d =new Node(2);
        Node e =new Node(6);
        Node f =new Node(5);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;

        Node g = new Node(18);
        Node h = new Node(20);
        c.left=g; g.left=h;
        System.out.println("Display");
        Display(a);
        System.out.println();
        System.out.println(Sum(a));
        System.out.println(product(a));
        System.out.println(ProductOFNonZeroElement(a));

       // a.right.val=10;
       // System.out.println(c.val);
       // System.out.println(a.right.right.val);
        //System.out.println(a.right.val);

        System.out.println(maxlement(a));
        System.out.println(Minlement(a));
        System.out.println(SizeOfTree(a));
        System.out.println(levelORHeight(a));
        System.out.println("\n    Display");
        Display(a);
        System.out.println(" \n   In order");
        inOrder(a);
        System.out.println(" \n   post order");
        postOrder(a);
        System.out.println("\n    preorder");
        PreOrederTravese(a);
        System.out.println("\n Inverse of tree");
        invertTree(a);
        System.out.println("Top view :");
        topView(a);
    }

    private static void  Display(Node root){
        if(root==null) return; // Base Case
        System.out.print(root.val+" ");
        Display(root.left); // left SubTree
        Display(root.right);// right  SubTree

    }

    private static int Sum(Node root){
        if(root==null) return 0;
        return root.val+Sum(root.left)+Sum(root.right);
    }

    private  static  int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }

    private static int ProductOFNonZeroElement(Node root){
        // Base case: if the node is null, return 1
        if (root == null) return 1;
        // If the current node's value is zero, ignore it and continue
        if (root.val == 0) return ProductOFNonZeroElement(root.left) * ProductOFNonZeroElement(root.right);
        // Otherwise, include the current node's value in the product
        return root.val * ProductOFNonZeroElement(root.left) * ProductOFNonZeroElement(root.right);

    }

    private  static  int maxlement(Node root){
        if(root==null) return 0;
        return Math.max(root.val,Math.max(maxlement(root.left),maxlement(root.right)));
    }

    private  static  int Minlement(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(Minlement(root.left),Minlement(root.right)));
    }

    private  static  int SizeOfTree(Node root){
        if(root==null) return 0;
        return 1+SizeOfTree(root.left)+SizeOfTree(root.right);
    }
    private static  int levelORHeight(Node root){
        if(root==null) return -1;
        return Math.max(levelORHeight(root.left),levelORHeight(root.right))+1;
    }

   //https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
    public static void inOrder(Node root) {
        if(root==null) return; // Base Case
        inOrder(root.left); // left SubTree

        System.out.print(root.val+" ");

        inOrder(root.right);// right  SubTree

    }

    // https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
    public static void postOrder(Node root) {
        if(root==null) return; // Base Case
        postOrder(root.left); // left SubTree
        postOrder(root.right);// right  SubTree
        System.out.print(root.val+" ");
    }
    private static void PreOrederTravese(Node root){
        if(root==null) return; // Base Case
        System.out.print(root.val+" ");
        PreOrederTravese(root.left); // left SubTree
        PreOrederTravese(root.right);// right  SubTree
    }
    public static void invertTree(Node root) {
        if(root==null) return ;
        if(root.left==null && root.right==null) return ;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        System.out.print(root.val+" ");
        invertTree(root.left);
        invertTree(root.right);
    }

    public boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        else return true;


    }

    public static void topView(Node root) {
        if(root==null) return;
        System.out.println(root.val+" ");
        topView(root.right);


    }




}


