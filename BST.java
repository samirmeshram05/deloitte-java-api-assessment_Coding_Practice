
import java.util.*;

public class BST {
    static class Node {
        int data; Node left,right;
        Node(int data){
            this.data = data;
            this.left=null;this.right=null;
            
        }
    }
    public static Node insert(Node root, int val) {
        if(root==null) {
            root = new Node(val);return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null) {
            return;
        }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key); // Added return statement here
        }
    }

    /**
     * @param root
     * @param val
     * @return
     */
    public static Node delete(Node root, int val) {
        if(root.data>val ){
            root.left=delete(root.left, val);
        }
        else if(root.data<val) {
            root.right=delete(root.right, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;

            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }

            Node IS=inorderSuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data); 
            }
            return root;
        }
       
       
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printInRanges(Node root,int x, int y){
        if(root==null){
            return ;

        }
        if (root.data>=x && root.data<=y){
            printInRanges(root.left, x, y);
            System.out.println(root.data+" ");
            printInRanges(root.right, x, y);
        }
        else if(root.data>=y){
            printInRanges(root.left, x, y);
        }
        else{
            printInRanges(root.right, x, y);
        }
    }
    public static void printPath(BST.Node left, ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
             System.out.print(path.get(i)+"->");
        }
        System.out.println(); 
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;

        }

        path.add(root.data);
        //leaf
        if(root.left==null  && root.right== null){
            printPath(root.left,path);

        }
        else{
            printRoot2leaf(root.left,path);
            printRoot2leaf(root.right,path);

        }
        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }
        inorder(root);System.out.println();

        if(search(root,1)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

        delete(root, 5);
        inorder(root);

        System.out.println();

       printInRanges(root, 3, 10); 

       System.out.println();
       printRoot2leaf(root, new ArrayList<>());
    }
}