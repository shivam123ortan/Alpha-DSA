/*
    Deque - Double ended queue
    Dequeue - verb, action, method (to remove an element from queue)
    Enqueue - to add element in queue

    DEQUE - addFirst() 
            addLast()
            removeFirst()
            removeLast()
            getFirst()
            getLast()

    *DEQUE is interface in java collection framework
 */

import java.util.*;
import java.util.LinkedList;


public class DoubleEnded {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First ele: " + deque.getFirst());
        System.out.println("Last ele: " + deque.getLast());
    }
}
