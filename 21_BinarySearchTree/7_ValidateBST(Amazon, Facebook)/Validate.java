import java.io.ObjectInputFilter.Status;

/*
    Approach 1: If the Inorder traversal is sorted then BST is valid

    Approach 2: Check if max value in left subtree < node
                and min value in right subtree > node.
                -> Comparing predecessor and successor with nodes of BST

                ->APPROACH
                -If left subtree then min = -Inf
                                      max = root or parent
                -If right subtree then min = root or parent
                                       max = Inf
 */

public class Validate {
    
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

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) 
                && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
