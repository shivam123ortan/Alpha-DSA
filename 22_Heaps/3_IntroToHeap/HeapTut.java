/*
    Heap are of two types-
    1. Max heap
    2. Min heap

    PROPERTIES
    1. Heap is always a binary tree that is at most 2 children
    2. Heap is complete binary tree(CBT) 
        - All the levels are completely filled except posibly the 
          last one, which is filled from the left to right.
    3. Children >= Parent (maxHeap)
       Children <= Parent (minHeap)
    4. For a node if the index of a node is = i
        then, index of left child = (2i + 1)
              index of right child = (2i + 2)
    5. If child index is x then index of its parent = (x-1)/2
 */
import java.util.*;


public class HeapTut {
    
    // FOR MINHEAP
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        /*
        INSERT IN HEAP
        1. add at last index
        2. fix heap : while(child value < parent value){
                        swap(child, parent)  
                      }
        */

        // INSERT
        public void add(int data){
            // add at last index
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){ // TC -> O(log(n))
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        // PEEK
        public int peek(){
            return arr.get(0);
        }

        /*
            To delete in heap-
            1. Swap 1st and last node
            2. Remove last index
            3. Fix heap - heapify
                          take min(i, 2i+1, 2i+2) where i = root
                          swap the root with min.
         */
        // DELETE - TC -> O(log(n))
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        
        public int remove(){
            int data = arr.get(0);

            // step 1 - swap first & last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2 - delete last
            arr.remove(arr.size()-1);

            // step 3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){ // heap sort - O(nlog(n))
            System.out.println(h.peek());
            h.remove();
        }

        // done the same work as priority queue
    }    
}
