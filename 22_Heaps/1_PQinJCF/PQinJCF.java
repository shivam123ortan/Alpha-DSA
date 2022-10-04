/*
    Priority queues in JCF
    1. add() -> O(logn)
    2. remove() -> O(logn)
    3. peek() -> O(1)  

    * By default PQ is arranged in ascending.

 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQinJCF {
    
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for reverse
        
        pq.add(3); // O(log(n))
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(n)
            pq.remove(); // O(log(n))
        }
    }
}