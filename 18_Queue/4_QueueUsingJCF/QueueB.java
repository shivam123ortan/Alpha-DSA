import java.util.*;
import java.util.LinkedList;

public class QueueB {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        // Queue jo hota hai vo interface hota hai
        // isiliye interface ka object hmlog nhi bna skte
        // that's why jo queue ko implement krta hai uski 
        // class bna skte hai viz. LL & ArrayDeque.

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);



        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
