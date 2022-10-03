/*
    Range will be given as k1 to k2.

    case 1: When k1 <= root <= k2
            Then we travel left subroot and right subroot
    case 2: When root > k2
            Then we travel only right subroot
    case 3: When root < k1
            Then we travel only left subroot
 */

public class PrintInRange {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else { 
            //right subtree 
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    /*------------------------------------------------*/
    
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        // Case 1
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // Case 2
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        // Case 3
        else { 
            printInRange(root.right, k1, k2);
        }
    }
    
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        printInRange(root, 5, 11);
    }    
}
