/*
    HashMap is made from Array of LinkedList(as Buckets).
 */
/*
    PUT
    1. For the given pair (key,value) get the hashvalue
    2. HashValue will give the bucket index(bi) then iterate over
        LL of that bucket
    3. if found -> Update
       else -> add new node in LL
 */
import java.util.*;
import java.util.List;


public class HashMapCode {

    static class HashMap<K,V> { // generic (when the type of data is not fixed)

        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // size
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }

            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for(int i=0; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            	int bi = hashFunction(key); // bucket index (0 ot 3)
                int di = SearchInLL(key); // valid; -1

                if(di != -1){
                    Node node = bucket[bi].get(di);
                    node.value = value;
                } else {
                    buckets[bi].add(new Node(key, value));
                    n++;
                }

                double lambda = (double)n/N;
                if(lambda > 2.0){
                    rehash();
                }
        }

        public boolean containsKey(K key){
            return false;
        }

        public V remove(K key){
            return null;
        }

        public V get(K key){
            return null;
        }

        public 
        
    }
    public static void main(String[] args) {
        
    }    
}
