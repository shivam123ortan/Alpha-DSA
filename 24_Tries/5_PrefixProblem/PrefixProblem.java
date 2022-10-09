/*
    Find shortest unique prefix for every word in a given list.
    Assume no word is prefix of another.

    arr[] = {"zebra", "dog", "duck", "dove"}
    ans = {"z", "dog", "du", "dov"}
 */

public class PrefixProblem {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            freq = 1;
            // Arrays.fill(children, null);
        }
    }

    public static Node root = new Node();

    public static void insert(String word){ // TC -> O(l) where l is largest word
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt((level)) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(String i : arr){
            insert(i);
        }
        
        root.freq = -1;

        findPrefix(root, "");
    }    
}
