import java.util.*;
public class BinaryTreeYT{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void Preorder(Node root){
        if(root==null){
            return;

        }
        System.out.print(root.data+" ");
        Preorder( root.left);
        Preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){return;} inorder(root.left);System.out.print(root.data+" ");inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){return;} postorder(root.left);postorder(root.right);System.out.print(root.data+" ");
    }

    //level vice print
    public static void levelOrder(Node root){
        if(root ==null){return;}
       Queue <Node> q= new LinkedList<>();
       q.add(root);
       q.add(null);
       
       while(!q.isEmpty()){
        Node curr = q.remove();
        if(curr==null){
            System.out.println();
            if(q.isEmpty()){
                break;

            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
       }
    }

    public static int countOfNode(Node root){
        if(root==null){return 0;}
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);
        return leftNode + rightNode+1;
        
    }
    public static int sumOfNode(Node root){
        if(root==null){return 0;}
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum+rightSum+root.data;
    }

    public static int Height (Node root) { 
        if(root==null){return 0;}
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);
        int myHeight=Math.max(leftheight, rightheight)+1;
        return myHeight;   
    }

    
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(nodes);
       //s System.out.print(root.data);
        Preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println();
        levelOrder(root);
        System.out.println();
     //   countOfNode(root); 
        System.out.println(countOfNode(root));
        System.out.println(sumOfNode(root));
        System.out.println(Height(root));
    }
}